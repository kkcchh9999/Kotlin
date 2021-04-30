package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")
}
//결과는 false, true 따라서
//str1, str3이 같은 주소를 참조하고있음
// ===는 참조 비교