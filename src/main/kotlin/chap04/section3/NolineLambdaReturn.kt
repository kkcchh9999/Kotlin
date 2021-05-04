package chap04.section3

fun main() {
    retFunc1()
}

fun inlineLambda1(a: Int, b: Int, out: (Int, Int) -> Unit){ //inline 제거
    out(a, b)
}

fun retFunc1(){
    println("start of retFunc")
    inlineLambda(13, 3) lit@{a, b ->    //람다식 시작부분에 라벨 지정
        val result = a+ b
        if(result > 10) return@lit              //리턴부분에 라벨 지정 혹은, 시작부분에 굳이 라벨링을 하지 않아도
        println("result: $result")              //람다식 이름으로 라벨링을 할 수 있음, 암묵적 라벨
    }               //이후 리턴은 해당 람다식 종료로 빠져나감
    println("end of retFunc")

}