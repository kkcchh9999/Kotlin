package chap07.section1.coffeeMaker

class ElectricHeater(var heating: Boolean = false) : Heater {    //Heater 상속받은 클래스
    override fun on(){
        println("[ElectricHeater] heating")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot() : Boolean = heating
}