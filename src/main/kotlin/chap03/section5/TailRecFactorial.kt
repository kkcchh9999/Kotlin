package chap03.section5


fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial1(number)} ")
}

tailrec fun factorial1(n: Int, run: Int = 1) : Long {
    return if(n == 1) run.toLong() else factorial1(n-1, run * n)
}//수정한번더하고