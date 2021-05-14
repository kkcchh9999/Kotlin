package chap08.section2

fun main() {
    val b = Array<Any>(10, {0})
    b[0] = "Hello World"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])

    b.forEach { element -> println("$element") }    //for each 는 요소들 반환
    b.forEachIndexed { i, e -> println("arr[$i] = $e") }    //indexed 를 붙혀 인덱스도 같이 반환
}