package chap03.section3

fun main() {
    println("funcFunc : ${funcFunc()}") //funcFunc 의 return 값 출력
}

fun sum1(a: Int, b: Int) = a+b

fun funcFunc(): Int {           //return 값으로 함수 사용
    return sum1(2,2)
}
