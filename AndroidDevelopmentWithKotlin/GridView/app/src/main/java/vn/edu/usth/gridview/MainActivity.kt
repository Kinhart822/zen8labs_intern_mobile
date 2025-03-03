package vn.edu.usth.gridview

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.gridview.databinding.ActivityMainBinding

//                          GridView kotlin
//       1. GridView (ở phần Legacy)
// - id : bắt đầu bằng tiền tố gv Ví dụ : gvPhim
// - android:numColumns="2"

//       2. Các bước xây dựng GridView:
//  Step 1:
//          Make xml layout
//          CustomLayout
//          => tạo xml layout file tuỳ chỉnh – Đưa hình ảnh vào drawable
//  Step 2:
//          Make class
//          Class OutData
//          => tạo Class OutData lưu trữ các biến cấu trúc của 1 dòng
//  Step 3:
//          Make Class
//          CustomGridView
//          => tạo Class CustomGridView

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Khai báo list danh sách các bộ phim
        var list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.banghoa,"Băng Hoả Ma Trù"))
        list.add(OutData(R.drawable.hoanhon,"Hoàn Hồn 2022"))
        list.add(OutData(R.drawable.rong,"Gia Tộc Rồng"))
        list.add(OutData(R.drawable.thanlan,"Thần Lan Chi Mộng"))

        val customGV = CustomGridView(this,list)
        binding.gvPhim.adapter=customGV

        // Lắng nghe xem item nào được chọn trên gridView
        binding.gvPhim.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this@MainActivity,
                "Bạn chọn " + list[i].tenPhim,
                Toast.LENGTH_SHORT).show()
        }
    }
}