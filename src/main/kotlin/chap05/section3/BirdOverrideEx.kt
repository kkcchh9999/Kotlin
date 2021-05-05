package chap05.section3

open class Bird(var name: String, var wing: Int, var beak: String, var color: String){
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class Parrot1(name: String,
              wing: Int = 2,
              beak: String,
              color: String,    //마지막 인자는 var 로 선언, 따라서 추가됨을 알 수 있음
              var language: String = "natural") : Bird(name, wing, beak, color){
    fun speak() = println("Speak! $language")
    override fun sing(vol: Int){
        println("I'm a parrot! The volume level is $vol")
        speak() //오버라이딩, 참조해서 다시 재설계
    }
}

fun main() {
    val parrot = Parrot1(name = "myParrot", beak = "Short", color = "multiple")
    parrot.language = "English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5)
}