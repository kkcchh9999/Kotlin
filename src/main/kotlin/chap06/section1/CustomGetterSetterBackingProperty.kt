package chap06.section1

import java.lang.AssertionError

class User3(_id: Int, _name: String, _age: Int){
    val id: Int = _id
    private var tempName: String? = null    //null 할당 가능 : String?
    var name: String = _name
        get(){
            if(tempName == null) tempName = "NONAME"    //name 이 null 인 경우 사용하기위한 보조 프로퍼티
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main(){
    val user1 = User3(1, "kildong", 35)
    user1.name = ""
    println("user3.name = ${user1.name}")
}