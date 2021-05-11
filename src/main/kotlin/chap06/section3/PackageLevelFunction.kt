@file:JvmName("PKLevel")    //함수 이름 변경
package chap06.section3

fun packageLevelFunc(){ //역컴파일하면 Static 으로 선언되어있음
    println("Package-Level Function")
}

fun main(){
    packageLevelFunc()
}