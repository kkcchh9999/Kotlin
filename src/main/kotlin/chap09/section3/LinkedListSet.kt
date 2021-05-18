package chap09.section3

import java.util.*

fun main() {
    val intsLinkedHashSet: LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75) //LinkedList 를 이용한 Set
    intsLinkedHashSet.add(4)
    intsLinkedHashSet.remove(21)

    println(intsLinkedHashSet)
    intsLinkedHashSet.clear()
    println(intsLinkedHashSet)
}