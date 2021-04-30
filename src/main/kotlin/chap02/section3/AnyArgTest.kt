package chap02.section3

fun main() {
    checkArg("Hello")   //Any 형식에 String
    checkArg(5)         //Any 형식에 Int
}

fun checkArg(x: Any)
{
    if(x is String)
        println("x is String : $x")
    else if(x is Int)
        println("x is Int : $x")
}