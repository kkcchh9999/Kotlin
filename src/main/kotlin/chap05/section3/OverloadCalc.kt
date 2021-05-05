package chap05.section3

fun main() {
    val calc = Calc()
    println(calc.add(3,2))
    println(calc.add(3.2, 1.3))
    println(calc.add(3,3,2))
    println(calc.add("Hello", "World"))
}

class Calc{     //오버로딩, 같은 이름의 메서드에 자료형만 변경
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y + z
    fun add(x: String, y:String): String = x + y
}