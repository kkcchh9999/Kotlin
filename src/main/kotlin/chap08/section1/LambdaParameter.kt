package chap08.section1

fun <T> add(a: T, b: T, op:(T, T) -> T): T{
        return op(a, b)     //제네릭에서 return a + b 를 할 수 없음
}                           //아직 자료형이 결정되지 않았기 때문, 따라서 람다식으로 해결

fun main() {
    val result = add(2, 3) { a, b -> a + b }
    println(result)
}