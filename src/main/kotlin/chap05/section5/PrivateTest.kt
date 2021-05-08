package chap05.section5

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access() {
        privateFunc()
    }
}

class OtherClass{
//    val opc = PrivateClass()    // 다른 클래스에서 접근 불가 (private)
    fun test(){
        val pc = PrivateClass() // 같은 파일에서 생성가능
    }
}

fun main() {
    val pc = PrivateClass()     //같은 파일에서 생성 가능
//    pc.i                        //하지만 내부 메서드 접근 불가
//    pc.privateFunc()            //내부 메서드 접근 불가
}

fun TopFunction(){
    val tpc = PrivateClass()
}