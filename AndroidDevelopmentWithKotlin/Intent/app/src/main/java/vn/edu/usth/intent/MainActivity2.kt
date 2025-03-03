package vn.edu.usth.intent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.intent.databinding.ActivityMain2Binding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMain2Binding
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_manhinh2)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get dữ Liệu từ intent
        /*val i = intent
        val bienStringg = i.getStringExtra("bienString")
        val bienDoubleee = i.getDoubleExtra("bienDouble",0.0)                   // Giá trị mặc định khi ko tìm thấy
        val bienBool = i.getBooleanExtra("bienBool",false)
        binding.edtGetIntent.setText(bienStringg + "\n" + bienDoubleee + "\n" + bienBool.toString() + "\n")*/

        // Get dữ Liệu dùng bundle
        val i = intent
        // Lấy bundle ra khỏi intent
        val bundle = i.extras
        if (bundle != null) {
            val bienStringg = bundle.getString("bienString", "NULL")
            val bienDoubleee = bundle.getDouble("bienDouble", 0.0)
            val bienBool = bundle.getBoolean("bienBool", false)
            val bienInt = bundle.getInt("bienInt", 0)
            binding.edtGetIntent.setText(bienStringg + "\n" + bienDoubleee + "\n" + bienBool.toString() + "\n" + bienInt.toString() + "\n")
        }

        // Gọi lệnh quay trở lại màn hình main
        binding.btnQuayLai.setOnClickListener {
            val i3 = Intent(this, MainActivity::class.java)
            startActivity(i3)
        }
    }
}