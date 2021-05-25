package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = GlobalScope.launch {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {
            if(System.currentTimeMillis() >= nextPrintTime) {
                println("I'm sleeping ${i++}...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300)                     // 1300ms 가 지난 이후에 바로 종료될거 같지만, 그렇지 않음
    println("main: I'm tired of waiting!")  //while(1 < 5) 에 의해 루프를 끝까지 완료함
    job.cancelAndJoin()                     //while(isActive) 로 바꾸면 의도한 시간에 루프 종료
    println("main: Now I can quit.")
}