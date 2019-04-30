import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
data class Customer(val id: Int, val name: String, val email: String, val source: String = "direct")

fun main(args: Array<String>) {

    val customer = Json.stringify(Customer.serializer(), Customer(1, "Mary Jane", "mary.jane@domain.com"))

    println(customer)


    val customers = listOf(
        Customer(1, "Customer 1", "customer1@domain.com", "indirect"),
        Customer(2, "Customer 2", "customer2@domain.com")

    )

    println(Json.stringify(Customer.serializer().list, customers))


    val json = "{\"id\":1, \"name\":\"Mary Jane\",\"email\":\"mary.jane@domain.com\"}"

    val obj = Json.parse(Customer.serializer(), json)

    println(obj)
}