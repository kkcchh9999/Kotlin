package chap09.section4

fun main() {
    val list1: List<String> = listOf("one", "two", "three")
    val list2: List<Int> = listOf(1, 3, 4)
    val map1 = mapOf("hi" to 1, "hello" to 2, "Good" to 3)

    println(list1 + "four") //연산자를 통해 문자열 추가
    println(list2 + 1)  //연산자를 사용한 정수형 요소 추가
    println(list2 + listOf(5, 6, 7))    //리스트 병합
    println(list2 - 1) // 요소 제거
    println(list2 - listOf(3, 4, 5))    //일치 요소 제거
    println(map1 + Pair("Bye", 4))  //Pair 를 사용한 Map 요소 추가
    println(map1 - "hello")     //일치 요소 제거
    println(map1 + mapOf("Apple" to 4, "Orange" to 5))  //두 Map 병합
    println(map1 - listOf("hi", "hello"))   //list 일치 값 Map 에서 제거
}