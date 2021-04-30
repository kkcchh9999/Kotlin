package chap02.section2

fun main() {
    val ch = 'A'    //Char 로 추론
    println(ch + 1) //아스키 코드를 통해 B 출력
    //val ch1: Char = 65 처럼 Char 을 아스키코드 Int 로 선언하는것은 오류 발생, 금지되어있음
    val code = 65   //int 65
    val chFromCode: Char = code.toChar()    //Char로 변경
    println(chFromCode)    //아스키코드를 따라  A로 출력
}