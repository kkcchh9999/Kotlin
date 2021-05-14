package chap08.section1

class GenericNull<T>{   //T는 null 허용, T: Any로 자료형을 지정하면 null 허용 X
    fun EqualityFunc(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main(){
    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null, 10)
}