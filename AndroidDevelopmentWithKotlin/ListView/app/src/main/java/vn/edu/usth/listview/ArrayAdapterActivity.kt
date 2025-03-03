package vn.edu.usth.listview

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.listview.databinding.ActivityArrayAdapterBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityArrayAdapterBinding
class ArrayAdapterActivity : AppCompatActivity() {

    // Khai báo list rỗng
    var ds: MutableList<String> = mutableListOf("090152111", "095241241")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_array_adapter)

        // Khởi tạo viewbinding
        binding = ActivityArrayAdapterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Hiển thị danh sách ban đầu
        binding.lvTen.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            ds
        )

        addEvents()
    }

    private fun addEvents() {
        // code cho button lưu
        binding.btnLuu.setOnClickListener {
            hamXuLyNutLuu()
        }
    }

    private fun hamXuLyNutLuu() {
        val s:String = binding.edtTen.text.toString()
        ds.add(s) // Thêm sdt vào list ds
        binding.edtTen.setText("")
        binding.edtTen.requestFocus()   // Sử dụng khi muốn nó chỉ focus vào ô này thôi (trường hợp có nhiều ô)
        binding.lvTen.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            ds
        )
    }
}
