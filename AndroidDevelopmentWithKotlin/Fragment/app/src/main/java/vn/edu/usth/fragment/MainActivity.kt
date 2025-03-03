package vn.edu.usth.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import vn.edu.usth.fragment.databinding.ActivityMainBinding

//                       Fragments kotlin
//               1. Tại sao cần dùng Fragment ?
// - Tại một thời điểm thì chỉ có 1 Activity được hiển thị => Khi muốn sử dụng nhiều màn hình con trên cùng 1 activity, ta sử dụng Fragment.
// - Fragment có thể coi là sub-activity (activity con).
// - Dùng trong trường hợp hiển thị tương thích trên các thiết bị có độ lớn màn hình khác nhau.
//               2. Một số đặc điểm tiêu biểu :
// - Fragment cũng có vòng đời riêng của nó.
// - Có thể thêm, xóa, thay đổi fragment trong activity khi activity vẫn đang chạy.
// - Một Fragment có thể được sử dụng trong nhiều Activities.
// - Vòng đời của Fragment có quan hệ chặt chẽ với vòng đời của Activity đang dùng, khi Activity bị tạm dừng thì các Fragment sẽ dừng lại.

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sub1 = Fragment1()
        val sub2 = Fragment2()

        binding.btnF1.setOnClickListener {
            // Cũ
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.fl1, sub1, "Fragment1")
//            }

            // Mới - phải thêm thư viên "implementation("androidx.fragment:fragment-ktx:1.6.0")"
            supportFragmentManager.commit {
                replace(R.id.fl1, sub1, "Fragment1")
            }
        }

        binding.btnF2.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.fl1, sub2, "Fragment2")
            }
        }
    }
}