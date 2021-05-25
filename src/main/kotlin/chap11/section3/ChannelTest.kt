package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking<Unit> {
    val channel = Channel<Int> ()
    launch {    //여기에 다량의 연산, 비동기 로직을 둘 수 있음
        for(x in 1..5) channel.send(x * x)
    }
    repeat(5) { println(channel.receive()) }
    println("Done!")
}