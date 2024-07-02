val factorial: (Int) -> Int = { n ->
    (1..n).fold(1) { acc, i -> acc * i }
}
fun main() {
    println(factorial(5))
}

