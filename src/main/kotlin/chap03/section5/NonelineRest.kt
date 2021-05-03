package chap03.section5

fun main() {
    shortFunc1(3) {println("First call: $it")}
}

inline fun shortFunc1(a: Int, noinline out: (Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}