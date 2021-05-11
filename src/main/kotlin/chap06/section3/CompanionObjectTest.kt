package chap06.section3

class Person{
    var id: Int = 0
    var name: String = "Yongdeok"
    companion object{   //컴패니언 객체
        var language: String = "Korean"
        fun work(){
            println("working...")
        }
    }
}

fun main() {
    println(Person.language)    //컴패니언 객체는 객체 생성 없이도 접근 가능
    Person.language = "English" //이는 객체가 서로 동일한 정보를 가질 때 하나의 메모리만 유지하여
    println(Person.language)    //자원의 낭비를 줄이기 위한 장치
    Person.work()
    //println(Person.name)
}