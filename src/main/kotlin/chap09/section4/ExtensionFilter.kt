package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")
    //filter: 특정 요소 찾기
    println(list.filter{it % 2 == 0})       //식과 일치하는 요소
    println(list.filterNot{it % 2 == 0})    //식 이외의 요소
    println(listWithNull.filterNotNull())   //null 제외
    //filterIndexed: 인덱스와 함께 추출
    println("filterIndexed: " + list.filterIndexed {idx, value -> idx != 1 && value % 2 == 0})
    //filterIndexedTo: 추출 후 가변형 컬렉션으로 변환
    val mutList = list.filterIndexedTo(mutableListOf()) {idx, value -> idx != 1 && value % 2 == 0}
    println("filterIndexedTo: $mutList")
    //filterKeys/filterValues: Map 의 키, 값에따라 추출
    println("filterKeys: " + map.filterKeys { it != 11 })
    println("filterValues: " + map.filterValues { it == "Java" })
    //filterIsInstance: 지원하는 자료형 골라내기
    println("filterIsInstance: " + listMixed.filterIsInstance<String>())
    //slice: 특정 범위 잘라내기
    println("slice: " + list.slice(listOf(0, 1, 2)))
    //take: n개의 요소 반환
    println(list.take(2))       //처음부터 2개 반환
    println(list.takeLast(2))   //마지막 2개 반환
    println(list.takeWhile { it < 3 })
    //drop: 처음부터 n개의 요소를 제외한 List 반환
    println(list.drop(3))   //앞 요소 3개 제외하고 반환
    println(list.dropWhile { it < 3 })   //3 미만 제외하고 반환
    println(list.dropLastWhile { it > 3 }) //3 초과 제외 반환
    //componentN() -> N 번째 요소 반환
    println("component1():" + list.component1())// 첫 요소인 1 반환
    //distinct: 중복 요소 하나로 취급한 List 반환
    println("distinct: " + listRepeated.distinct())
    //intersect: 교집합만 골라서 list 로 반환
    println("intersect: " + list.intersect(listOf(5, 6, 7, 8)))

}