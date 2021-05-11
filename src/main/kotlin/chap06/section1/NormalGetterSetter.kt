package chap06.section1

class User1(_id: Int, _name: String, _age: Int){
    val id: Int = _id
        get() = field       //value : 세터의 매개변수, 외부로부터 값을 가져옴
                            //field : 프로퍼티를 참조하는 변수
    var name: String = _name
        get() = field
        set(value){
            field = value
        }

    var age: Int = _age
        get() = field
        set(value){
            field = value
        }
}