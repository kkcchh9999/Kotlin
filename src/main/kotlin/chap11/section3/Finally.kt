package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500)
            }
        }finally {
            withContext(NonCancellable){
                println("I'm running finally ")
                delay(1000)
                println("Non-cancellable")
            }
        }
    }
    delay(1300)
    job.cancelAndJoin()
    println("main: Quit!")
}