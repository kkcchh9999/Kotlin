package chap04.section3

import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c : Int
    try{
        c = a/b
    }catch (e: Exception){
        e.printStackTrace() //오류 확인
    }finally {
        println("반드시 실행")
    }
}