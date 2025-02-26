package oop_applying

//enum class BangPhai {
//    NgaMi,
//    ConLon,
//    ThieuLam,
//    CaiBang
//}

//enum class BangPhai(val gioiTinh:String) {
//    NgaMi("Nữ"),        // ordinal = 0       name="NgaMi"
//    ConLon("Nam"),      // ordinal = 1       name="Conlon"
//    ThieuLam("Nam"),    // ordinal = 2       name="ThieuLam"
//    CaiBang("Nam")      // ordinal = 3       name="CaiBang"
//}

enum class BangPhai(val gioiTinh:String, val sucManh: Int) {
    NgaMi("Nữ",1200),
    ConLon("Nam",1300),
    ThieuLam("Nam",1400),
    CaiBang("Nam",1500)
}
