package vn.edu.usth.sqlite

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.DialogInterface
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.SearchView
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import vn.edu.usth.sqlite.databinding.ActivityCrudactivityBinding

@SuppressLint("StaticFieldLeak")
lateinit var binding3: ActivityCrudactivityBinding
class CRUDActivity : AppCompatActivity() {
    lateinit var db: SQLiteDatabase
    lateinit var rs: Cursor
    lateinit var adapter: SimpleCursorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding3 = ActivityCrudactivityBinding.inflate(layoutInflater)
        setContentView(binding3.root)

        var helper = MyDbCrudHelper(applicationContext)
        // Đọc database
        db = helper.readableDatabase
        // Thực hiện lệnh đến csdl
        rs = db.rawQuery("SELECT * FROM TUHOC LIMIT 20", null)

        //  1.  Đưa thử dữ liệu của dòng đầu tiên trong db lên edtUser và edtEmail
        /*
        if (rs.moveToLast()){
            binding.edtUser.setText(rs.getString(1))
            binding.edtEmail.setText(rs.getString(2))
        }
*/

        //  2.   Code cho button first
        binding3.btnFirst.setOnClickListener {
            if (rs.moveToFirst()) {
                binding3.edtUser.setText(rs.getString(1))
                binding3.edtEmail.setText(rs.getString(2))
            } else
                Toast.makeText(applicationContext, "No data found", Toast.LENGTH_SHORT).show()
        }

        //  3.   Code cho button next
        binding3.btnNext.setOnClickListener {
            if (rs.moveToNext()) {
                binding3.edtUser.setText(rs.getString(1))
                binding3.edtEmail.setText(rs.getString(2))
            }
            // Nhảy lại về dòng đầu tiên
            else if (rs.moveToFirst()) {
                binding3.edtUser.setText(rs.getString(1))
                binding3.edtEmail.setText(rs.getString(2))
            } else
                Toast.makeText(applicationContext, "No data found", Toast.LENGTH_SHORT).show()
        }

        //  4.  Code cho prev
        binding3.btnPrev.setOnClickListener {
            if (rs.moveToPrevious()) {
                binding3.edtUser.setText(rs.getString(1))
                binding3.edtEmail.setText(rs.getString(2))
            }
            // Nhảy lại về dòng cuối cùng
            else if (rs.moveToLast()) {
                binding3.edtUser.setText(rs.getString(1))
                binding3.edtEmail.setText(rs.getString(2))
            } else
                Toast.makeText(applicationContext, "No data found", Toast.LENGTH_SHORT).show()
        }

        //  5.  Code cho button last
        binding3.btnLast.setOnClickListener {
            if (rs.moveToLast()) {
                binding3.edtUser.setText(rs.getString(1))
                binding3.edtEmail.setText(rs.getString(2))
            } else
                Toast.makeText(applicationContext, "No data found", Toast.LENGTH_SHORT).show()
        }

        //  6. Code phần lvFull
        adapter = SimpleCursorAdapter(
            applicationContext,
            android.R.layout.simple_expandable_list_item_2,
            rs,
            arrayOf("user", "email"),
            intArrayOf(android.R.id.text1, android.R.id.text2),
            0
        )
//  public SimpleCursorAdapter (Context context,
//                int layout,
//                Cursor c,
//                String[] from,
//                int[] to,
//                int flags)

//  Parameters
//      * context Context: The context where the ListView associated with this SimpleListItemFactory is running
//      * layout int: resource identifier of a layout file that defines the views for this list item. The layout file should include at
//                          least those named views defined in "to"
//      * c	Cursor: The database cursor. Can be null if the cursor is not available yet.
//      * from String: A list of column names representing the data to bind to the UI. Can be null if the cursor is not available yet.
//      * to int: The views that should display column in the "from" parameter. These should all be TextViews. The first N views in this
//                          list are given the values of the first N columns in the from parameter. Can be null if the cursor is not available yet.
//      * flags	int: Flags used to determine the behavior of the adapter, as per CursorAdapter#CursorAdapter(Context, Cursor, int).

