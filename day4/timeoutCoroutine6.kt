import kotlinx.coroutines.*
fun main() = runBlocking {
    try {
        withTimeout(2000L) {
            repeat(10) { i ->
                println("Processing $i ...")
                delay(500L)
            }
        }
    } catch (e: TimeoutCancellationException) {
        println("Task timed out!")
    }
}

