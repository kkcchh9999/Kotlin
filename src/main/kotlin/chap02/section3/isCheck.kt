package chap02.section3

fun main() {
    val num = 256

    if(num is Int)      //Int 형이 맞는지 자료형 검사 : is
        println(num)
    else if (num !is Int)
        println("Not a Int")

    var x : Any     //어떤 자료형이든 될 수 있는 최상위 자료형
    x = "Hello"     //Java 의 Object 느낌?
    if(x is String)
        println(x.length)
    x = 20L         //Any 가 String 이다가 Long 으로 바뀜
    println("x: $x type: ${x.javaClass}")   //기본형 추출
}