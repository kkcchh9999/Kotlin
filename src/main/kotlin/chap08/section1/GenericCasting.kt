package chap08.section1

open class Parent

class Child : Parent()

class Cup<T>

fun main(){
    val obj1: Parent = Child()
//    val obj2: Child = Parent()    //자료형 불일치 오류

//    val obj3: Cup<Parent> = Cup<Child>()
//    val obj4: Cup<Child> = Cup<Parent>()

    val obj5 = Cup<Child>()
    val obj6: Cup<Child> = obj5 //obj5랑 자료형 일치 가능능
}