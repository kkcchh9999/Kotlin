package chap03.section1

fun main(){
    val num1 = 10
    val num2 =3
    val result: Int = max(num1, num2)   //함수 호출
    
    println(result)
}

fun max(a: Int, b: Int) = if(a>b) a else b