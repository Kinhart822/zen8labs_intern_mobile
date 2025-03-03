package vn.edu.usth.sqlite.exercises

import android.content.ContentValues
import android.content.Context
import android.database.Cursor

class StudentDAO(context:Context) {
    private val dbHelper = ExerciseDbHelper(context)

    fun insertStudent(name: String, age: Int): Long {
        val db = dbHelper.writableDatabase
        val values = ContentValues().apply {
            put(ExerciseDbHelper.COLUMN_NAME, name)
            put(ExerciseDbHelper.COLUMN_AGE, age)
        }
        val result = db.insert(ExerciseDbHelper.TABLE_NAME, null, values)
        db.close()
        return result
    }

    fun getAllStudents(): List<String> {
        val studentList = mutableListOf<String>()
        val db = dbHelper.readableDatabase
        val cursor: Cursor = db.rawQuery("SELECT * FROM ${ExerciseDbHelper.TABLE_NAME}", null)

        if (cursor.moveToFirst()) {
            do {
                val name = cursor.getString(cursor.getColumnIndexOrThrow(ExerciseDbHelper.COLUMN_NAME))
                // Nếu cột "COLUMN_NAME" không tồn tại trong Cursor, nó sẽ ném ngoại lệ thay vì trả về -1 như getColumnIndex().
                val age = cursor.getInt(cursor.getColumnIndexOrThrow(ExerciseDbHelper.COLUMN_AGE))
                studentList.add("$name - $age tuổi")
            } while (cursor.moveToNext())
        }
        cursor.close()
        db.close()
        return studentList
    }

    fun updateStudent(id: Int, name: String, age: Int): Int {
        val db = dbHelper.writableDatabase
        val values = ContentValues().apply {
            put(ExerciseDbHelper.COLUMN_NAME, name)
            put(ExerciseDbHelper.COLUMN_AGE, age)
        }
        val result = db.update(ExerciseDbHelper.TABLE_NAME, values, "${ExerciseDbHelper.COLUMN_ID}=?", arrayOf(id.toString()))
        db.close()
        return result
    }

    fun deleteStudent(id: Int): Int {
        val db = dbHelper.writableDatabase
        val result = db.delete(ExerciseDbHelper.TABLE_NAME, "${ExerciseDbHelper.COLUMN_ID}=?", arrayOf(id.toString()))
        db.close()
        return result
    }
}