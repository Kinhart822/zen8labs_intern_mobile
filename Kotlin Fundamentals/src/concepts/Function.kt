package concepts

// Ham co return
fun tinhTong(a:Int, b:Int, c:Int):Int{
    return a + b + c
}

// Ham khong co return (Ham thu tuc)
fun xinChao(){
    println("Xin chào!")
}

fun xinChao1(s:String){
    if (s == "nam"){
        println("Xin chao, minh la boy")
    }
    if (s == "nu"){
        println("Xin chao, minh la girl")
    }
}

fun main(args: Array<String>){
    var result = tinhTong(5, 10, 15)
    var result1 = tinhTong(6, 10, 7)
    println("Tong = $result")
    println("Tong1 = $result1")
    xinChao()
    xinChao1("nam")
}