package chap10.section1

fun main() {
    val score: Int? = 32
//    var score = null

    fun checkScore() {  //일반적인 null 검사
        if(score != null){
            println("Score: $score")
        }
    }

    fun checkScoreLet() {
        score?.let { println("Score: $it") }    //let 으로 null 검사 생략
        val str = score.let { it.toString() }
        println(str)
    }
    checkScore()
    checkScoreLet()
}