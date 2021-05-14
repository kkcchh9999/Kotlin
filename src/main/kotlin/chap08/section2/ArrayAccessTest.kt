package chap08.section2

import java.util.*

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr: ${Arrays.toString(arr)}") //toString 으로 배열 출력
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}")  //합 계산

    println(arr.get(2)) //아래와 동일한 표현
    println(arr[2])

    arr.set(2,7)    //아래와 동일한 표현
    arr[2] = 7
    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    for(i in 0..arr.size -1) {
        println("arr[$i] = ${arr[i]}")
    }   //for 루프로 배열의 각 요소 출력

    println(arr.first())    //배열의 첫 요소 출력
    println(arr.last())     //배열의 마지막 요소
    println(arr.indexOf(2)) //배열에서 2의 인덱스
    println(arr.average())  //배열의 평균
    println(arr.count())    //배열의 갯수
    println(arr.contains(4))    //배열에 4가 포함되었는지 확인
    println(4 in arr)   //배열에 4가 포함되었는지 확인
}