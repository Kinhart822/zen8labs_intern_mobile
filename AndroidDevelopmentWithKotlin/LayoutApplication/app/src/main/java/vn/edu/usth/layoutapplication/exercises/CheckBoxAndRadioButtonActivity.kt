package vn.edu.usth.layoutapplication.exercises

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.layoutapplication.R
import vn.edu.usth.layoutapplication.databinding.ActivityCheckBoxAndRadioButtonBinding

//      I/ Tip Bỏ qua khai báo biến
//                           1. Add plugins (Phiên bản android cũ)
//  Dùng để bỏ qua bước khai báo biến - kết nối với các view khi coding
// - Vào mục gradle Scripts chọn phần build.gradle.kts(:app) và chỉnh plugins như dưới:
//          plugins {
//              id 'com.android.application'
//              id 'org.jetbrains.kotlin.android'
//              id 'kotlin-android'
//              id 'kotlin-android-extensions'
//          }
//                           2. Viewbinding (Phiên bản android mới)
// Dùng để bỏ qua bước khai báo biến
// - Vào mục gradle Scripts chọn phần build.gradle.kts(:app) và thêm đoạn code dưới:
//          buildFeatures {
//              viewBinding = true
//          }
// - Code thêm và sửa trong MainActivity.kt
//          private lateinit var binding: ActivityMainBinding
//
//          super.onCreate(savedInstanceState)
//
//          // Khởi tạo viewbinding
//          binding = ActivityMainBinding.inflate(layoutInflater)
//          setContentView(binding.root)

//      II/ Checkbox
// - Dùng để cho người dùng tích chọn. Có thể chọn nhiều lựa chọn 1 lúc
// - id : bắt đầu bằng tiền tố chk. Ví dụ : chkSoThich
// - chkSoThich.isChecked = true tức là có lựa chọn được chọn

//      III/ Radio Group, RadioButton
// - Radio Group : Gom nhóm các radio button
// - RadioButton :
//       Dùng để cho người dùng tích chọn. Chỉ chọn được 1 lựa chọn
//       id : bắt đầu bằng tiền tố rad Ví dụ : radGioiTinh
//       radGioiTinh. isChecked = true tức là có lựa chọn được chọn

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityCheckBoxAndRadioButtonBinding
class CheckBoxAndRadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_and_radio_button)

        // Khởi tạo viewbinding
          binding = ActivityCheckBoxAndRadioButtonBinding.inflate(layoutInflater)
          setContentView(binding.root)

        binding.btnTest.text = "AAAAAAAAAAAAAAAABBBBBBBBBBBB"

        addEvents()
    }

    private fun addEvents() {
        // Xử lí sự kiện khi click vào nút chọn sở thích
        binding.btnChonSoThich.setOnClickListener {
            xuLyChonSuKien()
        }

        // Xử lý xác nhận giới tính
        binding.btnXacNhan.setOnClickListener {
            xuLyXacNhan()
        }
    }

    private fun xuLyXacNhan() {
        var s:String = ""
        if (binding.radNam.isChecked) {
            s = binding.radNam.text.toString()
        } else {
            s = binding.radNu.text.toString()
        }

        // Xử lý chuỗi s
        if(s==""){
            Toast.makeText(this, "Bạn chưa chọn giới tính" , Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Bạn chọn giới tính: " + s, Toast.LENGTH_SHORT).show()
        }
    }

    private fun xuLyChonSuKien() {
        var s:String = ""
        if (binding.chkNgheNhac.isChecked) {
            s += binding.chkNgheNhac.text.toString() + "\n"
        }
        if (binding.chkXemPhim.isChecked) {
            s += binding.chkXemPhim.text.toString() + "\n"
        }
        if (binding.chkChoiTheThao.isChecked) {
            s += binding.chkChoiTheThao.text.toString() + "\n"
        }
        if (binding.chkShopping.isChecked) {
            s += binding.chkShopping.text.toString()
        }
        if (binding.chkDuLich.isChecked) {
            s += binding.chkDuLich.text.toString()
        }

        // Gán vào ô edit sở thích
        binding.edtSoThich.setText(s)
    }
}