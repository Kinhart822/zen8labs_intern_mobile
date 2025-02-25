package exercises

fun main(args: Array<String>) {
    var mk: String?
// Nhập vào và kiểm tra độ manh
    while (true) {
        var demSo = 0
        var demChu = 0
        println("Mời nhập vào mk: ")
        mk = readLine()
        if (mk != null) {
            // Kiểm tra độ dài
            if (mk.length <= 5) {
                println("Mật khẩu phải có ít nhất 6 ký tự")
            } else {
                // Ktra điều kiện còn lại
                for (i in mk) {
                    if (i.isDigit())
                        demSo++
                    else if (i.isLetter())
                        demChu++
                }
                if (demSo * demChu == 0) {
                    println("Mk không hợp lệ, mk phải có ít nhất 1 ký tự và 1 số")
                } else {
                    println("Bạn đã thiết Lập xong mk ")
                    break
                }
            }
        }
    }

    //2. cho người dùng nhập vào mk :
    var demDangNhap = 1
    while (true){
        println("Mời nhập vào mk đăng nhập, Lần thử thứ $demDangNhap/5")
        var LogIn:String? = readLine()
        if (LogIn != null){
            if (demDangNhap == 5) {
                println("Bạn đã nhập sai quá 5 lần, truy cập bị khóa")
                break
            } else if (LogIn == mk) {
                println("Đăng nhập thành công, cửa đã mờ")
                break
            } else {
                demDangNhap++
            }
        }
    }
}
