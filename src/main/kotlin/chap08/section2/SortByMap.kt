package chap08.section2

fun main() {
    val fruits = arrayOf("Banana", "avocado", "apple", "kiwi")
    fruits.filter { it.startsWith("a") }    //a 로 시작하는 요소 필터
        .sortedBy { it }    //오름차순 정렬
        .map { it.toUpperCase() }   //대문자로 받아서
        .forEach { println(it) }    //각각 출력

}