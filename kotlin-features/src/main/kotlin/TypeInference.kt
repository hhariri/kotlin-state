import kotlin.experimental.*

/*
before: Java SAM interface, Kotlin method using this Java SAM interface => you can NOT pass lambda instead

now (new type inference): Java SAM interface, Kotlin method using this Java SAM interface => you can pass lambda instead (edited)
before, now (new type inference): Kotlin SAM interface, Kotlin method using this Kotlin SAM interface => you can NOT pass lambda instead (
*/




/*
class Observable {
    public final Observable zipWith(
    ObservableSource other, BiFunction zipper) {…}
}

observable.zipWith(anotherObservable, BiFunction { x, y -> x + y })


before: Java method using two Java SAM interfaces => you can NOT pass one object and one lambda.
You could only pass either two objects or two lambdas.

*/

// For Kotlin functions that use a Java interface SAM.

// SAM for Kotlin
fun handleInput(handler: Action<String>) {
}

fun main(args: Array<String>) {
    // add -XXLanguage:+NewInference
    handleInput { println(it) }
}

// Sequences


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
    println("Purchased a phone")
}

fun buyingAPhone(a: Any) {
    if (a is CanMakeCalls && a is CanSendText) {
        purchaseDevice(a)
    }
}