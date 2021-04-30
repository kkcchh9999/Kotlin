package chap02.section4

fun main() {
    var x = 4
    var y = 0b0000_1010
    var z = 0x0F

    println("x shl 2 -> ${x shl 2}")    //shift left 2
    println("x.inv() -> ${x.inv()}")    //2의 보수연산       0100 -> 1011

    println("y shr 2 -> ${y/4}, ${y shr 2}")    //shift right 2
    println("x shl 4 -> ${x*16}, ${x shl 4}")   //shift left 4
    println("z shl 4 -> ${z*16}, ${z shl 4}")   //shift left 4

    x = -4
    println("x shr 4 -> ${x shr 1}")    //shift right 2
    println("x ushr 4 -> ${x ushr 1}")  //0으로 채우는 shift right 2
                                        //-> 부호 비트가 1에서 0으로 변경되어서 값이 이상해짐

    //a = b or c , b xor c, b and c 등으로 비트연산 가능
}