package oop_introduction

class OverLoading {
    private var maSP: Int = 0
    private var tenSP: String = ""
    private var giaSP: Double = 0.0

    //  Constructor 3 đối số
    constructor(maSP: Int, tenSP: String, giaSP: Double) {
        this.maSP = maSP
        this.tenSP = tenSP
        this.giaSP = giaSP
    }

    // Constructor 2 đối số
    constructor(maSP: Int, tenSP: String) {
        this.maSP = maSP
        this.tenSP = tenSP
    }

    fun ChietKhau(): Double {
        return this.giaSP * 0.95      // Giåm 5%
    }

    // Nếu khách hàng mua đúng ngày sinh, giảm 10%
    fun ChietKhau(sinhNhat: Boolean): Double {
        if (sinhNhat == true) {
            return this.giaSP * 0.9       // Giảm 10%
        } else {
            return this.giaSP * 0.95      // Giảm 5%
        }
    }
}