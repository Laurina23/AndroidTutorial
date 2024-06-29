fun main() {
    val numbers = listOf(10,11,12,13,14)
    println("The sum of the list is: ${sumOfList(numbers)}")
}
fun sumOfList(numbers: List<Int>): Int {
    return numbers.sum()
}

