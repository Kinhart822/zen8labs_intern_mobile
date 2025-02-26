package oop_introduction

class StudentAge {
    // Có 2 dạng phương thức triển khai trong Class:
//      * Một lớp có nhiều phương thức, có những phương thức public ra ngoài(public, hay service method)
//      * Còn những phương thức chỉ sử dụng trong lớp (private, gọi là support method )
// Dạng 1: Support Method dùng để hỗ trợ bên trong phương thức. Không truy xuất được từ bên ngoài
//              => Dùng từ khóa private
// Dạng 2. Service Method truy xuất được từ bên ngoài => Dùng từ khóa public, hoặc không ghi gì.

    // Khai báo biến namSinh private
    private var namSinh: Int = 0

    // Khai báo properties
    var NamSinh: Int
        get() {
            return namSinh
        }   // Xem tuổi
        set(value) {
            namSinh = value
        }   // Set tuổi = value truyền vào

    // Khai báo constructor
    constructor (y: Int) {
        namSinh = y
    }

    // Support method
    // Chi sử dụng nội bộ trong class
    private fun checkTuoi(): Boolean {
        var tuoi = 2022 - namSinh
        return tuoi >= 18
    }

    // Service method : Có the goi từ c trinh chinh
    fun kiemTra() {
        if (checkTuoi())
            println("Mời bạn đặt ve")
        else
            println("Không du tuổi xem phim nay, vui long chon phim khac")
    }
}