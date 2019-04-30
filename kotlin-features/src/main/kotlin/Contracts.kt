import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

fun foo(s: String?) {
    if (s != null) s.length
}

@ExperimentalContracts
fun String?.notNull(): Boolean {
    contract {
        returns(true) implies (this@notNull != null)

    }
    return this == null
}

@ExperimentalContracts
fun foo1(s: String?) {
    if (s.notNull()) s.length
}



@ExperimentalContracts
fun synchronize(lock: Any?, block: () -> Unit) {
    contract { callsInPlace(block, InvocationKind.EXACTLY_ONCE) }
}
