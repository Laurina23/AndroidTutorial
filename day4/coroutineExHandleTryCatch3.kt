fun divide(a: Int, b: Int): String {
    return try {
        val result = a / b
        "Result: $result"
    } catch (e: ArithmeticException) {
        "Error: Division by zero is not allowed."
    }
}
fun main() {
    println(divide(10, 2))
    println(divide(10, 0))
}

