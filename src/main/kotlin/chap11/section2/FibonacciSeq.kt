package chap11.section2

val seq = sequence {
    val start = 0

    yield(start)
    yieldAll(1..5 step 2)
    yieldAll(generateSequence(8) { it * 3 })
}

fun main() {
    println(seq.take(8).toList())
}