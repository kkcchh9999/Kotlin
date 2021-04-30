package chap03.section3

fun main() {
    val res1 = funcParam(3, 2, ::sum2)  //인자, 리턴이 있는 함수 sum2
    println(res1)

    hello(::text)   //인자가 없는 함수 text
                    //hello 는 인자만 있고 리턴이 없는 함수
    val likeLambda = ::sum2    //변수처럼 sum2 함수 할당
    println(likeLambda(6,6))
}

fun sum2(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int{
    return c(a, b)
}

fun hello(body: (String, String) -> String) : Unit{
    println(body("Hello", "World"))
}

//hello(::text) == hello({a, b-> text(a, b)}) == hello{a, b-> text(a, b)}  모두 같은 표현