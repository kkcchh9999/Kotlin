package chap03.section1

fun printSum(a: Int, b: Int): Unit{
    println("Sum of $a and $b = ${a+b}")
}
//Unit 은 void 와 비슷한 역할이지만, void 는 정말로 return 이 없는 것이고,
//Unit 은 특수한 객체를 리턴한다. Unit 은 생략할 수 있다.

fun add(name: String, email: String = "default"){
    val output = "$name 님의 이메일은 $email 입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200){
    println(x+y)
}

fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs()
    defaultArgs(200)
}