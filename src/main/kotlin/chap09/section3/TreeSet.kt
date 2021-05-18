package chap09.section3

import java.util.*

fun main() {
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)   //TreeSet 은 HashSet 보다 성능 낮음, 데이터 추가삭제 시간 느림
    intsSortedSet.add(6)                                        //하지만 정렬, 검색에 뛰어남
    intsSortedSet.remove(1)
    println("intsSotrtedSet = $intsSortedSet")

    intsSortedSet.clear()
    println("intsSotrtedSet = $intsSortedSet")
}