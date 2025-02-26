package oop_introduction

class StudentProfile {
    var ma:Int = 0
    //    protected var ma:Int = 0
    //    private var ma:Int = 0
    //    internal var ma:Int = 0
    var ten:String = ""


    // Khai báo constructor không đối số
    constructor() {
        ma = 0
        ten = "No name"
    }

    // Constructor 2 đối số
    constructor(m: Int, t: String) {
        ma = m
        ten = t
    }

    // Khai bao private
    private var diemToan:Float = 0f
    // Trong nhiều trường hợp, chúng ta chỉ muốn 1 nhóm người truy cập được vào, thay đôi các giá trị của biển private
//          => Sữ dụng getter và setter
//      Khai báo properties
    var mathPoints:Float
        get() {
            return diemToan
        }
        set(value) {
            diemToan=value
        }

    private var diemVan:Float = 0f
    var literaturePoints:Float
        get() {
            return diemVan
        }
        set(value) {
            diemVan=value
        }

    var age: Int = 18
        get() {
            println("Lấy giá trị age")
            return field  // `field` là giá trị thực của biến
        }
        set(value) {
            println("Cập nhật age thành $value")
            field = if (value >= 0) value else 0  // Nếu âm, đặt về 0
        }

// Method: Bản chất phương thức trong lập trình hướng đồi tượng là các hàm bên trong lớp
//      (hay nói cách khác nó là các khối lệnh thực hiện 1 công việc hoàn chỉnh )
//               * Có 2 loại phương thức có return và không có return

    //  1. Hàm tính điểm trung bình có return
    fun dTB(diemToan:Float, diemVan:Float) : Float{
        return (diemToan+diemVan)/2
    }

    //  2. Hàm xuất Thông tin sinh viên: 0 có return
    fun xuatThongTin() {
        println("Tên sinh viên là: $ten")
        println("Mã sinh viên là: $ma")
    }

    //  3. Hàm toString
    override fun toString(): String {
        return "Mã sinh viên : $ma, Tên sinh viên : $ten"
    }
}