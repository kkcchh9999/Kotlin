package chap04.section2

fun main(){
    var sum = 0
    for(x in 1..10)     //1~10 , 반대로 10~1을 하기 위해서는 for(x in 10 downTo 1)
        sum += x        //1~10을 할 때 +2씩 하기 위해서는 for(x in 1..10 step 2) (= 1 3 5 7 9)
    println("Sum: $sum")    //step 또한 downTo 와 함께 사용 가능
}