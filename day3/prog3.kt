fun main() {
    val strings = listOf("hello", "world!")
    val lengthMap = getStringLengths(strings)
    for ((key, value) in lengthMap) {
        println("$key: $value")
    }
}
fun getStringLengths(strings: List<String>): Map<String, Int> {
    val lengthMap = mutableMapOf<String, Int>()
    for (str in strings) {
        lengthMap[str] = str.length
    }
    return lengthMap
}

