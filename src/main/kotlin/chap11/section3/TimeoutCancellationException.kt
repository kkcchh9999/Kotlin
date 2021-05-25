package chap11.section3

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking{
    try {
        withTimeout(1300){  //시간이 지나면 에러와 함께 종료, 에러를 없이 종료하려면 withTimeoutNull 사용
            repeat(1000) { i->
                println("I'm sleeping $i...")
                delay(500)
            }
        }
    }catch (e: TimeoutCancellationException){
        println("timed out with $e")
    }
}