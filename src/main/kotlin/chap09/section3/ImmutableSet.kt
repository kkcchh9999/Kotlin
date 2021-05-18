package chap09.section3

fun main() {
    val mixedTypesSet = setOf("Hello", 5, "world", 3.14, 'c')   //불변형 Set, 자료형 혼합
    var intSet: Set<Int> = setOf<Int>(1, 5, 5)  //불변형 Set, Int 형

    println(mixedTypesSet)
    println(intSet)
}