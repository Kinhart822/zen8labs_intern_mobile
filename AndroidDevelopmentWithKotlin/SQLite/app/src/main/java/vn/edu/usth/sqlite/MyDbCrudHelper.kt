package vn.edu.usth.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbCrudHelper (private var context : Context) : SQLiteOpenHelper(context, "TUHOCDB", null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        // Tạo table , column
        db?.execSQL("CREATE TABLE TUHOC(_id integer primary key autoincrement,user TEXT, email TEXT)")

        // Thêm data vào cơ sở dữ liệu
        db?.execSQL("Insert into TUHOC(user,email) values ('mot','mot@gmail.com')")
        db?.execSQL("Insert into TUHOC(user,email) values ('hai','hai@gmail.com')")
        db?.execSQL("Insert into TUHOC(user,email) values ('ba','ba@gmail.com')")
        db?.execSQL("Insert into TUHOC(user,email) values ('tuhoc.cc','tuhoc.cc@gmail.com')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}