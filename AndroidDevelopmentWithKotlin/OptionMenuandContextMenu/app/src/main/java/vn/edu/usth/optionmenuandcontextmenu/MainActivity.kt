package vn.edu.usth.optionmenuandcontextmenu

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.optionmenuandcontextmenu.databinding.ActivityMainBinding

//                          Option Menu
//                   Các bước tạo menu cơ bản
// Step 1:
//      Make xml layout => Tạo menu.xml (res >> tạo menu - vào Resource type chọn menu >> menu.xml)
//      Menu    => Tạo Menu Item trong menu.xml
//          * Các thuộc tính quan trọng thường gặp :
//              STT     Thuộc tính      Nội dung                            Chi tiết
//              1       id              Id của menu Item                    mnuxxx
//              2       title           Tex hiển thị                        Home, Exit…
//              3       icon            Biểu tượng của menu
//              4       showAsAction    Đặt trong thanh ứng dụng            ifRoom → Hiển thị trên thanh công cụ nếu có đủ không gian,
//                                                                          never → Chỉ hiển thị trong menu khi nhấn vào ba dấu chấm,
//                                                                          always(thì sẽ chỉ hiện các icon trong nó mặc kệ title có ghi gì, nếu bỏ đi thì khi ấn thì sẽ hiện lên title bấm tiếp ms hiện lên các icon)
//              ... (vào trang để xem thêm https://developer.android.com/guide/topics/resources/menu-resource)
//       Code menu.xml
//  Step 2:
//      Khởi tạo menu từ file xml
//  Step 3:
//      Xử lý sự kiện trên menu

// menu.xml thì home và exit sẽ ko có icons
// menu2.xml thì home và exit sẽ có icons vì sử dụng sub icons

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    // Khởi tạo menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu, menu)
        menuInflater.inflate(R.menu.menu2, menu)
        return true
    }

    // Xử lý sự kiện với item được chọn
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mnuExit -> finish()
            R.id.mnuHome -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            R.id.mnuSearch -> Toast.makeText(this, " Search", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}