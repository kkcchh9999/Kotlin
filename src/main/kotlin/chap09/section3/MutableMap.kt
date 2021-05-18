package chap09.section3

fun main() {
    val capitalCityMap: MutableMap<String, String>  //가변형 맵, 키와 밸류로 이루어짐
            = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values)
    println(capitalCityMap.keys)

    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap)
}