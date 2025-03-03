package vn.edu.usth.recyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import vn.edu.usth.recyclerview.databinding.ActivityMainBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tạo ds
        val ds= mutableListOf<OutData>()
        ds.add(OutData(R.drawable.banghoa,"Băng hoả ma trù","Phim trung quốc"))
        ds.add(OutData(R.drawable.hoanhon,"Hoàn Hồn","Phim trung quốc"))
        ds.add(OutData(R.drawable.rong,"Gia Tộc Rồng","Phim trung quốc"))
        ds.add(OutData(R.drawable.thanlan,"Thần Lan Chi Mộng","Phim trung quốc"))

//        val adapter = RvAdapter(ds)
        val adapter = RvAdapter(ds, object : RvInterface{
            override fun onClickPhim(pos: Int) {
                Toast.makeText(
                    this@MainActivity,
                    "Bạn đã click vào: ${ds[pos].tenPhim}",
                    Toast.LENGTH_SHORT).show()            }
        })
        // object kế thừa RvInterface nên phải override lại
        binding.rvDemo.adapter = adapter

        // Hiển thị dưới dạng LinearLayout
        binding.rvDemo.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        // Hiển thị dưới dạng GridLayout
        /*binding.rvDemo.layoutManager = GridLayoutManager(
            this,
            2,
            GridLayoutManager.HORIZONTAL,
            false
        )*/
    }
}