fun main() {
    var a = 121
    val num = a
    var b = 0
    while(a != 0) {
        var rem = a % 10
        b = b * 10 + rem
        a = a / 10
    }
    if(b == num) {
        println("Palindrome")
    } else {
        println("Not a palindrome")
    }
}
