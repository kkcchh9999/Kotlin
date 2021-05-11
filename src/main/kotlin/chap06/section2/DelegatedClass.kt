package chap06.section2

interface Car{
    fun go(): String
}

class VanImpl(val power: String) : Car{
    override fun go() = "은 짐을 적재하여 $power 를 가집니다."
}

class SportImpl(val power: String) : Car{
    override fun go() = "은 경주용에 사용되며 $power 를 가집니다."
}

class CarModel(val model: String, impl: Car) : Car by impl{ //impl 로 부터 권한 위임받음
    fun carInfo(){
        println("$model ${go()}")   //Car 의 권한을 위임받아 go 메소드 사용
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100 마력")) //VanImpl 의 권한 위임
    val my350z = CarModel("350z 2008", SportImpl("350 마력")) //SportImpl 의 권한 위임
    myDamas.carInfo()
    my350z.carInfo()
}