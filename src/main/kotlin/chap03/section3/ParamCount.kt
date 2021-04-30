package chap03.section3

fun main() {
    noPram({"Hello World!"})
    noPram{"Hellp World"}   //소괄호 생략해도 동일

    OnePram { a-> "Hello World!! $a" }

    moreParam{a, b -> "Hello World! $a $b"}
}
//매개변수가 없는 람다식이 noPram 함수의 매개변수 out으로 지정
fun noPram(out: () -> String) = println(out())

//매개변수가 한개인 람다식
fun OnePram(out: (String) -> String) = println(out("OneParam"))

fun moreParam(out: (String, String) -> String) {
    println(out("OnePram", "TwoParam"))
}