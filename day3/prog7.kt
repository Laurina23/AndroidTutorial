fun filterNonNullInt(numbers: List<Int?>): List<Int> {
    return numbers.filterNotNull()
}
fun main() {
    val nullableIntegers = listOf(1, 2, 3, null, 5, 6, null, 8)
    val res = filterNonNullInt(nullableIntegers)
    print("List of non-null integers:")
    print(res) 
}

