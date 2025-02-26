package oop_applying

// Nested Classes: là khả năng cho phép Lớp nằm trong lớp khác.
//      Lưu ý: các lớp Nested sẽ không truy suất được các thông tin ở ngoài lớp chứa nó

fun main(args: Array<String>) {
    Ong.Bo().ham()  // Gọi hàm nằm trong class Bố
    Ong().ham()     // Gọi hàm nằm trong class Ong

// Inner Classes: hoạt động giống Nested Classes, nhung them keyword inner
//      Lưu ý: các lớp con truy suất được các thông tin ở ngoài lớp chứa nó
    Ong().Bo1().ham()

// enum Classes: kiểu dữ liệu liệt kê ,dùng để lưu trữ tập các giá trị là hằng số không đổi
//      Các giá tri phân cách nhau bởi dấu phẩy
    println("\n---------------------")
    println(BangPhai.CaiBang.ordinal)
    println(BangPhai.NgaMi.ordinal)

    // Thuộc tính mặc đinh name
    println(BangPhai.NgaMi.name)                        // NgaMi
    // Trong enum cũng có ToString() mặc định nên
    println(BangPhai.NgaMi)                             // NgaMi

    // Values(): Trả về màng danh sách các pt của enum
    var ds = BangPhai.values()
    // In ds mảng
    ds.forEach {
        println(it)
    }

    // Khởi tạo 1 đối tượng thuộc class BangPhai
    var a: BangPhai = BangPhai.NgaMi
    when (a) {
        BangPhai.NgaMi -> println("Bạn thuộc phái NgaMi")
        BangPhai.ConLon -> println("Bạn thuộc phái ConLon")
        BangPhai.ThieuLam -> println("Bạn thuộc phái ThieuLam")
        BangPhai.CaiBang -> println("Bạn thuộc phái CaiBang")
    }

    println(BangPhai.NgaMi.gioiTinh)
    println(BangPhai.ConLon.gioiTinh)

    println(BangPhai.NgaMi.sucManh)
    println(BangPhai.ConLon.sucManh)
}