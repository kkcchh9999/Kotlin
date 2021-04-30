package chap03.section1

fun sum(a: Int, b: Int): Int {      //fun : function
    return a + b                    //sum : 함수 이름  a, b : 매개변수
                                    //:Int : 리턴값
}
fun sum1(a: Int, b: Int): Int = a+b      //처럼 줄이는 것도 가능, :Int 도 생략 가능

fun main() {
    val result1 = sum(3,2)
    val result2 = sum(6,7)

    println(result1)
    println(result2)
}