package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val jobs = arrayListOf<Job>()
    jobs += launch(Dispatchers.Unconfined) {    //메인 스레드에서 작업
        println("Unconfined:\t\t ${Thread.currentThread().name}")
    }
    jobs += launch(coroutineContext) {  //부모의 문맥, 여기는 runBlocking 의 영역
        println("coroutineContext:\t ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.Default) {   //Dispatchers 의 기본값
        println("Default: \t\t ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.IO) {    //입출력 중심의 문맥
        println("IO: \t\t ${Thread.currentThread().name}")
    }
    jobs += launch {    //아무 인자가 없을 때
        println("main runBlocking: ${Thread.currentThread().name}")
    }
    jobs += launch(newSingleThreadContext("MyThread")) {   //새 스레드 생성  
        println("MyThread:\t\t ${Thread.currentThread().name}")
    }
    jobs.forEach { it.join() }
}