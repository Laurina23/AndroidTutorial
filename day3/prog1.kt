fun main() {
    val original = listOf(1, 2, 3, 4, 5)
    val reversed = reverse(original)
    println("Original list: $original")
    println("Reversed list: $reversed")
}
fun reverse(input: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in input.size - 1 downTo 0) {
        result.add(input[i])
    }
    return result
}

