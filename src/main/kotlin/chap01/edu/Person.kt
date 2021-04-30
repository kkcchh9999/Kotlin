package chap01.edu

class Person(val name: String, val age: Int)

//만일 package 가 없다면 File1 의 Person 클래스와 중복되어 에러가 발생
//하지만 다른 package 에서는 같은 이름의 클래스가 있어도 코틀린에서는 무관함

//파일의 이름과 클래스의 이름이 일치하면 파일의 확장자 표시 생략하고 클래스로 나타남

//kotlin 의 기본 패키지는 import 하지 않아도 사용 가능함 아래는 기본 패키지

//kotlin.* : Any, Int, Double 등 핵심 함수 및 자료형
//kotlin.text.* : 문자와 관련된 API
//kotlin.sequences.* : 컬렉션 자료형의 하나로, 반복이 허용되는 개체 열거
//kotlin.ranges.* : if 문이나 for 문에서 사용할 범위 관련 요소
//kotlin.io.* : 입출력 관련 API
//kotlin.collections.* : List, Set, Map 등의 컬렉션
//kotlin.annotation.* : 애노테이션 관련 API