package chap08.section1

import java.lang.IllegalStateException

fun main() {
    val result = getType<Float>(10)
    println("result = $result")
}

inline fun <reified T> getType(value: Int): T { //reified 는 inline 함수에만 사용 가능
    println(T::class)
    println(T::class.java)

    return when(T::class) {
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }
}