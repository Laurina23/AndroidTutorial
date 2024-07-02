fun processStrs(strs: List<String>, ch: Char): List<String> {
    return strs.filter { it.startsWith(ch, ignoreCase = true) }
        .map { it.toUpperCase() }
        .sorted()
}
fun main() {
    val strs = listOf("blueberry", "banana", "blackberry", "cherry")
    println(processStrs(strs, 'b'))
}

