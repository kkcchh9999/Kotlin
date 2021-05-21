package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "Kotlin")
        person.apply{ this.skills = "Swift" }   //객체 자체인 this 반환
    println(person)

    val returnObj = person.apply {
        name = "Sean"   // this 생략
        skills = "Java"
    }
    println(person)
    println(returnObj)
}