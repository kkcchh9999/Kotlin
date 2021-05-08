package chap05.section4

class Person1(firstName: String, out: Unit = println("[Primary Constructor] Parameter")){   //3, out 실행 4로 이동,8, out 실행 9로 이동
    val fName = println("[Property] Person fName: $firstName")  //4, 실행, 5로이동   9, 실행 10로 이동

    init {  //5, 실행 2로 돌아가서 실행 = 6  , 10
        println("[init] Person init block")
    }

    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")): this(firstName){
            //2, out 실행, 3으로 이동
        println("[Secondary Constructor] Body: $firstName, $age")   //6 ,7로 이동
    }
}

fun main() {
    val p1 = Person1("KilDong", 30)     //1, 2로 이동
    println()
    val p2 = Person1("Dooly")   //7, 8로이동
}