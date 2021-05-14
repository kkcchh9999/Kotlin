package chap08.section2

fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strs)    //2차원배열
    simpleArray.forEach{println(it)}    //배열 자체가 들어있어 객체의 시그니처가 출력

    val flattenSimpleArray = simpleArray.flatten()  //단일 배열로 변환
    println(flattenSimpleArray)
}