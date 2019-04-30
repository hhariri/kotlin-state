import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
data class Data(val a: Int, val b: String = "42")

fun main(args: Array<String>) {

    val jsonData = Json.stringify(Data.serializer(), Data(42))

    val jsonList = Json.stringify(Data.serializer().list, listOf(Data(42)))
    println(jsonData) // {"a": 42, "b": "42"}
    println(jsonList) // [{"a": 42, "b": "42"}]

    val obj = Json.parse(Data.serializer(), """{"a":42}""") // b is optional since it has default value
    println(obj) // Data(a=42, b="42")
}