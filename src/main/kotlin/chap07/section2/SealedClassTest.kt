package chap07.section2

//sealed 클래스 : 해석하면 봉인된 클래스, 만들어놓은 자료형들 묶어서 제공, 따라서 열거형 클래스의 확장으로 볼 수 있음
sealed class Result{    //실드 클래스 생성
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

class Status: Result()  //실드클래스 상속은 같은 파일에서만 가능
class Inside: Result.Success("Status")  //내부 클래스 상속

//실드클래스 생성의 두번째 방법
sealed class Result1
open class Success(val message: String) : Result1()
class Error(val code: Int, val Message: String) : Result1()

class Status1: Result1()
class Inside1: Success("Status")

fun main(){
    val result = Result.Success("Good!")    //Success 에 대한 객체
    val msg = eval(result)
    println(msg)
}
//상태 검사 함수
fun eval(result: Result): String = when(result){
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
}   //모든 조건 보유, else 필요 없음