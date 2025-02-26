package oop_applying

// open class Employee {
    open abstract class Employee {      // // Nếu có hàm abstract (Hàm trừu tượng trong thân class Cha). Thì cần thêm keyword abstract sau open
    protected var ten:String = ""
    protected var cccd:String = ""
    protected var que:String = ""
    val luongCoBan:Double = 1200.0 //(1200$)

    // Hàm trừu tượng
    public abstract fun TinhLuong():Double

    // Khai báo constructor 3 đối số
    constructor(ten:String, cccd:String, que:String){
        this.ten = ten
        this.que = que
        this.cccd = cccd
    }

    // Khai báo constructor 2 đối số
    constructor(ten:String, cccd:String){
        this.ten = ten
        this.cccd = cccd
    }
}

