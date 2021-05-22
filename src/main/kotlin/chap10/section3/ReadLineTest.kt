package chap10.section3

fun main() {
    print("Enter: ")
    val input = readLine()!!    //입력
    println("You Entered: $input")
}


//              java.io      java.nio
//입출력  :    Stream 방식   Channel 방식
//버퍼 방식:   Non-buffer    Buffer
//비동기 지원: 지원 안함      지원함