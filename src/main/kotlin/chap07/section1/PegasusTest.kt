package chap07.section1

interface Bird{
    val wihgs: Int
    fun fly()
    fun jump(){
        println("Bird Jump!")
    }
}

interface Horse{
    val maxSpeed: Int
    fun run()
    fun jump(){
        println("Jump!, maxSpeed: $maxSpeed")
    }
}

class Pegasus : Bird, Horse{
    override val wihgs: Int = 2
    override val maxSpeed: Int = 100
    override fun run() {
        println("Run!")
    }
    override fun fly() {
        println("Fly!")
    }
    override fun jump() {
        super<Bird>.jump()
        println("Pegasus Jump!")
    }
}

fun main() {
    val pegasus = Pegasus()
    pegasus.fly()
    pegasus.run()
    pegasus.jump()
}