package oop_applying

class TruongPhong: NhanSu() {
    override fun TinhLuong(ngayCong: Int): Double {
        return 50 * ngayCong * 1.0
    }
}