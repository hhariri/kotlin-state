

fun capturingWhenBefore(years: Int) {
    val response = calculateROI(years)
    when (response) {
        50 -> println("Too long")
        5 -> println("Bargain")
        else -> println("Oh bother!")
    }
}

