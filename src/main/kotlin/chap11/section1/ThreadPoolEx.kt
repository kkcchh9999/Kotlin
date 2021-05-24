package chap11.section1

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val myService: ExecutorService = Executors.newFixedThreadPool(8)
    var i = 0

//    while (i < items.size) {    //items 라는 큰 데이터 처리할 때
//        val item = items[i]
//        myService.submit{
//            processItem(item)   //처리할 내용, 아주 오랜시간동안 처리할 경우우
//       }
//        i += 1
//    }
}
