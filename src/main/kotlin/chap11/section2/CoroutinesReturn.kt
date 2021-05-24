package chap11.section1

import kotlinx.coroutines.*

fun main() {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World")
    }
    println("Hello,")
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
    Thread.sleep(2000L)
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
}