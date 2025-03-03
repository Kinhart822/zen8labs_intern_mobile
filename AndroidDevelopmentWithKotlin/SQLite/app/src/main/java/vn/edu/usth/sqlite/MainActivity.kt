package vn.edu.usth.sqlite

import android.annotation.SuppressLint
import android.content.ContentValues
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.sqlite.databinding.ActivityMainBinding

@SuppressLint("StaticFieldLeak")
lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Kết nối đến csdl
        var helper = MyDbHelper(applicationContext)

        // Đọc database
        val db = helper.readableDatabase

        // rawQuery Thực hiện lệnh đến csdl
        var rs = db.rawQuery("SELECT * FROM USERS",null)

        // Xuất thông tin dựa vào thứ tự query
        if (rs.moveToFirst())
            Toast.makeText(applicationContext, rs.getString(1), Toast.LENGTH_SHORT).show()  // Trả về UNAME
        if (rs.moveToFirst())
            Toast.makeText(applicationContext, rs.getString(2), Toast.LENGTH_SHORT).show()  // Trả về PWD
        if (rs.moveToLast())
            Toast.makeText(applicationContext, rs.getString(1), Toast.LENGTH_SHORT).show()  // Trả về UNAME
        if (rs.moveToLast())
            Toast.makeText(applicationContext, rs.getString(2), Toast.LENGTH_SHORT).show()  // Trả về PWD

        // Lắng nghe sự kiện lên btnAdd
        binding.btnAdd. setOnClickListener {
            var cv = ContentValues()
            cv.put("UNAME", binding.edtUser.text.toString())
            cv.put("PWD", binding.edtPassword.text.toString())
            db.insert("USERS", null, cv)
            Toast.makeText(applicationContext, "Thêm thành công", Toast.LENGTH_SHORT).show()

            // Reset 2 ô nhập Liệu username và password
            binding.edtPassword.setText("")
            binding.edtUser.setText("")
            binding.edtUser.requestFocus() // Cho con trỏ ở ô user
        }

        // Mốn xem thông tin thì có 2 cách đó là ấn AppInspection và Device explorer(ấn data>>data>>tìm bài xong rồi save as sau đó vào sqlite để add vào)
    }
}