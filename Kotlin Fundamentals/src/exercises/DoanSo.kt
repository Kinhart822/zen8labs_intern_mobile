package exercises

import kotlin.random.Random

fun play() {
    var rd = Random
    var soMay = rd.nextInt(100)//0-99
// Hack
    println(soMay)
// Dếm Lượt chơi
    var dem = 1
    while (true) {
        // Cho ng dùng nhập vào số dự đoán
        println("Mời cụ đoán số từ 1-99: ")
        var nguoiDoan: Int? = readLine()?.toInt()
        if (nguoiDoan == null) return
        if (dem == 7) {
            println("Bạn đã chơi hết 7 lần, bạn đã thua")
            break
        } else {
            dem++// dem=dem+1
            if (nguoiDoan == soMay) {
                println("Bạn đã đoán đúng, số của bạn = số của máy = $soMay")
                break
            } else if (nguoiDoan < soMay) {
                println("Số bạn đoán nhỏ hơn số máy")
            } else {
                println("Số bạn đoán Lớn hơn số máy")
            }
        }
    }
}


fun main(args: Array<String>) {
    while (true) {
        play()
        println("Bạn có muốn chơi tiếp không (y/n)")
        var s: String? = readLine()
        if (s != null) {
            if (s == "n" || s == "N") {
                println("Cảm ơn bạn đã chơi game, hẹn gặp lại")
                break
            }
        }

    }
}
