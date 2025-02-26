package oop_introduction

class ThamChieuThis {
//Instance variable
    //  (bien co the truy xuat tai moi noi trong class)
    var diemVan:Float = 0f
    var diemToan:Float = 0f

    fun testCucBo (diemVan:Float, diemToan:Float){
        println("Tổng điểm gọi biến cục bộ = "+ (diemVan+diemToan))   // Uu tiên biến cục bộ
            // Dùng this để gọi Instance variable
        println("Tổng điểm gọi Instance variable = " +(this.diemToan+this.diemVan))
        this.diemVan = diemVan
        this.diemToan = diemToan
    }
}