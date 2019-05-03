import kotlin.experimental.*

// SAM for Kotlin
fun handleInput(handler: Action<String>) {
}

fun main(args: Array<String>) {
    // add -XXLanguage:+NewInference
    handleInput { println(it) }
}


// the compiler can infer the type from yield
val seq = sequence {
    yield(42)
}

// Builders
open class Animal
class Cat: Animal()
class Dog: Animal()

val cat = Cat()
val dog = Dog()


@UseExperimental(ExperimentalTypeInference::class)
fun <T> buildList(@BuilderInference init: MutableList<T>.() -> Unit): List<T> {
    return mutableListOf<T>().apply(init)
}


val list = buildList {
    add(cat)
    add(dog)
}


// Intersection types

interface CanMakeCalls
interface CanSendText

fun <T> purchaseDevice(device: T) where T: CanMakeCalls, T: CanSendText {
    println("Purchased id phone")
}

fun buyingAPhone(a: Any) {
    if (a is CanMakeCalls && a is CanSendText) {
        purchaseDevice(a)
    }
}