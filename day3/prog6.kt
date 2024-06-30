fun stringLength(str: String?): Int {
    return str?.length ?: -1
}

fun main() {
    val s1: String? = "laurina"
    val s2: String? = null
    println("Length of s1: ${stringLength(s1)}")
    println("Length of s2: ${stringLength(s2)}")
}

