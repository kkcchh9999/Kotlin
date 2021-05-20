package chap09.section4

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf(2, 2, 3, 4, 5, 5, 6, 7)

    println(list1.union(list2)) //두 요소 병합, 중복은 하나만
    println(list1.plus(list2))  //두 요소 합하기, 중복 허용, + 와 같음

    val part = list1.partition {it%2 == 0}  //
    println(part)

    val zip = list1.zip(listOf(7,8))    //동일 인덱스끼리 Pair 만들어 반환
    println(zip)
}