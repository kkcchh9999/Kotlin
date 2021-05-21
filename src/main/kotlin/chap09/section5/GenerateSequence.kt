package chap09.section5

fun main() {

    //1로 시작하고, 1씩 증가하는 시퀀스
    val nums: Sequence<Int> = generateSequence(1){ it + 1 }
    //take 를 통해 원하는만큼 시퀀스 작동, 요소 획득, to List로 리스트로 반환
    println(nums.take(10).toList())

    val squares = generateSequence(1) {it + 1}.map { it*it } //it + 1 에 it^2
    println(squares.take(10).toList())

    val oddSquares = squares.filter { it % 2 != 0 } //it % 2 = 1 인 것만 추가
    println(oddSquares.take(5).toList())
}