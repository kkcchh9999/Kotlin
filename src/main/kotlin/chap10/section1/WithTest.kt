package chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)
    val user = User("Kildong", "default")

    val result = with(user) {   //기본적으로 Unit 반환, 표현식 있으면 마지막 표현식 반환
        skills = "Kotlin"
        email = "kildong@example.com"

    }
    println(user)
    println("result: $result")
}