package chap03.section5

fun main() {
    shortFunc2(3){
        println("First call: $it")
        return
    }
}

inline fun shortFunc2(a: Int, out: (Int)-> Unit) {
    println("Before Calling out()")
    out(a)          //out a 가 inline 으로 대체되어 return 까지 포함, 따라서
                    //after calling out 은 출력되지 않음
    println("After calling out()")
}