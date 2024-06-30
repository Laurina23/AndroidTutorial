data class User(val name: String?, val email: String?)
fun printUserDetails(user: User) {
    if (user.name == null || user.email == null) {
        println("Incomplete User")
    } else {
        println("User Details:")
        println("Name: ${user.name}")
        println("Email: ${user.email}")
    }
}

fun main() {
    val user1 = User("null", "l.ptnk@example.com")
    val user2 = User("laurina", null)
    printUserDetails(user1) 
    printUserDetails(user2) 
}
