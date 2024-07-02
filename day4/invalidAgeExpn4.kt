class InvalidAgeException(message: String) : Exception(message)
fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be 18 or older.")
    } else {
        println("Valid age: $age")
    }
}
fun main() {
    try {
        checkAge(15)
    } catch (e: InvalidAgeException) {
        println(e.message)
    }
}

