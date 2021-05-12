package chap07.section2

class Outer{
    val ov = 5
    class Nested{
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv"

        fun accessOuter(){
            println(country)
            getSomething()
        }
    }
    companion object{   //컴패니언 객체 = static 과 비슷함
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
    fun outside(){
        val msg = Nested().greeting()   //객체 생성 없이 중첩 클래스의 메서드 접근 가능
        println("[Outer]: $msg, ${Nested().nv}")
    }
}

fun main() {
    val output = Outer.Nested().greeting()  //Nested 클래스는 Outer 클래스 객체 생성 없이 사용 가능
    println(output)

    //Outer.outside // 외부클래스의 경우, 객체를 생성하여야 사용 가능
    val outer = Outer()
    outer.outside()
}