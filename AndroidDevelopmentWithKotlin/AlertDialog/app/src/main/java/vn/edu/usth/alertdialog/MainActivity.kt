package vn.edu.usth.alertdialog

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.alertdialog.databinding.ActivityMainBinding

//                      AlertDialog
@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExit.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.apply {
                // Tiêu để thông báo
                setTitle("Confirm Window?")

                // Nội dung thông báo
                setMessage("Do you want to close this app?")

                // Nút phủ định (không đồng ý)
                setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
                    dialogInterface.dismiss()
                }

                // Nút khẳng định, xác nhận có
                setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
                    finish()
                }

                // Ngăn đóng hộp thoại khi click ra ngoài hộp thoại
                setCancelable(false)
            }
            dialog.show()
        }
    }
}