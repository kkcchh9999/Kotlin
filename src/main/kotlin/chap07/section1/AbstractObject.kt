package chap07.section1

abstract class Printer{
    abstract fun print()
}

val myPrinter = object: Printer(){  //객체 인스턴스

    override fun print() {  //추상 메서드 구현
        println("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}