package vn.edu.usth.sqlite.exercises

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class ExerciseDbHelper (private var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "students.db"
        private const val DATABASE_VERSION = 1

        const val TABLE_NAME = "students"
        const val COLUMN_ID = "id"
        const val COLUMN_NAME = "name"
        const val COLUMN_AGE = "age"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = """
            CREATE TABLE $TABLE_NAME (
                $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_NAME TEXT,
                $COLUMN_AGE INTEGER
            )
        """.trimIndent()  // Sử dụng để loại bỏ khoảng trắng thừa ở đầu mỗi dòng trong một chuỗi nhiều dòng (multiline string)
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
}