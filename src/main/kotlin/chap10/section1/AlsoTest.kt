package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")
    val a = person.let {
        it.skills = "Android"   //person 의 skills -> Android 로 변경, let = Success
        "Success"
    }
    println(person)
    println("a: $a")
    val b = person.also {   //b = 새로운 객체,
        it.skills = "Java"
        "Success"   //사용 X
    }
    println(person)
    println("b: $b")
}