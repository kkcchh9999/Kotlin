package chap09.section3

fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7)
    intsHashSet.add(5)
    intsHashSet.add(3)
    intsHashSet.remove(6)
    println(intsHashSet)
}   //정렬 메소드는 없음, 입력 순서, 중복 무시 해시값을 통하여 요소를 찾음으로 검색은 O(1)