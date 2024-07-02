fun sortByAge(people: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return people.sortedBy { it.second }
}

fun main() {
    val people = listOf(Pair("Alice", 30), Pair("Bob", 25), Pair("Charlie", 35))
    println(sortByAge(people))
}

