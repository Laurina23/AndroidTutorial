fun main() {
    val a = 17
    val b = 43
    println("The larger number is: ${largest(a, b)}")
}
fun largest(a: Int, b: Int): Int {
    return if (a > b) a else b
}

