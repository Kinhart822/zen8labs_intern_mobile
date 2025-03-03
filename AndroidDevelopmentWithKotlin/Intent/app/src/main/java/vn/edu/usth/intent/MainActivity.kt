package vn.edu.usth.intent

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.intent.databinding.ActivityMain2Binding
import vn.edu.usth.intent.databinding.ActivityMainBinding

//  Intent
//                              1, Khái niệm Intent là gì?
// - Trong Android, Intent là những tin nhắn không đồng bộ cho phép các component của ứng dụng (như activities, services, broadcast receivers và content
//          providers) yêu cầu chức năng từ một component khác.
//                              2. Phân loại Intent:
//  * Intent tường minh
//          - Thường được sử dụng để khởi chạy các component trong cùng một ứng dụng.
//  * Intent không tường minh
//          - Không tường minh vì nó không chỉ định tên của component sẽ bắt đầu
//                  Ví dụ: sử dụng để mở 1 url dung trình duyệt của thiết bị, mở camera để chụp ảnh…

//                              3. Gửi dữ liệu qua các Activity
//  - Dữ liệu được “nhét” vào trong Intent và được lấy ra khỏi Intent theo các cặp dữ liệu dạng key/value
//  - Điều này tương tự như khi bạn di chuyển đi chơi xa, thì khi đóng gói hành lý của bạn, nhân viên tiếp nhận hành lý phải dán nhãn tên của bạn hay ID của
//          bạn lên hành lý, để đảm bảo bạn lấy đúng hành lý (chính là value) khi đến nơi dựa vào nhãn tên hay ID đó (chính là key)
//   Có 2 Cách truyền dữ liệu qua Activity:
//           1. Dùng trực tiếp từ Intent (gửi đơn lẻ từng dữ liệu)
//           2. Đóng gói vào Bundle (đóng gói sau đó gửi 1 lần)
//                                          * Cách 1 : Truyền trực tiếp bằng Intent
//  Step1: Tại activity_manhinh2.xml thêm ô multitex để hiển thị dữ liệu truyền từ màn hình MainActivity
//  Step2: Gửi dữ liệu putExtra() không có s
//  Step3: Nhận dữ liệu
//                                          * Cách 2 : Gửi và nhận bằng bundle
//  Step1:  Nhận dữ liệu
//  Step2:  Gửi dữ liệu
//  Step3:  Nhận dữ liệu

//  Chú ý:
// * Nếu như Extra trên kia sẽ “xé lẻ” dữ liệu ra và gởi theo từng dòng. Thì Bundle sẽ giúp bạn “đóng gói” dữ liệu lại và gởi nguyên kiện.
//      Tất nhiên Bundle sẽ tiện hơn trong trường hợp bạn muốn gởi cùng một bộ dữ liệu đến nhiều Activity khác nhau.
// * Ngoài nhiệm vụ đóng gói dữ liệu để truyền qua lại giữa các Activity ở bài học này, thì Bundle còn dùng trong một số mục đích khác, đơn
//      cử như truyền dữ liệu qua Fragment mà bạn sẽ được biết ở loạt bài sau.

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Gọi màn hình 2 từ màn hình main (Intent tường minh)
        binding.btnGo.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)

            // Cách 1: Truyền dữ Liệu trực tiếp intent
            /*i.putExtra("bienString","chào mừng đến với tuhoc.cc")
            i.putExtra("bienDouble",12345.678)
            i.putExtra("bienBool",true)
            startActivity(i)*/

            // Cách 2: Truyền dữ Liệu bằng bundle
            // Nạp dữ Liệu vào bundle
            val bundle = Bundle()
            bundle.putString("bienString", "chào mừng đến với tuhoc.cc")
            bundle.putDouble("bienDouble", 12345.678)
            bundle.putBoolean("bienBool",true)
            bundle.putInt("bienInt", 23)
            // Đặt bundle vào trong Intent
            i.putExtras(bundle)
            startActivity(i)
        }

        // Gọi url từ màn hình main (Intent ko tường minh)
        binding.btnGo4.setOnClickListener {
            val i2 = Intent(Intent.ACTION_VIEW, Uri.parse("http://tuhoc.cc"))
            startActivity(i2)
        }
    }
}