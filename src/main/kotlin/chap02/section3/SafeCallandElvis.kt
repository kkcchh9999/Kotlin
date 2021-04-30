package chap02.section3

fun main() {
    var str1: String? = "HelloKotlin"
    str1 = null
    println("Str1: $str1 length: ${str1?.length ?: -1}")
    //${Str1?.length ?: -1} 는
    //if(str1 != null) str1.length  else -1
    //과 같은 의미,  ?: 엘비스 연산자

    var a: Int = 10
    var b: Double = a.toDouble()    // 자바의 경우 b = a 라고 하면 소수점 뒤의 내용이 잘리고 저장되었으나
                                    //코틀린은 Type Mismatch 발생 따라서 메서드를 사용하여 변환
    var result = 1L + 3             //다음과 같은 경우는 더 큰 쪽에 맞춰 Long으로 추론

    var c: Int = 10
    var d: Int? = 10
    println(a == c) //true  
    println(a === c)//true  //a와 b 모두 코틀린 컴파일러가 기본형으로 변환하여 같은곳에 저장
    println(a == d) //true
    println(a === d)//false //a와 c는 자료형이 다름, 따라서 다른 주소에 저장
}