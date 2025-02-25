package concepts

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    // Trả về ngày tháng hiện tại
    var cal = Calendar.getInstance()
    println(cal)

    // get năm, tháng, ngày
    var nam = cal.get(Calendar.YEAR)
    var thang = cal.get(Calendar.MONTH)
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("năm hiện tại = $nam")
// Chú ý tháng Luôn chạy từ 0->11
    println("tháng hiện tại = $thang")
    println("ngày hiện tại = $ngay")

// Đặt ngày tháng năm
    // Get
    println("Hiện tại: $ngay/${thang+1}/$nam")
    // Set
    cal.set(Calendar.YEAR, 1990)
    cal.set(Calendar.MONTH,6)
    cal.set(Calendar.DAY_OF_MONTH,20)
        // Kiềm tra năm sau khi thay đổi
    var ngaySet = cal.get(Calendar.DAY_OF_MONTH)
    var thangSet = cal.get(Calendar.MONTH)
    var namSet = cal.get(Calendar.YEAR)
    println("Ngày tháng năm set: $ngaySet/$thangSet/$namSet")

// Khai káo biến để định dạng
    var date = cal.time

    var dinhDang= SimpleDateFormat("dd/MM/yyyy")
    println(dinhDang.format(date))

        // Xuất ngày tháng năm, giờ phút giây: HH Lớn để xuất định dạng 24h
    var dinhDang2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
    println(dinhDang2.format(date))
}