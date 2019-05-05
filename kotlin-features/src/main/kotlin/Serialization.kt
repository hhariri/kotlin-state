import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
data class Customer(
    val id: Int,
    val name: String,
    val email: String,
    val source: String = "direct")

val customer = Customer(1, "Mary Jane", "mary.jane@domain.com")

val customers = listOf(
    Customer(1, "Customer 1", "customer1@domain.com", "indirect"),
    Customer(2, "Customer 2", "customer2@domain.com")

)

fun main(args: Array<String>) {



}