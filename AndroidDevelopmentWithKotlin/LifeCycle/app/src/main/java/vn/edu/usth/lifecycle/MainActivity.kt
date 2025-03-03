package vn.edu.usth.lifecycle

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.lifecycle.databinding.ActivityMainBinding

//                                      1/ Applications
// - Mỗi một Android Project khi bạn biên dịch thành công thì sẽ được đóng gói thành tập tin .apk, tập tin .apk được gọi là một Application
//          Ví dụ : zalo, facebook, momo...

//                                      2/ Activity là gì ?
// - Thông thường trong một ứng dụng (Application) sẽ có một hoặc nhiều Activity (bạn hiểu đại khái là các màn hình tương tác)
// - Khi một Activity chỉ định là Main Activity, nó sẽ là màn hình đầu tiên khi khởi chạy ứng dụng. Activity này có thể gọi và kích hoạt một Activity khác

//                                      3/ Tại sao phải nắm vòng đời của Activity ?
//  Ví dụ:
//           Đang sử dụng có cuộc gọi đến, chen ngang phần mềm
//           Đang sử dụng có ứng dụng khác chen 1 phần, hoặc che toàn bộ
//       => Cả hai trường hợp này người dùng đều không tương tác được với phần mềm => activity có thể chuyển sang trạng thái stop
// - Nếu đang ở trạng thái Stop thì phần mềm có thể sẽ bị tắt ngang,
// Ví dụ:
//           Khi đang nghe điện thoại, ưu tiên số 1 điện thoại sẽ ưu tiên cho cuộc gọi, nên các app chạy nền có thể sẽ bị destroyed
//           Đang sử dụng ứng dụng khác cần nhiều bộ nhớ hệ thống, nó sẽ ưu tiên cho ứng dụng chúng ta đang sử dụng và nó cũng destroyed ứng dụng chạy nền
//       => Chúng ta cần xử lý lưu dữ liệu, hoặc lưu trạng thái... để tránh loss dữ liệu

//                                      4/ Xây dựng mô phỏng khi khởi chạy ứng dụng
//  Step 1: xây dựng layout màn hình chính
//  Step 2: xây dựng layout màn hình phụ 2, 3
//  Step 3: xây dựng Code mainactivity

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //  Gọi màn hình 2 từ màn hình main
        binding.btnGo.setOnClickListener {
            val intent1 = Intent(this, MainActivity2::class.java)
            startActivity(intent1)
        }

        // Gọi màn hình 3 từ màn hình main
        binding.btnGo3.setOnClickListener {
            val intent2 = Intent(this, MainActivity3::class.java)
            startActivity(intent2)
        }
        // Muốn hiển thị dưới dạng cửa sổ thì mình phải vào AndroidManifest.xml rồi
        // xuống phần activity thêm phần này vào android:theme="@style/Theme.AppCompat.Dialog"
        // nếu che khuất 1 phần thì nó sẽ dừng ở phần Paused thay vì phần Stopped
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}