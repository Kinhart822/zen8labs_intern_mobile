package vn.edu.usth.alertdialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.alertdialog.databinding.ActivityCustomAlertDialogBinding
import vn.edu.usth.alertdialog.databinding.CustomDialogBinding

//          Custom AlertDialog
//                           1. Các bước xây dựng
//  Step 1:
//          Make xml layout
//          CustomLayout
//  Step 2:
//          Chuyển xml thành view
//                           2. Xây dựng layout
//  Step 1: Xây dựng Custom layout xml
//              Thêm nút x bằng vector (android:background="@android:color/transparent" - cách làm hòa button vs màu background)
//              Gradient color bằng layerlist
//  Step 2: Code Main Activity
//              Code bntThoat, btnThamGia
//              Thiết lập nền trong suốt

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityCustomAlertDialogBinding
private lateinit var dialog: AlertDialog
class CustomAlertDialogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding = ActivityCustomAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            showDialogNormal()
//            showDialogBinding()
        }
    }

    private fun showDialogBinding() {
        val build = AlertDialog.Builder(this, R.style.Themecustom)
        // Thêm R.style.Themecustom để tránh mấy cái chỗ trắng ở 4 góc
        //<!--   Quản lý khung to nhỏ của cửa sổ bật lên    -->
        //        <item name="android:windowMinWidthMinor">90%</item>
        val dialogBinding = CustomDialogBinding.inflate(LayoutInflater.from(this))
        build.setView(dialogBinding.root)

        // Code nút close
        dialogBinding.btnClose.setOnClickListener {
            dialog.dismiss()
        }
        // Code nút tham gia
        dialogBinding.btnThamGia.setOnClickListener {
            Toast.makeText(
                this,
                "Bạn đã tham gia thành công",
                Toast.LENGTH_SHORT
            ).show()
        }

        dialog = build.create()
        dialog.show()
    }

    private fun showDialogNormal() {
        val build = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.custom_dialog, null)
        build.setView(view)

        // Code nút close
        val btnClose = view.findViewById<ImageButton>(R.id.btnClose)
        btnClose.setOnClickListener {
            dialog.dismiss()
        }
        // Code nút tham gia
        val btnThamGia = view.findViewById<Button>(R.id.btnThamGia)
        btnThamGia.setOnClickListener {
            Toast.makeText(
                this,
                "Bạn đã tham gia thành công",
                Toast.LENGTH_SHORT
            ).show()
        }

        dialog = build.create()
        dialog.show()
    }

}