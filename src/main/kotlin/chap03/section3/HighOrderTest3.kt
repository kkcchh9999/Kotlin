package chap03.section3

fun main() {
    val out: () -> Unit = {println("Hello World")}  //인자와 리턴값이 없는 람다식 선언
    out()   //람다식은 함수처럼 사용 가능
    val new = out   //새로운 변수에 out 할당
    new()   //똑같이 함수처럼 사용 가능
}