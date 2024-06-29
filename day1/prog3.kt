fun main() {
    val num = 153
    var temp = num
    var sum = 0
    var numberOfDigits = 0
    var digit: Int

    
    var n = 153
    while (n != 0) {
        n /= 10
        numberOfDigits++
    }
    n = 153
    while (n != 0) {
        digit = n % 10
        var power = 1
        for (i in 1..numberOfDigits) {
            power *= digit
        }
        sum += power
        n /= 10
    }
    if (sum == num){
        println("$num is an Armstrong number")
    } else {
        println("$num is not an Armstrong number")
    }
}

