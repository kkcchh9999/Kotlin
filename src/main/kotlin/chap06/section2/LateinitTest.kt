package chap06.section2

class Person{
    lateinit var name: String   //지연 초기화, late Init, 초기화하지 않고 사용가능
    fun test(){
        if(!::name.isInitialized){  //초기화 여부 판단
            println("not initialized")
        }else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong"    //초기화
    kildong.test()
    println("name = ${kildong.name}")
}