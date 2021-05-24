package chap11.section2

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking{
    val time = measureTimeMillis{
        val one = async(start = CoroutineStart.LAZY) { doWork1() }
        val two = async(start = CoroutineStart.LAZY) { doWork2() }
        println("AWAIT: ${one.await() + "_"+ two.await()}")
    }
    println("Completed in $time ms")
}