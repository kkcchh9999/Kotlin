package chap10.section2

data class Person(
    var name: String? = null,
    var age: Int? = null,
    var job: Job? = null
)

data class Job(
    var category: String? = null,
    var position: String? = null,
    var extension: Int? = null
)

fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun Person.job(block: Job.() -> Unit){
    job = Job().apply(block)
}

fun main() {
    val person = person{    //선언부 키워드 보이지 않음, 변수와 값 형태만 남아있음 => DSL 구조
        name = "Kildong"
        age = 40
        job{
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }
    println(person )
}