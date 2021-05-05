package chap05.section3

open class Bird3(var name: String, var wing: Int, var beak: String, var color: String){
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

class Lark(name: String, wing: Int, beak: String, color: String) : Bird3(name, wing, beak, color){  //: 로 상속, 한칸 띄우는게 관례
    fun singHiton() = println("Happy Song!")
}

class Parrot: Bird3{
    val language: String
    constructor(name: String, wing: Int, beak: String, color: String, language: String) : super(name, wing, beak, color){   //부 생성자 또한 마찬가지로 한칸 띄워서 : 로 상속
        this. language = language
    }
    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird3("myBird",2, "short", "blue")
    val lark = Lark("myLark", 2, "long", "brown")
    val parrot = Parrot("myParrot", 2, "short", "multiple", "korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    lark.singHiton()
    parrot.speak()
    lark.fly()
}