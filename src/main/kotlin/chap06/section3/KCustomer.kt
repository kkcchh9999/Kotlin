package chap06.section3

class KCustomer{
    companion object{
        const val LEVEL = "INTERMEDIATE"    //const : 컴파일 시간의 상수, val 과 달리 컴파일 시간에 이미 값이 할당되는것, 자바에서 접근하기 위해 필요
        @JvmStatic fun login() = println("Login...")    //@JvmStatic : 애노테이션, 자바 소스에서 코드를 해석할 때 Companion 생략 가능
        @JvmField val JOB = KJob()  //@JvmField 특정 자료형 사용을 위한 애노테이션
    }
}

class KJob{
    var title: String = "Programmer"
}