package chap06.section2

class LazyTest{
    init{
        println("init block")
    }

    val subject by lazy{
        println("lazy initialized")     //2, 초기화 호출시 실행 "Kotlin Programing" 으로 저장됨
        "Kotlin Programing"
    }

    fun flow(){
        println("not initialized")
        println("subject one: $subject")    //최초 subject 초기화, lazy 1
        println("subject two: $subject")    //초기화 한 값 사용
    }
}

fun main(){
    val test = LazyTest()
    test.flow()
}