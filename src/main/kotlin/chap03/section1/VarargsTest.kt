package chap03.section1

fun main(){
    normalVarargs(1, 2, 3, 4)
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int){  //vararg : 가변인자, 개수 미지정
    for(num in counts){                 //a : Int 를 vararg a : Int 로 바꾸면 됨
        print("$num")
    }
    print("\n")
}