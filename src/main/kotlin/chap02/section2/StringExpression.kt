package chap02.section2

fun main() {
    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a+2}"     //문자열에 표현식 사용

    println("str1 : \"$str1\"\nstr2 : \"$str2\"")

    val num = 10        //형식화된 다중 문자열
                        //""" 와 """ 사이의 모든 내용을 문자열로 출력함, 공백 특수기호 포함
    val formattedString = """       
        var a = 6
        var b = "Kotlin"
        println(a+num)  //num의 값은 $num
        """

    println(formattedString)
}