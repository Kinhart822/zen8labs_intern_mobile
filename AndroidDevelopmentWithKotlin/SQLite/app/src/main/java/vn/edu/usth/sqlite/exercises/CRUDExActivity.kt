package vn.edu.usth.sqlite.exercises

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.sqlite.R

class CRUDExActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crudex)

        val studentDAO = StudentDAO(this)

        // Thêm sinh viên
        studentDAO.insertStudent("Nguyen Van A", 20)

        // Lấy danh sách sinh viên
        val students = studentDAO.getAllStudents()
        students.forEach { println(it) }

        // Cập nhật sinh viên
        studentDAO.updateStudent(1, "Nguyen Van B", 21)

        // Xóa sinh viên
        studentDAO.deleteStudent(1)
    }
}