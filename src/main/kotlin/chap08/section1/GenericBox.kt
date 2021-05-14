package chap08.section1

class Box<T>(t: T){ //제네릭, <T> 로 받을 인자의 자료형을 제한하지 않음
    var name = t    //꼭 T가 아니어도 되지만 관례임, E = Element, K = Key, N = Number, T = Type, V = Value 등
}

fun main() {
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")
    println(box1.name)
    println(box2.name)
}