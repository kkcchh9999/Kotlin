package chap05.section2

class Bird1(var name: String, var wing: Int, var beak: String, var color: String){
    //부 생성자를 대신함, 본문에서는 생략
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main(){
    val coco = Bird1("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}