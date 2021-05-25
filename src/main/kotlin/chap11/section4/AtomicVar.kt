package chap11.section4

import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

//var counter = 0
var counter = AtomicInteger(0)  //병행처리 변수

suspend fun massiveRun(action: suspend() -> Unit) {
    val n = 1000    //실행할 코루틴 수
    val k = 1000    //반복 횟수
    val time = measureTimeMillis{
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) { action() }
            }
        }
        jobs.forEach{it.join()}
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking{
    massiveRun {
        counter.incrementAndGet()
        //counter++
    }
    //println("Counter = $counter")
    println("Counter = ${counter.get()}")
}