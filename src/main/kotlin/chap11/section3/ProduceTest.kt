package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce

//생산자 함수
fun CoroutineScope.producer() : ReceiveChannel<Int> = produce {
    var total: Int = 0
    for(x in 1..5) {
        total += x
        send(total)
    }
}

fun main() = runBlocking {
    val result = producer() //생산자
    result.consumeEach { print("$it ") }    //소비자 루틴 구성

}