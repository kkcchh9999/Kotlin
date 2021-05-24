package chap11.section2

import kotlinx.coroutines.*

fun main() = runBlocking<Unit>{ //메인함수가 코루틴 환경으로 실행
    launch {    //백그라운드에 코루틴 실행
        delay(1000)
        println("World!")
    }
    println("Hello") //코루틴 실행 이후 즉시 이어서 실행
    //delay(2000)   //딜레이를 시켜서 메인이 종료하지 않게 하지 않아도 알아서 백그라운드 코루틴을 기다림(runBlocking)
}