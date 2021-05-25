package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking<Unit> {
    val channel = Channel<Int> (3)//버퍼 capacity 값을 줌
    val sender = launch(coroutineContext){  //송신자
        repeat(10){
            println("Sending $it")
            channel.send(it) //지속적으로 보내다가, 꽉 차면 일시 지연
        }
    }
    delay(1000) //1초 지연
    sender.cancel() //작업 취소
    sender.cancel() //작업 취소

}