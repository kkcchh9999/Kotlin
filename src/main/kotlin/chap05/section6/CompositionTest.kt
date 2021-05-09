package chap05.section6

class Car(val name: String, val power: String){
    private var engine = Engine(power)      //Car 을 Engine 이 구성하고있음 구성 관계

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String){
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main(){
    val car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}