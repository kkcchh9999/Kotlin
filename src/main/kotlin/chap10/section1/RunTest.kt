package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")
    val returnObj = person.apply {  //해당 객체 수정, this 를 반환
        this.name = "Sean"
        this.skills = "Java"
        "Success"   // 사용 X
    }

    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {   //해당 객체 수정, 표현식 반환, 없으면 Unit 반환
        this.name = "Dooly"
        this.skills = "C#"
        "Success"
    }
    println(person)
    println("returnObj2: $returnObj2")
}