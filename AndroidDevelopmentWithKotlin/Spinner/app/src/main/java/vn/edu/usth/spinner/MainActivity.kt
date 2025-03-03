package vn.edu.usth.spinner

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.spinner.databinding.ActivityMainBinding

//                       Spinner (trong mục Containers)
//  - id : bắt đầu bằng tiền tố sp, ví dụ : spNgonNgu
//  - Spinner gần giống với listview nhưng nó hiển thị dưới dạng drop down

// TH1. Spinner với nguồn cấp cố định
//      - Viết file string.xml để đổ dữ liệu tại res>>values>>strings.xml
// TH2 . Spinner với nguồn cấp thay đổi (Người dùng có thể xóa và thêm phần tử)
//      - Tạo 1 list tại đây


//                          Các bước tạo custom spinner:
//  Step 1:
//      Make xml layout
//      CustomLayout
//               => Tạo xml layout file tuỳ chỉnh – Đưa hình ảnh vào drawable
//  Step 2:
//      Make class
//      Class OutData
//               => Tạo Class OutData lưu trữ các thành phần của 1 dòng
//  Step 3:
//      Make Class
//      CustomSpinner
//               => Tạo Class CustomSpinner

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Hàm test spinner cơ bản
        setUpSpinnerCoBan()

        //  Tạo hàm custom spinner để dễ quản lý
        setupCustomSpinner()
    }

    private fun setUpSpinnerCoBan() {
        // Tạo 1 list ngôn ngữ
//        val list = resources.getStringArray(R.array.ngonNgu)   // nguồn cấp cố định
        val list = mutableListOf<String>() // nguồn cấp thay đổi
        list.add("English")
        list.add("Việt Nam")
        list.add("Tây Ban Nha")

        // Khai báo bộ điều hướng
        val adt = ArrayAdapter(
            this,                                // Màn hình hiển thị
            android.R.layout.simple_spinner_item,       // Cách hiển thị
            list)                                       // Nguồn cấp cho adapter

        // Gọi Spinner
        binding.spNgonNgu.adapter = adt

        // Lắng nghe xem item của spinner có được chọn?
        binding.spNgonNgu.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{    // gán = object và kế thừa từ AdapterView.OnItemSelectedListener
            // Ctrl + O (chữ o) để tái định nghĩa lại phương thức
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //p2:Int là vị trí của phần tử trong list
                Toast.makeText(this@MainActivity,"Bạn chọn " + list[p2], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }

    private fun setupCustomSpinner() {
        // Khai báo danh sách các món ăn cho vào list2
        var list2 = mutableListOf<OutData>()
        list2.add(OutData(R.drawable.cam,"Cam tươi"))
        list2.add(OutData(R.drawable.duahau,"Dưa hấu sài gòn"))
        list2.add(OutData(R.drawable.tao,"Táo china "))
        list2.add(OutData(R.drawable.sauchung,"Sầu riêng không mùi"))
        list2.add(OutData(R.drawable.xoai,"Xoài lắc nam bộ"))

        val customSpinner = CustomSpinner(this, list2)
        binding.spCustom.adapter = customSpinner

        // Lắng nghe xem item của spinner có được chọn?
        binding.spCustom.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            // Ctrl + O (chữ o) để tái định nghĩa lại phương thức
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                // p2:Int là vị trí của phần tử trong list
                Toast.makeText(this@MainActivity,"Bạn chọn " + list2[p2].mieuTa, Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }
}