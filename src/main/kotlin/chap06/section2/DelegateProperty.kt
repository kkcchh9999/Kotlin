package chap06.section2

import kotlin.properties.Delegates

class User{
    var name: String by Delegates.observable("NONAME"){ //프로퍼티 위임, observable : 값 변경 감지
        prop, old, new ->   //람다식 매개변수, 프로퍼티, 기존값, 새로운 값
        println("$old -> $new") //기존값 -> 새로운값, 이벤트 발생시 실행
    }
}

fun main() {
    val user = User()
    user.name = "Kildong"   //값 변경, 이벤트 발생
    user.name = "Dooly"     //값 변경, 이벤트 발생
}