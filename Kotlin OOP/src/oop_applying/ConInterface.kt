package oop_applying

// Implement Interface
class ConInterface:ViDuInterface {
    override fun ThongTin(ten: String, tuoi: Int, cccd: String) {
        println("Em đã định nghĩa lại thông tin theo ý sếp")
        println("tên = $ten")
        println("tuoi = $tuoi")
        println("cccd = $cccd")
    }
}