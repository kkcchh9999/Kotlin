package chap03.section5

import java.math.BigInteger

fun main() {
    val n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n, first, second))
}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger) : BigInteger {
    return if(n == 0) a else fibonacci(n-1, b, b+a)
}   //if 5, fib(4, 1, 1) -> fib(3, 1, 2) -> fib(2, 2, 3) -> fib(1, 3, 5) -> fib(0, 5, 8) -> 5