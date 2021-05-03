package chap03.section5

fun main() {
    //inline 함수 shortFunc() 의 내용이 복사되어 shortFunc 로 들어감
    shortFunc(3) {println("First call : $it")}
    shortFunc(5) {println("Second call : $it")}
}

inline fun shortFunc(a: Int, out:(Int) -> Unit){
    println("Before calling out()")
    out (a)
    println("After calling out()")
}
//Tools -> Kotlin -> Show Kotlin Bytecode 선택하여 역컴파일된 부분을 확인하면 main 함수 안에 shortFunc 내용이 두번 복사되어있음