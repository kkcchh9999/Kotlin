package chap07.section1

interface Pet{
    var category: String    //추상 프로퍼티
    val msgTags: String
        get() = "I'm your lovely pet!"

    var species: String
    fun feeding()   //추상메서드
    fun patting(){  //일반 메서드, 구현부를 구현하면 일반메서드가됨
        println("Keep patting!")
    }


}

class Cat(name: String, override var category: String) : Pet, Animal(name) {   //인터페이스 상속
    override fun feeding() {    //구현
        println("Feed the cat a tuna can!")
    }

    override var species: String = "cat"
}

fun main() {
    val obj = Cat("abc","small")
    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
}