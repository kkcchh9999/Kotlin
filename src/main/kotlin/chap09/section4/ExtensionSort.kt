package chap09.section4

fun main() {
    val unsortedList = listOf(3, 2, 7, 5)
    println(unsortedList.reversed())    //역순으로 반환

    println(unsortedList.sorted())  //오름차순 정렬

    println(unsortedList.sortedDescending())    //내림차순 정렬

    println(unsortedList.sortedBy { it % 3 })   //비교식에 의해 정렬된 컬렉션
    println(unsortedList.sortedByDescending { it % 3 }) //를 내림차순
}