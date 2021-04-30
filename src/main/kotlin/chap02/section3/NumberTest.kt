package chap02.section3

fun main() {
    var test : Number = 12.2    //Float로 스마트 캐스트
    println("$test")

    test = 12       //Int로 스마트캐스트
    println("$test")

    test = 120L     //Long 으로 스마트 캐스트
    println("$test")

    test += 12.0f   //float 로 스마트캐스트
    println("$test")
}