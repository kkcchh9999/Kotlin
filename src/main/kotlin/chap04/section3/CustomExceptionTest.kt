package chap04.section3

class InvalidNameException(message: String) : Exception(message)

fun main(){
    var name = "KilDong123"
    try {
        validateName(name)
    }catch (e: InvalidNameException){
        println(e.message)
    }catch (e: Exception){
        println(e.message)
    }
}

fun validateName(name: String){
    if(name.matches(Regex(".*\\d+.*"))){    //이름에 숫자가 포함되면 예외 발생, 정규식 표현, 다음학기에 배울것
        throw InvalidNameException("Your name: $name: contains numerals.")
    }
}