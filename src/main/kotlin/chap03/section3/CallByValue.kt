package chap03.section3

fun main() {
    val result = callByValue(lamda())   //람다식 함수를 호출
    println(result)
}

fun callByValue(b: Boolean): Boolean {  //일반 함수
    println("callByValue function")
    return b
}

val lamda: () -> Boolean = {    //람다식 함수
    println("lamda function")
    true
}