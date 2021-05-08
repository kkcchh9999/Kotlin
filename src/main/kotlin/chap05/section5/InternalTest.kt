package chap05.section5

internal class InternalClass{   //Internal 은 Kotlin 의 모듈 단위, 같은 모듈 안에서 접근 가능
    internal var i = 1
    internal fun icFunc() {
        i += 1
    }
    fun access(){
        icFunc()
    }
}

class Other{
    internal val ic = InternalClass()
    fun test(){ //접근 허용
        ic.i
        ic.icFunc()
    }
}

fun main(){
    val mic = InternalClass()
    mic.i   //접근 허용
    mic.icFunc()    //접근 허용
}