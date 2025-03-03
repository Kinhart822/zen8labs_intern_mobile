package vn.edu.usth.autocompletetextview

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
import vn.edu.usth.autocompletetextview.databinding.ActivityMainBinding

//                                      AutoCompleteTextView
//           1. Mục đích sử dụng
//  Hiển thị danh sách đề xuất khi người dùng bắt đầu nhập văn bản.
//  Khi người dùng bắt đầu nhập, một menu thả xuống sẽ ở đó dựa trên các ký tự đã nhập
//  id: bắt đầu bằng tiền tố auto , ví dụ : autoTinhThanh
//   - Chú ý:         android:completionThreshold="1"
//              => Thuộc tính đề xuất khi nhập x ký tự
//     Nếu bạn đặt thông số = 0 nó vẫn sẽ ngầm đẩy lên 1 ký tự mới đề xuất

//           2. Cách xây dựng
//  Giống với listview , AutoCompleteTextView cũng cần có nguồn cấp và adapter
//                   2.1. Step 1: Tạo nguồn cấp dữ liệu
//                           res>>values>>string.xml
//                   2.2. Step 2 : Code trong MainActivity.kt

//           3. Set đề xuất khi vừa click chuột vào AutoCompleteTextView

//           4 . setOnItemClickListener : Lắng nghe item nào được click chọ

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //khai báo list danh sách tỉnh thành
        val list = resources.getStringArray(R.array.tinhThanh)

        val adt = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            list)
        binding.autoTinhThanh.setAdapter(adt)

        // Gợi ý với 0 ký tự nhập vào, chỉ cần click chuột là xuất hiện gợi ý
        binding.autoTinhThanh.setOnFocusChangeListener(
            View.OnFocusChangeListener {
                    view, b -> if (b == true) binding.autoTinhThanh.showDropDown()
            })
        // View: Chế độ xem có trạng thái đã thay đổi
        // b: boolean true nếu đúng là nó có thay đổi
        // showDropDown: hiện thị danh sách

        //  Kiểm tra xem item nào được chon
        binding.autoTinhThanh.setOnItemClickListener(AdapterView.OnItemClickListener { adapterView, view, i, l ->
// Lưu ý i: vi trí của item trong list mà dropview nó xổ ra
            Toast.makeText(this,
//            "Click item " + list[i],          // Không dùng i trong trường hợp này
                "Click item " + binding.autoTinhThanh.text.toString(),
                Toast.LENGTH_LONG).show()
        })
    }
}