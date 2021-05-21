###람다식: 
중괄호로 묶여 있으며, 매개변수는 -> 왼쪽, 오른쪽에는 그에 따른 식  
```
ex: 
val sum: (Int, Int) -> Int = { x, y -> x + y }
val mul = { x: Int, y: Int -> x * y }
```
sum 은 Int, Int 를 가지고, Int 를 반환, X + Y 를 반환  
mul 은 자료형 표기가 생략되어 있지만, `X: Int, Y: Int` 에서 자료형 추론이 가능  
추론된 반환 자료형이 Unit 이 아닐 경우, 본문의 마지막 표현식이 반환값으로 처리

```
val isPositive: (Int) -> Boolean = {
    val isPositive = it > 0
    isPositive  //마지막 표현식 반환 
}

val isPositiveLabel: (Int) -> Boolean = number@ {
    val isPositive = it > 0 
    return@number isPositive    //라벨을 사용해 반환 
}    
```
특정 라벨을 사용하여 반환 또한 가능, return@라벨 이름 형태로 지정 가능 

###고차 함수:
함수의 매개변수로 함수를 받거나, 함수 자체를 반환할 수 있는 함수
```
fun inc(x: Int): Int{
    return x + 1
}

fun high(name: String, body: (Int)->Int): Int {
    println("name: $name")
    val x = 0
    return body(x)
}
```
high 의 두 번째 매개변수 body 는 람다식 함수를 받을 수 있고, 이를 다시 본문에서 함수로 반환

``` 
val result = high("Sean", { x -> inc(x + 3) })  //함수를 이용한 람다식
val result2 = high("Sean"){ inc(it + 3) }   //소괄호 밖으로 빼내고 생략
val result3 = high("Kim", ::inc)    //매개변수 없이 함수의 이름만 사용
val result4 = high("Sean"), { x -> x + 3 }  //람다식 자체를 넘겨준 형태
val result5 = high("Sean") { it + 3 }   //매개변수가 1인 경우 it 으로 생략 
```
람다식이 하나인 경우, 소괄호 바깥으로 빼낼 수 있음, 기본값을 사용하는 경우, 
::함수이름 으로 사용 가능, 또한 람다식을 매개변수로 넣을 수 있음
