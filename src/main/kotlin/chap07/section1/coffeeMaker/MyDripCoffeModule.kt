package chap07.section1.coffeeMaker

class MyDripCoffeeModule : CoffeeModule{
    companion object {  //static 같은 개념?
        val electricHeater: ElectricHeater by lazy {    //지연 초기화
            ElectricHeater()
        }
    }

    private val _thermosiphon : Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }

    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}