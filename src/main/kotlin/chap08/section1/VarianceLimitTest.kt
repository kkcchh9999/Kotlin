package chap08.section1

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int) : Animal(50)
class Spider(val poison: Boolean) : Animal(1)

class Box1<out T: Animal>(val element: T) { //자료형 제한, Animal, val element -> val 만 사용가능 var 불가능
    fun getAnimal(): T = element    //out 을 통하여 공변성 선언, out 은 반환 자료형에만 사용 가능
//    fun set(new : T){}            //따라서 in 의 위치에 T 사용 불가+
}

fun main() {
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1
    a1 = s1     //a1이 s1의 상위 -> 성립
    println("a1.size = ${a1.size}")

    val c2: Box1<Animal> = Box1<Cat>(Cat(10))   //Cat 이 Animal 의 하위 -> 성립
    println("c2.element.size = ${c2.element.size}")

//    val c3: Box1<Cat> = Box1<Animal>(10)    //반대의 경우 불가능  이는 out 을 in 으로 바꿔야 함
//    val c4: Box<Any> = Box<Int>(10)   //자료형 제한으로 Animal, 하위클래스 이외에는 사용불가
}