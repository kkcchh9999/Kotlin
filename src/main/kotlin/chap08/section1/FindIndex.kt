package chap08.section1

fun <T> find(a: Array<T>, Target: T): Int{
    for(i in a.indices) {   //.indices 는 유효 범위 반환
        if(a[i] == Target) return i     //일치하면 몇 번째인지 반환
    }
    return -1   //없으면 -1 반환
}

fun main(){
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Durian")
    var arr2: Array<Int> = arrayOf(1, 2, 3, 4)

    println("arr.indices ${arr1.indices}")
    println(find<String>(arr1, "Cherry"))
    println(find(arr2,2))
}