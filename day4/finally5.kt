fun accessArrayElement(arr: Array<Int>, index: Int): Int? {
    return try {
        arr[index]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: Index out of bounds.")
        null
    } finally {
        println("Operation finished.")
    }
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    println(accessArrayElement(arr, 2))
   
}

