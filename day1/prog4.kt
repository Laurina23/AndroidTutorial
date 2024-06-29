fun main() {
    val a = 24 
    var num1 = a
    var num2 = b
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    val gcd = num1
    println("GCD of $a and $b is: $gcd")
}
