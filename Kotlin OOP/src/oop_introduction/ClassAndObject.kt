package oop_introduction

fun main() {
    // 1. Tao doi tuong Primary Constructor
    var sv1:Student = Student(1, "Pham Hoang Anh", "123456")
    var sv2 = Student(2, "Nguyen Van A", "654321")

    // 2. Tao doi tuong Secondary Constructors
    var sp1:Product = Product()
    var sp2:Product = Product(1, "Ti Vi", 1000)

    //  3. Quy tac Khai bao Bien Lop
//    - Quy tắc khai báo giống khai báo biến thông thường, quy tắc camel (maSV, tenSV,tenBien, canhHuyen, )
//    - Mức đo truy xuất : mức bảo vệ đi từ thấp đến cao (1 -> 3)
//            *  public - hoặc không ghi gì : Truy xuất dc mọi nơi
//            *  protecteted: Chỉ truy xuất ở trong class hoặc class kế thừa
//            *  private: Truy xuất trong nội tại class, không cho truy xuất từ class con
//            *  internal: Chỉ có thể truy cập trong cùng một module (project hoặc thư viện).

        // Tạo 1 đối tượng mới không truyền giá trị
    var sv3 = StudentProfile() //khời tạo đối tượng sv3
    sv3.ten = "Nghĩa văn trang" // thay đổi tên của sv3
    sv3.ma = 1 // thay đổi mã sv1
    println("Thông tin sinh viên 3: " + sv3.ma + " - " + sv3.ten)

        // Tạo 1 đối tượng mới có truyền vào giá trị ban đầu
    var sv4 = StudentProfile(2, "Hoàng Văn Thượng")
    println("Thông tin sinh viên 4: " + sv4.ma + " - " + sv4.ten)

        // Truy cập vào thuộc tính của đối tượng (private)
    sv4.mathPoints=9f
    println("Điểm toán sv4 là: ${sv4.mathPoints}")

    sv4.literaturePoints=8f
    println("Điểm van sv4 là: ${sv4.literaturePoints}")

    var kq = sv4.dTB(sv4.mathPoints, sv4.literaturePoints)
    println("kq = $kq ")

    sv4.xuatThongTin()

    println(sv4)
        // Output: Chưa có toString: oop_introduction.StudentProfile@34c45dca
        // Output: Mã sinh viên : 2, Tên sinh viên : Hoàng Văn Thượng

    val p = StudentProfile()
    println(p.age)  // ✅ Lấy giá trị age -> Output: 18

    p.age = -5  // ✅ Setter tự động sửa về 0
    println(p.age)  // Output: 0

    // Service AND Support methods
    var nx1 = StudentAge(1995)
    println("Năm sinh nx1 là ${nx1.NamSinh}")
        // Check suport method
    // nx1.CheckTuoi() // báo lỗi
        // Check service method
    nx1.kiemTra()

    // Tu khoa this
    println("\n---------------------------------------------------")
    var test1 = ThamChieuThis()
    test1.diemToan = 7f
    test1.diemVan = 8f
    test1.testCucBo(9f,10f)
    println("Diem Van sau khi goi ham TestCucBo: ${test1.diemVan}")
    println("Diem Toan sau khi goi ham TestCucBo: ${test1.diemToan}")

    // OverLoading Method
    //    * Signature gọi là khác nhau nếu chúng khác nhau về
    //            1. Số lượng các đối số
    //            2. Kiểu dữ liệu các đối số
    //            3. Thứ tự các đôi số
    //    * Overloading Method : Trong cùng class có nhiều phương thức cùng tên nhưng khac nhau ve Signature
    //    * Constructor : là trường hợp đặc biệt của Overloading Method

    println("\n---------------------------------------------------")
    var sanPham1 = OverLoading(1,"Tivi $% inch GHLD45",1000.0)
    var sanPham2 = OverLoading(2,"Dien thoai samsung note 20")

    println(sanPham2)

    var gia1 = sanPham1. ChietKhau()
    var gia2 = sanPham1.ChietKhau(true)
    println("giá 1 = $gia1")
    println("giá 2 = $gia2")

    // Parameter List Method : (la 1 truong hop cua OverLoading Method)
    //      Trong trường hợp ta không thể nắm được số lượng đối số vào, hoặc số lượng đối số quá lớn.
    //              =>  Kotlin cung cấp thêm lựa chọn Parameter List
    println("---------------------------------------------------")
    var dt1 = HocParameter()
    var kq1 = dt1.TinhTong (1, 2, 3, 4, 5, 6, 8, 7, 9)
    println(kq1)
    var kq2 = dt1.TinhTong(1,2,3)
    println(kq2)
}