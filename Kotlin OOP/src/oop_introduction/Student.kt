package oop_introduction

// Constructor: Là hàm dùng đe tự đong khoi tao gia trị cho đoi tượng, khi đoi tượng dược sinh ra.
//      Kotlin co 2 loai Constructors : Primary Constructor va Secondary Constructors

// Primary Constructor: Hàm tạo chính là một phần của tiêu đề lớp, nó đặt sau tên lớp
//          . Primary Constructor chỉ co 1
//          · Nếu muốn thực hiện các logic code thì khai báo trong init{}

// If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:
//              class Person(firstName: String) { /*...*/ }

class Student constructor(ma:Int, ten:String, cccd: String){
    init{
        println("Ban dang o Primary Constructor")
        println("Ma: $ma - Ten: $ten - cccd: $cccd")
    }
}