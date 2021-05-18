package chap09.section2

fun main() {
    val mutableList: MutableList<String> = mutableListOf<String>("Kildong", "Dooly", "Chelsu")
    mutableList.add("Ben")  //추가
    mutableList.removeAt(1) //1번 삭제
    mutableList[0] = "Sean" //0번을 Sean 으로 변경
    println(mutableList)
    //자료형의 혼합
    val mutableListMixed = mutableListOf("Android", "Apple", 5, 6, 'X')
    println(mutableListMixed)
}