fun printUppercase(str: String?) {
    str?.let { 
        println(it.toUpperCase()) 
    } ?: run { 
        println("String is null")
    }
}
fun main() {
    val s1: String? = "hello"
    val s2: String? = null
    printUppercase(s1)
    printUppercase(s2) 
}

