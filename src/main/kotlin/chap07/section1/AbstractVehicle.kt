package chap07.section1

abstract class Vehicle(val name: String, val color: String, val weight: Double){    //추상 클래스 선언
    abstract var maxSpeed: Double   //추상 프로퍼티

    var year = "2018"

    abstract fun start()    //추상 메서드
    abstract fun stop()

    fun displaySpecs(){
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {  //추상클래스 상속
    override fun start(){   //추상메서드 구현
        println("Car Started")
    }

    override fun stop() {   //추상메서드 구현
        println("Car Stopped")
    }
}

class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Bike Started")
    }

    override fun stop() {
        println("Bike Stopped")
    }
}

fun main() {
    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreamBike", "red", 173.0, 100.0)

    car.year = "2013"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()
}