fun main() {
    val str = "madam"
    println("Is $str a palindrome? ${isPalindrome(str)}")
}
fun isPalindrome(s: String): Boolean {
    val filteredString = toLowerCase(filterLettersAndDigits(s))
    return filteredString == reverse(filteredString)
}

fun toLowerCase(s: String): String {
    val sb = StringBuilder()
    for (c in s) {
        sb.append(if (c in 'A'..'Z') (c.toInt() + ('a' - 'A')).toChar() else c)
    }
    return sb.toString()
}
fun filterLettersAndDigits(s: String): String {
    val sb = StringBuilder()
    for (c in s) {
        if (c.isLetterOrDigit()) {
            sb.append(c)
        }
    }
    return sb.toString()
}

fun reverse(s: String): String {
    var reversed = ""
    for (i in s.length - 1 downTo 0) {
        reversed += s[i]
    }
    return reversed
}



