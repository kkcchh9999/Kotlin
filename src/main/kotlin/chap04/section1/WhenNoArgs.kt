package chap04.section1

fun main() {
    print("Enter the Score: ")
    var score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when{
        score >= 90.0 -> grade = 'A'    //in 이 아닌 > 를 직접 사용
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}