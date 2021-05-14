package chap08.section2

import java.util.*

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    val sortedNums = arr.sortedArray()                  //오름차순
    println("ASC: "+ Arrays.toString(sortedNums))

    val sortedNumsDesc = arr.sortedArrayDescending()    //내림차순
    println("DEC: "+ Arrays.toString(sortedNumsDesc))

    arr.sort(1,3)   //1 =< x < 3 범위에서 정렬
    println("ORI: "+ Arrays.toString(arr))
    arr.sortDescending()    //내림차순 정렬
    println("ORI: "+ Arrays.toString(arr))

    val listSorted: List<Int> = arr.sorted()    //리스트로 반환
    val listDesc: List<Int> = arr.sortedDescending()    //리스트로 반환
    println("LST: "+ listSorted)
    println("LST: "+ listDesc)

    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy{item -> item.length} //표현식에 따라 정렬
    println(Arrays.toString(items))
}