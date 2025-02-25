package exercises

fun main(args: Array<String>) {
    var demSo = 0
    var demkyTuThuong = 0
    var demkyTuHoa = 0
    var demSpace = 0
    println("Nhập vao 1 chuoi")
    var s: String? = readLine()
    if (s != null) {
        var arr = s.toCharArray()
        // Duyệt các phần từ của mằng
        for (i in arr) {
            // Kiểm tra số
            if (i.isDigit())
                demSo++
            // Kiểm tra ký tự thường
            else if (i.isLowerCase())
                demkyTuThuong++
            // Kiểm tra chữ hoa
            else if (i.isUpperCase())
                demkyTuHoa++
            // Ktra space
            else if (i.isWhitespace())
                demSpace++
        }
    }
    println("So so trong chuoi: $demSo")
    println("Ky tu thuong: $demkyTuThuong")
    println("Ky tu hoa: $demkyTuHoa")
    println("So space: $demSpace")
    println("Tong so ky tu: ${s?.length}")
}