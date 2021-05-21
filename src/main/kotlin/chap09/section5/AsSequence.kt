package chap09.section5

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val listDefault = list1
        .map{println("map($it) "); it * it}     //n*n 연산 먼저 하고,
        .filter { println("filter($it) "); it % 2 == 0 }    //필터링을 거침
    println(listDefault )       //따라서 중간 과정이 생김

    val listSeq = list1.asSequence()
        .map { print("map($it) "); it * it }
        .filter { println("filter($it) "); it % it == 0 }
        .toList()   //.toList 에서 모든 연산 실행 -> 연산 횟수 감소, 성능 상승
    println(listSeq)
}

