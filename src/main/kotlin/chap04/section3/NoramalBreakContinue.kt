package chap04.section3

fun main() {
    for(i in 1..5){
        if(i ==3 )
            break       //break
        print(i)        //if continue, 3은 출력 X 이후는 출력
    }
    println()
    println("outside")
}