package chap04.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble() //콘솔에서 입력받음
    var grade: Char = 'F'               //!!s는 non-null 단정기호

    if(score >= 90.0)
        grade = 'A'
    else if(score >= 80.0)
        grade = 'B'
    else if(score >= 70.0)
        grade = 'C'

    println("Score: $score, Grade: $grade")
}