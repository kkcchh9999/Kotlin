package chap06.section1

class User(_id: Int, _name: String, _age: Int){
    val id: Int = _id
    var name: String = _name
    var age: Int = _age
}

//== class User(val id: Int, var name: String, var age: Int) 한줄로 같은표현으로 사용 가능

fun main(){
    val user = User(1, "Sean", 30)

    val name = user.name    //게터에 의한 값 획득

    user.age = 41           //세터에 의한 값 지정

    println("name: $name, ${user.age}")
}   //디컴파일하면 게터와 세터가 자동으로 생성되어 있음.