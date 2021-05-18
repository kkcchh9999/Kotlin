package chap09.section2

fun main() {
    val fruits = listOf("apple", "banana", "kiwi")
    for(item in fruits){
        println(item)
    }

    for(index in fruits.indices){   //index 를 지정하기 위해 .indices
        println("fruits[$index] = ${fruits[index]}")

        if(index % 2 == 0) println("짝수")    //짝수만 고를 수 있음
    }
    var index = 0
    while (index < fruits.size) {
        println("fruits[$index] = ${fruits[index]}")
        index ++
    }
}