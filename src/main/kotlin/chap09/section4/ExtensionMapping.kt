package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    println(list.map {it * 2})  //map: 주어진 식을 이용해 컬렉션을 변환

    //mapIndexed: 컬렉션에 인덱스를 포함하여 주어진 식으로 변환
    val mapIndexed = list.mapIndexed { index, it -> index * it }    //0 * 1, 1 * 2, 2 * 3, 3 * 4 ...
    println(mapIndexed)

    //mapNotNull: null을 제외하고 식을 적용해 새로운 컬렉션 반환
    println(listWithNull.mapNotNull { it?.times(2) })

    //flatMap: 각 요소에 식을 적용한 후 다시 한쳐 새로운 컬랙션을 반환
    println(list.flatMap { listOf(it, 'A') })
    val result = listOf("abc", "12").flatMap { it.toList() }
    println(result)

    //groupBy: 주어진 함수의 결과에 따라 그룹화하여  map 으로 반환
    val grpMap = list.groupBy { if(it % 2 == 0) "even" else "odd" }
    println(grpMap)
}