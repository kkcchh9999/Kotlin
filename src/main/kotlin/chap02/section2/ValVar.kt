package chap02.section2

//변수 이름 작성시 주의사항 :
//1 숫자로 시작 불가능
//2 while, if 같이 사용되는 키보드는 사용 불가능
//3 변수 이름은 의미가 있는게 좋음
//4 여러 단어일 때, 카멜 표기법 사용이 좋음

//카멜 표기법 :
//  첫 글자는 소문자, 각 단어 시작시 대문자
//  예를 들어 numberOfBooks
//  변수의 경우 첫 글자는 소문자,
//  클래스나 인터페이스는 첫 글자 대문자 `

//코틀린의 자료형은 기본형과, 참조형 중 참조형만 사용한다
//  자바의 경우 int a = 1; 등의 기본형
//  Person person = new Person(); 등의 참조형 모두 사용하지만
//  코틀린은 전부 참조형이다. 이는 더 느릴 것 처럼 보이지만,
//  코틀린의 컴파일러가 컴파일 과정에 참조형을 모두 기본형으로 바꾼다.

fun main() {
    val number = 10             //자료형을 추론, Int, 변수 이름에 놓고 ctrl+shift+p 를 누르면 추론된 자료형 확인 가능
    var language = "Korean"     //자료형을 추론, String, var 키워드는 변수 변경 가능
    val secondNumber: Int = 20  //자료형 지정, Int
    language = "English"        //var 키워드로 선언한 변수 값 변경

    println("number : $number")
    println("language: $language")
    println("secondNumber : $secondNumber")

    val num1 = 1234                 //Int 로 추론
    val num2 = -12345               //Int 로 추론
    val num3 = 124456213241465256   //Long 으로 추론
    val exp1 = 123                  //Int 로 추론
    val exp2 = 123L                 //접미사 L 을 통하여 Long 으로 추론
    val exp3 = 0x0F                 //0x를 사용, 16진수로 표기한 Int 로 추론
    val exp4 = 0b0101010110         //0b를 사용, 2진수로 표기한 Int 로 추론
    val exp5: Byte = 127            //명시적으로 Byte 형식으로 정의
    val exp6 = 127                  //명시하지 않으면 short, byte 범위도 Int 로 추론
    val exp7: Short = 1234          //명시적으로 Short 형식으로 정의
    val exp8 = 3.14                 //Double 로 추론, 명시하지 않으면 Float 범위도 Double
    val exp9 = 3.14F                //명시적으로 Float 로 정의
    val exp10 = 1_000_000    //_를 사용하면 값에는 영향을 미치지 않아서 자리수를 표현할 수 있음
                            //모든 종류의 값에 사용 가능함
    //부호가 없는 unsigned 자료형을 사용하기 위해서는
    //ULong, UInt, UShort, UByte 등으로 명시해주고 사용하면 됨.

    //모든 실수를 표현하기에는 메모리의 공간에 제한이 있음.
    // 따라서 부동 소수점 방식 사용 (ex : 3.14 X 10^16)
    val exp11 = 3.14E16     // 3.14 X 10^16
    val exp12 = 3.14e-3     // 3.14 X 10^-3
}
