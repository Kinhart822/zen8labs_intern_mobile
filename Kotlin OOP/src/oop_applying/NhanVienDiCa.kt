package oop_applying

class NhanVienDiCa : Employee {
    constructor(ten: String, cccd: String, que: String) : super(ten, cccd, que)
    constructor(ten: String, cccd: String) : super(ten, cccd)

    override fun TinhLuong(): Double {
        // Cho nhân viên đi ca lương 105 %
        return luongCoBan * 1.05 //đi ca cao hơn 5%
    }
}