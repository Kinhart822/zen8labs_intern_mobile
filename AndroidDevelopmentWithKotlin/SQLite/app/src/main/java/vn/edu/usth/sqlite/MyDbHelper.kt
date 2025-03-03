package vn.edu.usth.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/* ctrl + P để xem hướng dẫn các constructors */
/*
name: Chuỗi ? : tên của db
factory SQLiteDatabase.CursorFactory ? : để sử dụng để tạo cac đoi tượng con tro, hoặc null cho mặc đinh
version Int : số của cơ sở dữ Liệu (bắt đầu từ 1);
nếu cơ sở dữ Liệu cũ hơn, onUpgrade sẽ được sử dụng để nâng cấp cơ sở dữ Liệu;
nếu cơ sở dữ Lieu mới hơn, onDowngrade sẽ được sử dung đe ha cap cơ so dữ Lieu
*/

class MyDbHelper(context: Context) : SQLiteOpenHelper(context, "USERDB", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        // Tạo bảng
        p0?.execSQL("CREATE TABLE USERS(USERID INTEGER PRIMARY KEY AUTOINCREMENT, UNAME TEXT , PWD TEXT)")
        //  Add data
        p0?.execSQL("INSERT INTO USERS(UNAME, PWD) VALUES('teo@gmail.com', '123456')")
        p0?.execSQL("INSERT INTO USERS(UNAME, PWD) VALUES('ti@gmail.com', '654321')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}