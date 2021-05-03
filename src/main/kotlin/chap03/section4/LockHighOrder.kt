package chap03.section4

import java.util.concurrent.locks.ReentrantLock

var shareable = 1   //Lock을 사용할 공유 자원

fun main() {
    var reLock = ReentrantLock()

    lock(reLock, {criticalFunc()})  //1
    lock(reLock) { criticalFunc()}  //2
    lock(reLock, :: criticalFunc)   //3 모두 같은 표현

    println(shareable)
}

fun criticalFunc(){ //공유 자원에 접근하는 함수
    shareable += 1
}

fun <T> lock(reLock: ReentrantLock, body: ()->T): T{
    reLock.lock()   //lock, criticalFunc 실행중 shareable 잠금
    try {
        return body( )          //criticalFunc 실행
    }finally {
        reLock.unlock() //unlock, shareable 해제
    }
}