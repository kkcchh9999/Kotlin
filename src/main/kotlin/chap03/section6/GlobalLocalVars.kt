package chap03.section6

var global = 10

fun main(){
    val local1 = 20 //main 안의 local 변수
    val local2 = 21

    fun nestedFunc(){
        global ++   //전역변수 +1
        val local1 = 30 //함수 안에서 유지, 기존 local1은 가려짐
        println("nestedFunc local1: $local1")
        println("nestedFunc local2: $local2")   //상위함수의 local2 사용
        println("nestedFunc global: $global")
    }
    nestedFunc()
    outsideFunc()

    println("main global: $global")
    println("main local1: $local1")
    println("main local2: $local2")
}

fun outsideFunc(){
    global ++
    val outVal = "outside"
    println("outsideFunc global: $global")
    println("outsideFunc outVal: $outVal")
}
