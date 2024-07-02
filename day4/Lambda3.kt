fun createAdder(x: Int): (Int) -> Int {
    return { it + x }
}

fun main() {
    val addFive = createAdder(5)
    println(addFive(10))
}


