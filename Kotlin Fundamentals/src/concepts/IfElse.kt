package concepts

fun main(args: Array<String>){

// Khối lệnh nếu có từ 2 lệnh thì phải để trong {}
    var a:Int =15
    var b:Int =9
    var max:Int
    if (a > b)
        max =a
    else
        max =b
    println("Số lớn nhất là: $max")

// Ngắn gọn
    var c: Int = 15
    var d:Int = 9
    var max1:Int
    max1 = if (c > d) c else d
    println("Số lớn nhất là: $max")

/*  Nhập vào điểm tb, in ra xếp loại học sinh
        - Giỏi: nếu dtb <= 10 và dtb>=8
        - Khá: nếu 8 > dtb >= 6.5
        - TB: nếu 6.5 > dtb >= 5
        - Yếu: nếu dtb < 5
*/
    var dtb:Float? // khai báo biến dtb
    println("Mời thím nhập vào điểm trung bình: ")
    dtb= readLine()?.toFloat()
    if (dtb != null){
        if (dtb >= 8 && dtb <= 10)
            println("Giỏi")
        else if (dtb < 8 && dtb >= 6.5)
            println("Khá")
        else if ( dtb < 6.5 && dtb >= 5)
            println("Tb")
        else (dtb <5 )
            println("Kém")
    }


}