package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C",100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    println("elementAt: "+ list.elementAt(1))   //인덱스에 해당하는 요소 반환
    println("elementAtOrElse: " + list.elementAtOrElse(10, { 2 * it })) //인덱스를 벗어날 경우 해당 식에 따라 반환
    println("elementAtOrNull: " + list.elementAtOrNull(10)) //인덱스를 벗어날 경우 null 반환

    println("first: " + listPair.first{it.second == 200})   //식에 일치하는 첫 요소 반환
    println("last: " + listPair.last{it.second == 200}) //식에 일치하는 마지막 요소 반환
    println("firstOrNull: " + listPair.firstOrNull {it.first == "E"})   //식에 일치하지 않는 경우 null 반환
    println("lastOrNull: " + listPair.lastOrNull {it.first == "E"})

    println("indexOf: " + list.indexOf(4))  // 주어진 요소에 일치하는 첫 인덱스 반환
    println("indexOfFirst: " + list.indexOfFirst { it % 2 == 0 })   // 람다식에 일치하는 첫 요소의 인덱스 반환, 없으면 -1
    println("lastIndexOf: " + listRepeated.lastIndexOf(5))  // 주어진 요소에 일치하는 가장 마지막 인덱스 반환
    println("indexOfLast: "+ list.indexOfLast { it % 2 == 0 })  //람다식에 일치하는 마지막 요소의 인덱스 반환, 없으면 -1

    println("single: "+ listPair.single{ it.second == 100}) //람다식에 일치하는 요소 반환
    println("singleOrNull: "+ listPair.singleOrNull { it.second == 500 })   //없으면 null 반환

    println("binarySearch: "+ list.binarySearch(3)) //이진 탐색 후 인덱스 반환
    println("find: "+ list.find{it > 3})  //조건에 맞는 첫번째 요소 반환, 없으면 null
}