package chap06.section2

class Person1(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person1 by lazy{        //지연 초기화
        isPersonInstantiated = true
        Person1("Kim", 23)  //lazy로 반환
    }
    val personDelegate = lazy{Person1("Hong", 40)}

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") //여기서 lazy 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") //여기서 lazy 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}