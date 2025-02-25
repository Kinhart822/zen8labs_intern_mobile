package concepts

fun main(args: Array<String>) {

    // NhapVao
    var i:Int = 8
    when (i) {
        1 -> println("Bấm số 1")
        2 -> println("Bấm số 2")
        3 -> println("Bấm số 3")
        else -> println("Bấm tào lao")
    }

    // ChanLe
    var r:Int = 0
    println("Nhập vào 1 số nguyên")
    var s: String? = readLine()
    if (s != null)
        r = s.toInt()
    when (r % 2) {
        0 -> println("$r là số chẵn ")
        else -> println("$r là số lẻ ")
    }

    // Quy
    var thang: Int = 0
    println("Nhập vào 1 tháng")
    var rs: String? = readLine()
    if (rs != null)
        thang = rs.toInt()
    when (thang) {
        1, 2, 3 -> println("Tháng $thang thuộc quý 1")
        4, 5, 6 -> println("Tháng $thang thuộc quý 2")
        7, 8, 9 -> println("Tháng $thang thuộc quý 3")
        10, 11, 12 -> println("Tháng $thang thuộc quý 4")
        else -> println("Tháng tào lao")
    }

    // ThuNhap
    var thuNhap:Int = 0
    println("Mời thím nhập vào thu nhập (triệu)/ 1 tháng")
    var ks: String? = readLine()
    if (ks != null)
        thuNhap = ks.toInt()
    when (thuNhap) {
        in 1 .. 3 -> println("nghèo kiếp xác")
        in 4 .. 7 -> println("nghèo vừa vừa")
        in 8 .. 19 -> println("thu nhập khá")
        in 20 .. 50 -> println("thu nhập cao")
        in 51 .. 1000 -> println("đại gia")
        else -> println("Bốc phét ít thôi")
    }

    // TraKetQua
    var a:Int =101
    var check = when (a)
    {
        in 0..100 -> false
        else -> true
    }
    println(check)

    // KoDungExpression
    var ra:Int =99
    when {
        ra%2 == 0 -> println("$ra là số chẵn")
        ra%2 != 0 -> println("$ra là số lẻ")
    }


}
