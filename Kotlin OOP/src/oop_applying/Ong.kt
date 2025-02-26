package oop_applying

class Ong {
    var a:Int = 1
    class Bo{
        fun ham(){
            //println(a)    // Báo lỗi 0 truy xuất được
            println("Đây là hàm của class Bố")
        }
    }

    inner class Bo1{
        fun ham() {
            println("a class Bố = " + a)// Truy xuất đc biến a
            println("Đây là hàm của class Bố")
        }
    }

    // Hàm của class Ong
    fun ham(){
        println(a) // Truy xuất được
    }

}