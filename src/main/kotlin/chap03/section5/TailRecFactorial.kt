package chap03.section5

fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial1(number)} ")
}

tailrec fun factorial1(n: Int, run: Int = 1) : Long {
    return if(n == 1) run.toLong() else factorial1(n-1, run * n)
}
// 꼬리 재귀, 팩토리얼 중간 값 계산하여 계속 저장
// n = 5 -> factorial1(4,5) -> factorial(3, 20) -> factorial(2, 60) -> factorial(1, 120) -> 120