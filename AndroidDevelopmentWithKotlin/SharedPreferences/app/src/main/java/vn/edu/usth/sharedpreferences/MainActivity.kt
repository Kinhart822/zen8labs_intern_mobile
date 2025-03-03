package vn.edu.usth.sharedpreferences

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.sharedpreferences.databinding.ActivityMainBinding

//                       1 . Khái quát SharedPreferences
//  - Giả sử bạn đang chơi game, có cuộc gọi đến => ưu tiên số 1 của moblie vẫn là call
//          => ứng dụng trò chơi của bạn sẽ chuyển sang phương thức tạm dừng (onPause) hoặc dừng onStop
//          => Sử dụng sharedPreferences để lưu trữ dữ liệu => Khi bạn quay lại trò chơi
//                  một lần nữa, bạn sẽ có thể tiếp tục nơi bạn đã dừng lại Và cũng với số điểm cuối cùng của bạn.
//  - Bạn cũng có thể sử dụng lớp này để lưu lại dữ liệu, chẳng hạn như điểm cuối cùng, điểm cao nhất....
//  - Bạn có thể sử dụng lớp này để lưu log đăng nhập, nhật ký người dùng.
//          Ví dụ: hầu hết các ứng dụng đều có trang đăng nhập. Trên trang này, người dùng phải nhập tên người dùng và mật khẩu.
//              Nếu người dùng không muốn nhập thông tin này mỗi lần, lập trình viên có thể code thêm phần tích chọn Ghi nhớ và sau khi chọn hộp kiểm, ứng
//              dụng sẽ lưu dữ liệu của người dùng. Và khi người dùng quay lại ứng dụng, người dùng sẽ không phải mất thời gian nhập lại username và password.

@SuppressLint("StaticFieldLeak")
lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    // Khai báo các biến
    var dem = 0
    var send: String? = null
    var message: String? = null
    var isChecked: Boolean? = null
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDem.setOnClickListener {
            dem++
            binding.btnDem.text = dem.toString()
        }
    }

    override fun onPause() {
        super.onPause()
        saveData()
    }

    override fun onResume() {
        super.onResume()
        callData()
    }

    private fun callData() {
        sharedPreferences = this.getSharedPreferences(
            "saveData",
            Context.MODE_PRIVATE
        )
        send = sharedPreferences.getString("key_send", null)
        message = sharedPreferences.getString("key_mes", null)
        dem = sharedPreferences.getInt("key_dem", 0)
        isChecked = sharedPreferences.getBoolean("key_remember", false)

        binding.edtSend.setText(send)
        binding.edtMessage.setText(message)
        binding.btnDem.text = dem.toString()
        binding.chkRemember.isChecked = isChecked!!
    }

    @SuppressLint("CommitPrefEdits")
    private fun saveData() {
        // Lưu vào file vs tên là gì
        sharedPreferences = this.getSharedPreferences(
            "saveData",
            Context.MODE_PRIVATE            // MODE_PRIVATE: cấp quyền truy cập mọi nơi trong ứng dụng
        )
        send = binding.edtSend.text.toString()
        message = binding.edtMessage.text.toString()
        isChecked = binding.chkRemember.isChecked

        // Lưu thông tin, key phải là duy nhất
        val editor = sharedPreferences.edit()
        editor.putString("key_send",send)
        editor.putString("key_mes", message)
        editor.putInt("key_dem",dem)
        editor.putBoolean("key_remember", isChecked!!)          //  !! (unsafe call operator): khẳng định rằng biểu thức không bao giờ trả về giá trị null.
        editor.apply()
        Toast.makeText(applicationContext, "Data đã được lưu", Toast.LENGTH_SHORT).show()

        // => Muốn kiểm tra dữ liệu thì vào Device File Explorer để tìm
    }
}