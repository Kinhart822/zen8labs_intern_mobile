package exercises

import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    var r: Double = 0.0
    println("Nhập vào bán kính r của dt : ")
    var s: String? = readLine()
    if (s != null) {
        r = s.toDouble() //ép kiểu
        println("Chu vi của ht là: " + 2 * PI + r)
        println("S của ht là: " + PI * r.pow(2.0))
    }
}