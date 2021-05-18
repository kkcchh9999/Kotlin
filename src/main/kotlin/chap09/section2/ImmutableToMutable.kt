package chap09.section2

fun main() {
    val names: List<String> = listOf("one", "two", "three") //불변형 List
    val mutableNames = names.toMutableList()    //새 가변형 List
    mutableNames.add("four")
    println(mutableNames)
}