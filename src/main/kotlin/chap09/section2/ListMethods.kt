package chap09.section2

fun main() {
    var names: List<String> = listOf("one", "two", "three")

    println(names.size) //크기 반환
    println(names.get(0))   //0번째 요소 반환
    println(names.indexOf("three")) //three 의 인덱스 반환
    println(names.contains("two"))  //two 를 포함하는지 반환
}