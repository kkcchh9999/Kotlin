package chap11.section2

import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(100_000){
        launch{
            delay(1000)
            print("#")
        }
    }
}
