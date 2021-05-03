package chap03.section5

fun main() {
    // 일반적인 표현 : val multi = 3.multiply(10)
    // 중위 표현
    val multi = 3 multiply 10
    println("multi : $multi")
}
//infix 로 선언되어 중위표현, Int 클래스에 함수 추가
infix fun Int.multiply(x : Int) : Int{
    return this * x
}