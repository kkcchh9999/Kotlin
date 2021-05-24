package chap11.section1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {    //메인 스레드
    GlobalScope.launch {    //새 코루틴을 백그라운드에 실행
        delay(1000L)    //1초의 넌블로킹 지연(ms 단위)
        println("World!")   //지연 후 출력
        doSomething()
    }
    println("Hello,")   //메인 스레드의 코루틴이 지연되는 동안 계속 실행
//    doSomething() //코루틴 밖이라서 실행 불가능
    Thread.sleep(2000)   //메인 스레드가 종료되지 않도록 2초 기다림
}

suspend fun doSomething() { //suspend: 코루틴 안에서만 실행 가능
    println("Do Something!")
}