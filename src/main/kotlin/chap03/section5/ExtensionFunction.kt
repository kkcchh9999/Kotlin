package chap03.section5

fun main() {
    val source = "Hello World1!"
    val target = "Kotlin"
    println(source.getLongString(target))
}
//String 클래스ㅇ에 새로운 확장 함수 생성
fun String.getLongString(target: String):String
{
    if(this.length > target.length)
        return this
    else
        return target
}
