/*Тестовый многострочный комментарий*/
fun main() {
    sum(1, 2, 3, 4, 5)
    sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val nums = intArrayOf(1, 2, 3, 4)
    changeNumbers(*nums, koef=2)
}
fun sum(vararg numbers: Int){
    var result=0
    for(n in numbers)
        result += n
    println("Сумма чисел равна $result")
}

fun changeNumbers(vararg numbers: Int, koef: Int){
    for(number in numbers)
        println(number * koef)
}