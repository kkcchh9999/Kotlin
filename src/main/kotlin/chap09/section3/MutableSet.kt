package chap09.section3

fun main() {
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)

    animals.add("Dog")  // 중복 허용 X
    println(animals)    // Dog 는 한번만 출력됨

    animals.remove("Python")
    println(animals)
}