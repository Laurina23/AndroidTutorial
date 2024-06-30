fun filterStrings(list: List<Any>): List<String> {
    val result = mutableListOf<String>()
    for (item in list) {
        val str = item as? String
        if (str != null) {
            result.add(str)
        }
    }
    return result
}
fun main() {
    val mixedList: List<Any> = listOf("hello","world", 2, true, "!", 'a')
    val stringsOnly = filterStrings(mixedList)
    println("Filtered Strings:")
    println(stringsOnly)
}

