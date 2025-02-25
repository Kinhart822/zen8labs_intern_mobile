package exercises

import kotlin.random.Random

fun main(args: Array<String>) {
    var rd = Random
    println("Mời nhập vào số pt của list : ")
    var n: Int? = readLine()?.toInt()
    if (n == null) return
    var M: MutableList<Int> = mutableListOf()
    for (i in 1..n)
        M.add(rd.nextInt(101))
    println("List phần từ ngẫu nhiên vừa tao Là " + M)
}