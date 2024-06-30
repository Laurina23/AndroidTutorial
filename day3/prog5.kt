class Person(val name: String, val age: Int)
fun main() {
    val persons = listOf(
        Person("Rohit", 30),
        Person("Virat", 25),
        Person("Hardik", 25),
        Person("Bumrah", 24)
    )
    val sortedPersons = persons.sortedWith(compareBy({ it.age }, { it.name }))
    for (person in sortedPersons) {
        println("${person.name} : ${person.age}")
    }
}

