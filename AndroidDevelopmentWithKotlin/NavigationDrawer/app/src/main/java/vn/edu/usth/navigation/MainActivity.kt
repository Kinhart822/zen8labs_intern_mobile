package vn.edu.usth.navigation

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.navigation.databinding.ActivityMain2Binding

// NavigationView kotlin
//       1. Các bước xây dựng
//  Step 1:
//      Make xml layout (sử dụng drawerlayout và chú ý mỗi drawerlayout phải có NavigationView và trg NavigationView phải có android:layout_gravity="start")
//      Header (Thêm implementation("de.hdodenhof:circleimageview:3.1.0") để lấy CircleImageView)
//  Step 2:
//      Make menu xml
//  Step 3:
//      Khai báo header + menu vào NavigationView

@SuppressLint("StaticFieldLeak")
lateinit var binding: ActivityMain2Binding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // sử dụng màu cho icon
        binding.navLefMenu.itemIconTintList = null

        //lắng nghe sự kiện click lên item menu
        binding.navLefMenu.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_Home-> Toast.makeText(this,"Home", Toast.LENGTH_SHORT).show()
                R.id.nav_Message-> Toast.makeText(this,"Message", Toast.LENGTH_SHORT).show()
                R.id.nav_Exit->finish()
            }
            true
        }
    }
}