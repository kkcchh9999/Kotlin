package chap11.section2

import kotlinx.coroutines.*

suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun workInSerial() {    //순차 실행
    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One: $one")
        println("Kotlin Two: $two")
    }
}

private fun workInParallel() {
    val one = GlobalScope.async {
        doWork1()
    }
    val two = GlobalScope.async {
        doWork2()
    }
    GlobalScope.launch {
        val combined = one.await() + "_" + two.await()  //await 를 이용하여 doWork1이 끝나고, doWork2도 끝나기를 기다려서
        println("Kotlin Combined : $combined")          //print 진행
    }
}

fun main() {
    workInSerial()
    workInParallel()
    readLine()  //메인 먼저 종료를 막기 위해 입력 대기
}