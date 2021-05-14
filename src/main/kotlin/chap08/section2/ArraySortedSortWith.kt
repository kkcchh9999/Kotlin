package chap08.section2

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Smart Phone B", 1500.99),
        Product("Mouse", 512.99)
        )

    products.sortWith(  //p1, p2 비교, p1 이 크면 1 같으면 0 작으면 -1
        Comparator<Product> {p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )

    products.sortWith(compareBy({it.name}, {it.price})) //compare by 를 사용하여 이름 먼저 정렬, 그 후에 가격기준 정렬
    products.forEach{println(it)}
}