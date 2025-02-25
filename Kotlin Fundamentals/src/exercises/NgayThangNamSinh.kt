package exercises

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    var dinhDangDate = SimpleDateFormat("dd/MM/yyyy")
    println("Mời nhập vào ngày tháng năm sinh (dd/MM/yyyy): ")
    var s = readLine()
    if (s == null)
        return
// ép kiểu
    var dateInput = dinhDangDate.parse(s)

// Khời tạo biến date time
    var timeNamSinh = Calendar.getInstance()
// Set timeNamSinh = thời gian nhập vào
    timeNamSinh.time = dateInput

// Get năm sinh, tháng sinh, ngày sinh
    var namSinh = timeNamSinh.get(Calendar.YEAR)
    var thangSinh = timeNamSinh.get(Calendar.MONTH)
    var ngaySinh = timeNamSinh.get(Calendar.DAY_OF_MONTH)
    println("Bạn sinh ngày $ngaySinh/$thangSinh/$namSinh ")

// Khởi tạo biến date time
    var timeHienTai = Calendar.getInstance()
// Lấy năm hiện tại
    var namHienTai = timeHienTai.get(Calendar.YEAR)

// Tính tuổi
    var tuoi = namHienTai - namSinh
    println("Bạn sinh năm $namSinh, hiện bạn đã $tuoi tuổi")
}