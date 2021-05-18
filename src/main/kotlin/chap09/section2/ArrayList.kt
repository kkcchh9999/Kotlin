package chap09.section2

fun main() {
    //arrayListOf , 가변형 리스트를 생성, 자바의 ArrayList 로 변환
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")
    stringList.add("Java")
    stringList.remove("Hello")
    println(stringList)
}