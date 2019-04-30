

fun capturingWhenBefore(years: Int) {
    val response = calculateROI(years)
    when (response) {
        50 -> println("Too long")
        5 -> println("Bargain")
        else -> println("Oh bother!")
    }
}

fun capturingWhenNow(years: Int) {
    when (val response = calculateROI(years)) {
        50 -> println("Too long")
        5 -> println("Bargain")
        else -> println("Oh bother!")
    }
}