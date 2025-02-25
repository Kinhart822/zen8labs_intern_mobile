package exercises

fun main(args: Array<String>) {

    var quest:MutableList<String> = mutableListOf("2 + 5 + 7 =", "5 * 10 =", "sqrt(16) =", "12%2 =")
    var dapAn:MutableList<Float> = mutableListOf(14f,50f,4f,0f)
    // println(quest.indices)
    for (i in quest.indices){
        println(quest[i])
//  Nhập kết quả
        var kq:Float? = readLine()?.toFloat()
        if (kq == null)
            return
//  Check đáp án
        if (kq == dapAn[i]){
            println("Ban da tra loi dung roi")
        } else {
            println("Ban da tra loi sai roi")
        }
    }

}