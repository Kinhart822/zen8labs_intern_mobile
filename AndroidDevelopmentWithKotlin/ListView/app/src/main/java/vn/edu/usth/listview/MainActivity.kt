package vn.edu.usth.listview

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.listview.databinding.ActivityMainBinding

//               1. Listview
// - id : bắt đầu bằng tiền tố lv, Ví dụ : lvMonAn
// - Chọn ở mục Legacy sẽ sử dụng ListView
// - Có 2 dạng:
//                     A. TH1: Nguồn Cố Định Không đổi (hiểu đơn giản là những thứ cố định ko thể thêm hay sửa, xóa)
//      + Khai báo trong string.xml (res>>values>>string.xml)
// Ví dụ:
//          <string-array name="arrQuocGia">
//              <item>Lào</item>
//              <item>Campuchia</item>
//              <item>Thái lan</item>
//              <item>Ba lan</item>
//              <item>Hà Lan</item>
//              <item>Phần Lan</item>
//          </string-array>
// ArrayAdapter:
//      + The Adapter acts as a bridge between the UI Component and the Data Source. It converts data from the data sources into view items
//          that can be displayed into the UI Component. Data Source can be Arrays, HashMap, Database, etc. and UI Components can be ListView, GridView,
//          Spinner, etc. ArrayAdapter is the most commonly used adapter in android. When you have a list of single type items which are stored in an array
//          you can use ArrayAdapter. Likewise, if you have a list of phone numbers, names, or cities. ArrayAdapter has a layout with a single TextView. If
//          you want to have a more complex layout instead of ArrayAdapter use CustomArrayAdapter.

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tương tác với listview : Chuyển màu cho listview
//  Test set màu cho list view
//  parseColor=> chuyển từ mã màu sang integer
        val mauXanh = Color.parseColor("#99FFFF")
        binding.lvQuocGia. setBackgroundColor (mauXanh)  // set background color từ màu vàng thành màu xanh

        // add Events
        addEvents()
    }

    private fun addEvents() {
        hienThilvQuocGia()
    }

    private fun hienThilvQuocGia() {
        // Hiển thị danh sách lên listview
//  Khai báo arrQuocGia, sử dụng resources để lấy thông tin từ string.xml
        var arrQuocGia= resources.getStringArray(R.array.arrQuocGia)
//  Gán nguồn cho adapter và hiện data lên listview
        binding.lvQuocGia.adapter = ArrayAdapter(
            this,                                    // Màn hình activity hiện tại để hiện lên
            android.R.layout.simple_list_item_1,            // Vẽ từng dòng cơ bản có sẵn trong gợi ý
            arrQuocGia)                                     // Nguồn dữ liệu gán cho adapter

        // Bắt sự kiện click vào item trên list view
        binding.lvQuocGia.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(
                this,
                "Bạn chọn quốc gia:" + arrQuocGia[i],
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}