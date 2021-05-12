package chap07.section2

enum class Color(val r: Int, val g: Int, val b: Int){
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);  //; 로 상수 객체 구분

    fun rgb() = (r*256 + g) * 256 + b   //메소드 포함 가능
}

fun getColor(color: Color) = when(color){   //when 으로 구분 가능
    Color.RED -> color.name //이름
    Color.ORANGE -> color.ordinal   //순서 번호
    Color.YELLOW -> color.toString() // 문자열 반환
    Color.GREEN -> color    //기본값
    Color.INDIGO -> color.g
    Color.BLUE -> color.r
    Color.VIOLET -> color.rgb()
}


fun main() {
    println(Color.BLUE.rgb())
    println(getColor(Color.BLUE))
}