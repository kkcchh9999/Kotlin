package chap07.section1

open class Animal(val name: String)

class Dog(name: String, override var category: String) : Animal(name), Pet{ //인터페이스, 클래스 상속
    override var species: String = "dog"
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master{
    fun playWithPet(pet: Pet){
        println("Enjoy with my ${pet.species}.")
    }
}

fun main(){
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(cat)
    master.playWithPet(dog)
}