fun transformStrings(strings: List<String>, transform: (String) -> String): List<String> {
    return strings.map(transform)
}
fun main() {
    val strings = listOf("kotlin", "java", "swift")
    val result = transformStrings(strings) { it.toUpperCase() }
    println(result)
}

