package vn.edu.usth.optionmenuandcontextmenu

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.optionmenuandcontextmenu.databinding.ActivityContextMenuBinding

// Option Menu và Context Menu

@SuppressLint("StaticFieldLeak")
lateinit var binding1: ActivityContextMenuBinding

class ContextMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding1
        binding1 = ActivityContextMenuBinding.inflate(layoutInflater)
        setContentView(binding1.root)

        //Đăng kí menu ngữ cảnh
        registerForContextMenu(binding1.txtContext)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Menu chính
//  add(int groupId, int itemId, int order, CharSequence title)
        menu?.add(1, 1, 1, "Red")
        menu?.add(1, 2, 2, "Green")
        menu?.add(1, 3, 3, "Black")
//  add sub menu
        var subMenu = menu?.addSubMenu("Giới tính")
        subMenu?.add(2, 21, 4, "Male")?.setChecked(false)
        subMenu?.add(2, 22, 5, "FeMale")?.setChecked(false)

        /* setGroupCheckable (int group, boolean checkable, boolean exclusive)
            1. group: id của group muốn có nút check
            2. boolean: true đe cho phép dấu kiểm, false thành không cho phép. Mặc định sẽ là false
            3. Chon true để chỉ được chon 1 item trong group, Chon false tích chon được nhiều lựa chon
        */

        // setChecked mặc định chọn lúc đầu là gì

        subMenu?.setGroupCheckable(2, true, true)
        return super.onCreateOptionsMenu(menu)
    }

    // Xử lý sự kiện trên item menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            1 -> {
                binding1.txtOption.setTextColor(Color.RED)
            }

            2 -> {
                binding1.txtOption.setTextColor(Color.GREEN)
            }

            3 -> {
                binding1.txtOption.setTextColor(Color.BLACK)
            }
            // Tương tác với submenu
            21 -> {
                binding1.txtOption.setText("Male")
            }

            22 -> {
                binding1.txtOption.setText("FeMale")
            }
        }
        return super.onOptionsItemSelected(item)
    }

    // Khởi tạo Context Menu
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.add(3, 31, 1, "Red")
        menu?.add(3, 32, 1, "Green")
        menu?.add(3, 33, 1, "Black")
        menu?.setHeaderTitle("Mời cụ chon màu")
    }

    // Xử lý sự kiện trên item Context Menu
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            31 -> {
                binding1.txtContext.setTextColor(Color.RED)
            }

            32 -> {
                binding1.txtContext.setTextColor(Color.GREEN)
            }

            33 -> {
                binding1.txtContext.setTextColor(Color.BLACK)
            }
        }
        return super.onContextItemSelected(item)
    }


}