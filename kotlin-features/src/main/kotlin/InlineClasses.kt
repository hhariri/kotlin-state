

inline class Name(val value: String) {
    val length: Int
        get() = value.length
    fun greet() {
        println("Hello $value")
    }
}

fun main() {
    val name = Name("Kotlin")
    println(name.javaClass) // type at runtime - single parameter
    name.greet() // static
    println(name.length) // static
}