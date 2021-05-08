package chap05.section4

open class Person{
    constructor(firstName : String){
        println("[Person] : firstName: $firstName")
    }
    constructor(firstName: String, age: Int){   //3 -> 3출력, 돌아가서 2 출력, 1출력
        println("[Person] : firstName: $firstName, $age")
    }
}

class Developer : Person{
    constructor(firstName: String): this(firstName, 10){    //1, 2호출
        println("[Developer] $firstName")
    }
    constructor(firstName: String, age: Int): super(firstName, age){    //2, 3 호출
        println("[Developer] $firstName, $age")
    }
}

fun main() {
    val sean = Developer("Sean")    //1 호출
}