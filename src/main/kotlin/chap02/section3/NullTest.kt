package chap02.section3

fun main() {
    var str1: String = "Hello Kotlin"
    //str1 = null       //<-해당 문장은 오류 발생 : NULL 허용 X
    //null 을 허용하려면 자료형 뒤에 ? 를 붙여야함
    var str2: String? = "Hello Kotlin"
    str2 = null         //<-에러 발생 X , String 과 String? 는 다른 자료형
    println("Str2 : $str2 length: ${str2?.length}")  //str2.length 는 nullPointer 때문에 실행 불가능
}                                           // 따라서 str2?.length 로 실행, 이렇게 하면 null 검사 하여
                                            //null 이면 null 그대로 출력 아니면 length 실행
