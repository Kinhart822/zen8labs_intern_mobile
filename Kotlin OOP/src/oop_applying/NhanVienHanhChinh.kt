package oop_applying

// Cách 1
class NhanVienHanhChinh : Employee {
    constructor(ten: String, cccd: String, que: String) : super(ten, cccd, que)

    override fun TinhLuong(): Double {
        return luongCoBan
    }
}

// Cách 2
//class NhanVienHanhChinh(ten: String, cccd: String, que: String) : Employee(ten, cccd, que) {
//    override fun TinhLuong(): Double {
//        return luongCoBan
//    }
//}