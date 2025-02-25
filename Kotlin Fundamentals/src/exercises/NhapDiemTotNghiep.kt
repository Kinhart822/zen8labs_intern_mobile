package exercises

fun main(args: Array<String>){

// Nhập vào điểm tốt nghiệp, nếu > 7 thì báo tốt nghiệp
    var dtn:Float?
    println("Nhập vào điểm tốt nghiệp:")
// Gán dữ liệu và ép kiếu float cho chuỗi nhập vào
    dtn = readLine()?.toFloat()
    // Kiểm tra có dữ liệu dc truyền
    if (dtn != null){
        if (dtn >= 7.0) {
            println("Bạn đỗ rồi")
        } else {
            println( "Ban đã tạch ")
        }
    }

}