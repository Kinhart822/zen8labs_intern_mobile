package vn.edu.usth.listview

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.listview.databinding.ActivityEditListViewBinding

//      CardView là một tiện ích mới trong Android có thể được sử dụng để hiển thị bất kỳ loại dữ liệu nào bằng cách cung cấp bố cục góc tròn cùng với
//    độ cao cụ thể. CardView là chế độ xem có thể hiển thị các chế độ xem chồng lên nhau. Công dụng chính của CardView là giúp mang lại cảm giác phong phú và
//    giao diện cho thiết kế giao diện người dùng. CardView có thể được sử dụng để tạo các mục trong listview hoặc bên trong Recycler View
//    => Muốn chọn phần CardView hẫy nhấn vào mục Containers để tìm

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityEditListViewBinding
class EditListViewActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    // Lateinit Là khởi tạo muộn.
    // Thông thường khai báo biến kotlin sẽ yêu cầu khởi tạo (gán giá trị cho biến)
    // Ta có thể dùng Lateinit để gán giá trị sau khi khởi tạo
    // Ví dụ:
    //          lateinit var chuoi:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Khởi tạo viewbinding
        binding = ActivityEditListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Khai báo danh sách các item list
        var list = mutableListOf<OurData>()
        list.add(OurData(R.drawable.giatocrong,"Gia Tộc Rồng 2022", "Gia Tộc Rồng xoay qui"))
        list.add(OurData(R.drawable.hoanhon, "Hoàn Hồn 2022", "phim giả tưởng"))
        list.add(OurData(R.drawable.thanlan, "Thần Lan Vô Song", "phim kiếm hiệp"))
        list.add(OurData(R.drawable.banghoa, "Băng Hòa Ma Trù 2021", "Băng Hỏa Ma Trù"))

        customAdapter = CustomAdapter(this, list)

        // Khai báo biến list view Phim link tới view lvPhim
        val lvPhim = findViewById<ListView>(R.id.lvPhim)
        lvPhim.adapter = customAdapter

        //list view item click listener
        lvPhim.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
//  AdapterView: AdapterView nơi nhấp chuột đã xảy ra.
//  view View: Chế độ xem trong Chế độ xem bộ điều hợp đã được nhấp (đây sẽ là chế độ xem do bộ điều hợp cung cấp)
//  i int: Vị trí của khung nhìn trong bộ điều hợp.
//  l Long: Id hàng của mục đã được nhấp.
            Toast.makeText(this,"Ban chọn " + list[i].title, Toast.LENGTH_SHORT).show()
        }
    }
}