        binding3.lvFull.adapter = adapter
        // Code cho nút viewAll
        binding3.btnViewAll.setOnClickListener {
            binding3.searchView.visibility = View.VISIBLE
            binding3.lvFull.visibility = View.VISIBLE
            adapter.notifyDataSetChanged()          // Nhận biết khi có sự thay đổi về data
            binding3.searchView.queryHint =
                "Tìm kiếm trong ${rs.count} bản ghi"      // Giống hint trong View
        }

        //  7.  Code cho phần tìm kiếm nội dung
        binding3.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            // Lắng nghe câu lệnh truy vấn từ searchView
            // Ctrl + O
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                rs = db.rawQuery(
                    "SELECT * FROM TUHOC WHERE user LIKE '%${newText}%' or email LIKE '%${newText}%'",
                    null
                )
                adapter.changeCursor(rs)
                return true
            }
        })

        //  8.  Code cho nút insert
        binding3.btnInsert.setOnClickListener {
            var cv = ContentValues()
            cv.put("user", binding3.edtUser.text.toString())
            cv.put("email", binding3.edtEmail.text.toString())
            db.insert("TUHOC", null, cv)
            rs.requery()        // reset và update lại database
            adapter.notifyDataSetChanged()

            var ad = AlertDialog.Builder(this)
            // Tiêu đề thông báo
            ad.setTitle("Add record")
            // Nội dung thông báo
            ad.setMessage("Add thành công")
            // Nút Khẳng định, xác nhận là có
            ad.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                binding3.edtUser.setText("")
                binding3.edtEmail.setText("")
                binding3.edtUser.requestFocus()
            })
            ad.show()

        }

        //  9. Code cho nút update
        binding3.btnUpdate.setOnClickListener {
            var cv = ContentValues()
            cv.put("user", binding3.edtUser.text.toString())
            cv.put("email", binding3.edtEmail.text.toString())
            db.update("TUHOC", cv, "_id=?", arrayOf(rs.getString(0)))
            rs.requery()
            adapter.notifyDataSetChanged()

            var ad = AlertDialog.Builder(this)
            ad.setTitle("Update record")
            ad.setMessage("Update thành công")
            ad.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                binding3.edtUser.setText("")
                binding3.edtEmail.setText("")
                binding3.edtUser.requestFocus()
            })
            ad.show()

        }

        //  10. Code nút clear
        binding3.btnClear.setOnClickListener {
            binding3.edtUser.setText("")
            binding3.edtEmail.setText("")
            binding3.edtUser.requestFocus()
        }

        //  11. Code delete
        binding3.btnDelete.setOnClickListener {
            db.delete("TUHOC", "_id=?", arrayOf(rs.getString(0)))
            rs.requery()
            adapter.notifyDataSetChanged()
            // Thông báo
            var ad = AlertDialog.Builder(this)
            ad.setTitle("Update record")
            ad.setMessage("Update thành công")
            ad.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                if (rs.moveToFirst()) {
                    binding3.edtUser.setText("")
                    binding3.edtEmail.setText("")
                    binding3.edtUser.requestFocus()
                } else {
                    binding3.edtUser.setText("No data found")
                    binding3.edtEmail.setText("No data found")
                }

            })
            ad.show()
        }

        // Đăng ký sử dụng context menu cho listview lvFull
        registerForContextMenu(binding3.lvFull)

    }
    // Menu ngữ cảnh
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.add(100,11,1,"DELETE")
        menu?.setHeaderTitle("Removing data")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId==11)
        {
            Toast.makeText(applicationContext,"Cick lên item trên menu",Toast.LENGTH_SHORT).show()
            db.delete("TUHOC","_id=?", arrayOf(rs.getString(0)))
            rs.requery()
            adapter.notifyDataSetChanged()
            binding3.searchView.queryHint ="Tìm kiếm trong ${rs.count} bản ghi"
        }

        return super.onContextItemSelected(item)
    }
}
