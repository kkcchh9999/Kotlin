package chap11.section4

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

val counterContext = newSingleThreadContext("CounterContext")
var counter1 = 0

suspend fun massiveRun(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch(context){
                repeat(k) {action() }
            }
        }
        jobs.forEach {it.join()}
    }
    println("Completed ${n * k} action in $time ms")
}

fun main() = runBlocking<Unit> {
    massiveRun(counterContext){
        withContext(counterContext) {
            counter1++
        }
    }
    println("Counter = $counter1")
}