package chap04.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade = 'A'   //..은 범위를 나타낸다, 90과 100을 모두 포함하는 범위이다.
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'  //70~100 이외의 범위이다.
    }
    println("Score: $score, Grade: $grade")
}