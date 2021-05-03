package chap03.section6

fun a() = b()   //a 함수에 b 함수 할당
                //최상위 함수임으로 b 선언 위치에 상관없이 사용가능
fun b() = println("b")

fun c() {
//    fun d() = e()   //오류 발생, d 는 지역 함수이며 e를 모름.
    fun e() = println("e")
}

fun main(){
    a() //최상위 함수는 어디서든 호출 가능
//    e() //오류, c 내부에 선언된 함수는 내부에서만 사용 가능
}