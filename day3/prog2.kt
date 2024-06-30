fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val n = 4
    val result = remove(list, n)
    println("Original list: $list")
    println("New list: $result")
}
fun remove(input: List<Int>, n: Int): List<Int> {
    val newls = mutableListOf<Int>()
    for (item in input) {
        if (item >= n) {
            newls.add(item)
        }
    }
    return newls
}


