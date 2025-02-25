package concepts

import kotlin.random.Random

fun main(args: Array<String>) {

    // 1. Random so nguyen
// Khời tạo random
    var rd = Random
// Random số nguyên
    var rdNquyen = rd.nextInt(100) // chay từ 0 đến 99
    println(rdNquyen)

// Random số nguyên [a,b)
    var rd2 = rd.nextInt(-100, 50)
    println(rd2)

    // 2. Random so thuc
// Rd số thực - cac so chay tu [0, 1)
    var rd3 = rd.nextDouble()
    println(rd3)

// Random số thực != 1
    // Cach 1
    var rd34 = rd.nextInt(-10, 31)
    var rd4 = rd.nextDouble()
    var rd5 = rd34+rd4
    println(rd5)

    // Cach 2: * với 10 100 1000
    var rdó = rd.nextDouble()*100
    println(rdó)
}