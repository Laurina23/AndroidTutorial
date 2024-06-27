fun main() {
    val n = 5
    val totStars = 9
    for (i in 0 until n) {
        val stars = 1 + 2 * i
        val spaces = (totStars - stars) / 2

        for (j in 0 until spaces) {
            print(" ")
        }

        for (j in 0 until stars) {
            print("*")
        }

        println()
    }
    for (j in 0 until totStars) {
        print("*")
    }
    println()

    for (i in (n - 2) downTo 0) {
        val stars = 1 + 2 * i
        val spaces = (totStars - stars) / 2
        for (j in 0 until spaces) {
            print(" ")
        }
        for (j in 0 until stars) {
            print("*")
        }

        println()
    }
}
