package vn.edu.usth.datepicker

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.datepicker.databinding.ActivityMainBinding
import java.util.Calendar

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private val today = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Set lại thời gian khi click vào button time
        val startHour = today.get(Calendar.HOUR_OF_DAY)
        val startMinute = today.get(Calendar.MINUTE)
        // Lắng nghe click lên button
        binding.btnTime.setOnClickListener {
            // Timepicker
            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { timePicker, i, i2 ->
                // i: Giờ mà người dùng chọn
                // i2: Phút mà người dùng chọn
                if(i < 10) {
                    binding.txtTime.setText("0$i:$i2")
                } else if (i2 < 10) {
                    binding.txtTime.setText("$i:0$i2")
                } else {
                    binding.txtTime.setText("$i:$i2")
                }
//            }, 0, 0, false).show()
            }, startHour, startMinute, false).show()
            // false sẽ chỉ set 12 số và có 2 chữ am và pm
            // true sẽ set 24 số
        }

        // 1. Set lại thời gian khi click vào button date
        // Lắng nghe click lên button
        binding.btnDate.setOnClickListener {
            //Datepicker
            DatePickerDialog(this, DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
                // i: năm
                // i2: Tháng (vì tháng trg kotlin sẽ chạy từ 0-11 nên phải cộng 1)
                // i3: ngày
                binding.txtDate.setText("$i3/${i2 + 1}/$i")
            }, 2024, 8, 6).show()
        }

    }
}