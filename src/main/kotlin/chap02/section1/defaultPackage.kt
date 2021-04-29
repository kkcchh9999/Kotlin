package chap02.section1

import java.lang.Math.PI
import java.lang.Math.abs

import com.example.edu.Person as User   //사용자 패키지 import
                                        //패키지에 만일 같은 이름의 클래스가 있을 경우에는
                                        //as '별명' 을 사용하여 사용

fun main() {
    val intro: String = "안녕하세요~!"    //기본 패키지
    val num: Int = 20                   //기본 패키지
    println("intro: $intro, num: $num") //기본 패키지

    println(PI)                         //Math 의 PI 를 import
    println(abs(-12.6))                 //Math 의 abs 를 import

    //사용자 패키지를 import 하여 사용 - 별명 User를 이용
    val user1 = User("Kil dong", 30)
    println(user1.name)
    println(user1.age)
    //같은 이름의 클래스가 있을때에
    val user2 = Person("ki123", "Kil dong")
    println(user2.id)
    println(user2.name)

}

class Person(val id : String, val name : String)