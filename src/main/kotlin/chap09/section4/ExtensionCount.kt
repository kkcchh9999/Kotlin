package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    list.forEach{print("$it")}  //각 요소 출력
    println()
    list.forEachIndexed{index, value -> println("index[$index]: $value")}   //인덱스를 포함하여 출력

    val returnedList = list.onEach { print(it) }    //각 요소 람다식으로 처리 반환
    println()
    val returnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")

    println(list.count {it % 2 == 0})   //조건에 맞는 요소 개수 반환
    println(list.max()) //max
    println(list.min()) //min
    println("maxBy: " + map.maxBy{it.key})  //키 기준으로 최대값
    println("minBy: " + map.minBy{it.key})  //키 기준 최소값

    //fold : 초기값, 정해진 식에 따라 처음 ~ 끝 요소에 적용하며 값 생성
    println(list.fold(4) { total, next -> total + next })   // 4 + 1 + 2 + 3 + 4 + 5 + 6
    println(list.fold(1) { total, next -> total * next })   // 1 * 1 * 2 * 3 * 4 * 5 * 6

    //foldRight: fold 와 같고, 마지막 요소 -> 처음 요소 , 즉 4 + 6 + 5 + 4 + 3 ...
    println(list.foldRight(4) { total, next -> total + next })
    println(list.foldRight(1) { total, next -> total + next })

    //reduce: fold 와 동일, 초기값은 없음    -> 1 + 2 + 3 + ...
    println(list.reduce  { total, next -> total + next })
    println(list.reduceRight { total, next -> total * next })

}