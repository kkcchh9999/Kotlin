package chap03.section5

fun main() {
    val number = 4
    val result: Long = factorial(number)
    println("Factorial : $number -> $result")
}

fun factorial(n: Int): Long{    //재귀함수, 4*factorial(3) = 4 * 3 * factorial(2) = 4 * 3 * 2 * factorial(1) = 4 * 3 * 2 * 1
    return if(n == 1)
        n.toLong()
    else
        n* factorial(n-1)
}