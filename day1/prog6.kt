fun main() {
    val string = "Mississippi"
    val length = string.length
    val freq = Array<Int>(length) { 0 }
    val visited = Array<Boolean>(length) { false }

    for (i in 0 until length) {
        if (!visited[i] && string[i] != ' ') {
            freq[i] = 1
            for (j in i + 1 until length) {
                if (string[i] == string[j]) {
                    freq[i]++
                    visited[j] = true
                }
            }
        }
    }
    for (i in 0 until length) {
        if (!visited[i] && string[i] != ' ') {
            println("${string[i]}->${freq[i]}")
        }
    }
}

