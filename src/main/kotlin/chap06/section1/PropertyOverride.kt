package chap06.section1

open class First{
    open val x: Int = 0 //오버라이딩 가능
        get(){
            println("First x")
            return field
        }
    val y: Int = 0  //오버라이딩 불가능
}

class Second : First(){
    override val x: Int = 0
        get(){
            println("Second x")
            return field + 3
        }
//  override val y: Int = 0   //오버라이딩 불가
}

fun main(){
    val second = Second()
    println(second.x)
    println(second.y)
}