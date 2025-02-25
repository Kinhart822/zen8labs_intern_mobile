package concepts

fun main(args: Array<String>) {
    var s1: String = "Abc dắt dê đi học"
    var s2 = "Bành thị nòi"
    println(s1)
    println(s2)
    println(s1::class.java.typeName)
    println(s2::class.java.typeName)

// 1 so ky tu dac biet
    var s3: String = "D:\\galailaptrinh\\Maria"
    var s4: String = "C:\\Program Files (x86)"
    var s5: String = "Có người nói rằng: \"Abc ... \""
    var s6: String = "dòng 1 \n dòng 2"
    var s7: String = "một \t hai"

    println(s3)
    println(s4)
    println(s5)
    println(s6)
    println(s7)

// Length
    println(s1.length)
    println(s2.length)
    var s8: String = "Em học tại tuhoc.cc"
    println("Độ dài s8= " + s8.length)

    // Xuat ky tu dua theo index
    println(s1[2])
    println(s2[1])
    println(s8[10])

    // Noi chuoi
    var s27 = "Hôm nay"
    //cách 1: Cộng chuỗi
    s27 = s27 + "trời mưa"
    println(s27)
    //cách 2 dùng plus
    s27 = s27.plus("nên em nghi học")
    println(s27)

    // Replace
    var s101: String = s1.replace("dắt", "đi")
    println(s101)

    var s102: String = s1.replace("dắt", "đi", ignoreCase = true)
    println(s102)

    // Trim - xoa khoang trang dau va cuoi chuoi
    var s111: String = "  abc  "
    println(s111.trim())
    println(s111.trimStart())
    println(s111.trimEnd())

    // Split - tach chuoi theo khoang trang
    var s112: List<String> = s1.split(" ")
    for (item in s112) {
        println(item)
    }

    // CompareTo - so sanh 2 chuoi
    // Chu y :  nếu băng nhau trả ve 0
    //          nếu lớn hơn trả về > 0
    //          nếu nhỏ hơn trả về < 0
    var s13: String = "abc"
    var s14: String = "abd"
    println(s13.compareTo(s14))  // tra ve -1 vi s13 < s14

    var s25 = "Abc13579"
    var s26 = "abc13579"
    var x2 = s25.compareTo(s26)
    var x3 = s25.compareTo(s26, ignoreCase = true)
    println(x2)  // tra ve -32 vi s25 < s26
    println(x3)  // tra ve 0 vi s25 = s26 (ignoreCase = true)

    // Equals - so sanh 2 chuoi theo gia tri
    var s15: String = "abc"
    var s16: String = "abd"
    println(s15.equals(s16))  // tra ve false vi s15!= s16

// IndexOf
    var s91: String = "abcdeaf"
    println(s91.indexOf("a"))
    println(s91.indexOf("g"))   // Tra ve -1 vi ko tim thay

// LastIndexOf - giong voi IndexOf nhg tra ve vi tri index cuoi cung
    var s92: String = "abcabc"
    println(s92.lastIndexOf("a"))
    println(s92.lastIndexOf("g"))   // Tra ve -1 vi ko tim thay

// Contains
    var s10 = ".mp3"
    var s11 = "tuhoc.mp3"

    //kiểm tra s11 có chứa s10 không?
    var check: Boolean = s11.contains(s10)
    if (check == true) // viết tường minh: check == true
        println("Có .mp3 trong chuỗi")
    else
        println("không tim thấy .mp3 trong chuỗi")

// SubString
    var s12 = "abcde"
    println(s12.substring(2, 4))  // in ra ky tu tu index 2 den index 3 (khong include index 4)
    println(s12.substring(2))  // in ra ky tu tu index 2 tro di

// StringBuilder (Khuyen dung) - nhanh hon
    var sb = StringBuilder("abc")
    sb.append("def")
    println(sb)  // in ra: abcdef
    sb.insert(2, "ghi")
    println(sb)  // in ra: abghicdef
    sb.delete(4, 7)
    println(sb)  // in ra: abghef
    sb.reverse()
    println(sb)  // in ra: fehgba

// split
    var s33 = "doicoluu.mp3"
    var arr: List<String> = s33.split(".")
    //duyệt phần tử list
    for (i in arr)
        println(i)

// Lowercase and Uppercase
    var s34 = "Em học Lập TRình Tại TUHOC.CC"
    var s35 = s34.lowercase()
    println(s35)
    var s36 = s34.uppercase()
    println(s36)

// toCharArray
    var s37 = "abc13579#@"
    var ar2 = s37.toCharArray()
    for (k in ar2)
        println(k)

}