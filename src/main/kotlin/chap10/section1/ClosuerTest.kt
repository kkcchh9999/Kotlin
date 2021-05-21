package chap10.section1

fun main() {
    val calc = Calc()
    var result = 0  //외부 변수
    calc.addNum(2, 3) { x, y -> result = x + y }    //람다식 외부 변수 접근, 클로저, 클로저란 람다식 외부 변수에 접근하는 개념
    println(result) //결과 유지
}

class Calc{
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {
        add(a, b)
    }
}