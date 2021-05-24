package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    GlobalScope.launch {        //GlobalScope 를 지우면 1000번 모두 실행
        repeat(1000) {
            println("Hi $it")
            delay(500)
        }
    }
    delay(1300) //메인 스레드 종료시 종료 -> 3번정도 반복후 종료
}