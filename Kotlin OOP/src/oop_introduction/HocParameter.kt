package oop_introduction

class HocParameter {
    //vararg ( Parameter list)
    fun TinhTong(vararg dsSo:Int):Int {
        var tong = 0
        for (so in dsSo)
            tong += so
        return tong
    }
}