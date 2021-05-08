package chap05.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {   //인터페이스는 기본적으로 open
    fun f() = println("B Interface f()")
    fun b() = println("B interface b()")
}

class C : A(), B{   //,를 사용해 클래스, 인터페이스 지정
    override  fun f() = println("C Class f()")  //컴파일되려면 f가 오버라이딩 되어야함
    fun test(){
        f() //C 클래스의 f
        b() //B 인터페이스의 b
        super<A>.f()    //A 클래스의 f
        super<B>.f()    //B 인터페이스의 f
    }
}

fun main() {
    val c = C()
    c.test()
}