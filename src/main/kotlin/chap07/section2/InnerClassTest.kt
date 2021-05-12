package chap07.section2

interface Switcher{ //인터페이스 선언
    fun on(): String
}

class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int){
        fun getInfo() = "${model}: Installed on $cpu with ${size}GB"    //바깥 클래스의 프로퍼티 cpu, model에 접근
    }

    fun powerOn(): String{
        class Led(val color: String){   //지역 클래스
            fun blink(): String = "Blinking $color on $model"   //외부 프로퍼티 접근 가능
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher {   //익명 객체를 사용해 Switcher 상속
            override fun on(): String { //on 구현
                return powerStatus.blink()  //지역 클래스 사용
            }
        }
        return powerSwitch.on() //익명 클래스 사용
    }
}

fun main(){
    val mySdcard = Smartphone("57").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myphone = Smartphone("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
}