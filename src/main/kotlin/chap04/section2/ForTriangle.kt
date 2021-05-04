package chap04.section2

fun main() {
    print("Enter the lines")
    val n = readLine()!!.toInt()

    for(line in 1..n){  //for문
        for(space in 1 .. (n-line)) print(" ")
        for(star in 1 until 2 * line) print("*")    //1<= star < line
        print("\n")
    }
}