package setCombination

fun main() {
    val firstInput= readln().split(" ").toSet()
//    println(firstInput)
    val secondInput = readln().split(" ").toSet()
//    println(secondInput)
    println((firstInput+secondInput).joinToString(" "))
}