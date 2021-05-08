package chap05.section5

open class Base{
    protected var i = 1     //protected 는 최상위 요소에 사용 불가
    protected fun protectedFunc(){
        i += 1      //접근 허용
    }
    fun access(){
        protectedFunc() //접근 허용
    }
    protected class Nested
}

class Derived : Base() {    //Base 클래스 상속
    fun test(base: Base): Int {
        protectedFunc() //접근 가능
        return i    //접근 가능
    }
}

fun main() {
    val base = Base()
//    base.i        //접근 불가능
//    base.protectedFunc()      //접근 불가능
    base.access()   //접근 가능
}