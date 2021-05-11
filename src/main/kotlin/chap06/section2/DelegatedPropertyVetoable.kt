package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0){  //vetoable 에 프로퍼티 위임
        prop, old, new ->
        new > old       //새 값이 더 크면 작동, 아니면 거부함
    }

    println(max)    //0
    max = 10
    println(max)    //10

    max = 5         //new = 5, old = 10 -> 실행X
    println(max)
}