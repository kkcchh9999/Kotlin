package chap05.section4

open class Base{
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child : Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child Class f()")

    inner class Inside{
        fun f() = println("Inside Class f()")
        fun test(){
            f()         //inner class 의 f
            Child().f() //Child 의 f
            super@Child.f() //Child 의 상위의 f
            println("[Inside] super@Child.x: ${super@Child.x}") //Child 의 상위의 x
        }
    }
}

fun main(){
    val c1 = Child()
    c1.Inside().test()
}