package vn.edu.usth.layoutapplication.exercises

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.layoutapplication.R

//                                          1. Event
// - Events are the actions performed by the user in order to interact with the application
//          Ví dụ: Pressing a button or touching the screen.
// => The events are managed by the android framework in the FIFO manner i.e. First In – First Out.
//    Handling such actions or events by performing the desired task is called Event Handling.

//                                          2. Overview of the input event management
// Event Listeners:
//      - It is an interface in the View class.
//      - It contains a single callback method.
//          ( Once the view to which the listener is associated is triggered due to user interaction, the callback methods are called )
//  Event Handlers:
//      - It is responsible for dealing with the event that the event listeners registered for and performing the desired action for that respective event.
//  Event Listeners Registration:
//      - Event Registration is the process in which an Event Handler gets associated with an Event Listener so that
//          this handler is called when the respective Event Listener fires the event.
//  Touch Mode:
//      - When using an app with physical keys it becomes necessary to give focus to buttons on which the user wants to perform the action but if the device is
//          touch-enabled and the user interacts with the interface by touching it, then it is no longer necessary to highlight items or give focus to particular View.
//      - In such cases, the device enters touch mode and in such scenarios, only those views for which the isFocusableInTouchMode() is true will be focusable
//          in touch mode.

//      Event Listeners and their respective event handlers
// * OnClickListener()
//          – This method is called when the user clicks, touches, or focuses on any view (widget) like Button, ImageButton, Image, etc.
//          - Event handler used for this is onClick().
// * OnLongClickListener()
//          – This method is called when the user presses and holds a particular widget for one or more seconds.
//          - Event handler used for this is onLongClick().
// * OnMenuItemClickListener()
//          – This method is called when the user selects a menu item.
//          - Event handler used for this is onMenuItemClick().
// * OnTouch()
//          – This method is called either for a movement gesture on the screen or a press and release of an on-screen key.
//          - Event handler used for this is onTouch().

class TinhToanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinh_toan)

        // Mọi code phải đặt sau setContentView
        val edtNhapA = findViewById<EditText>(R.id.edtNhapA)    // Đặt tên biến khác cx đc nhg để đỡ bị nhầm nên đặt tên biến = ìd
        val edtNhapB = findViewById<EditText>(R.id.edtNhapB)
        val edtKQ = findViewById<EditText>(R.id.edtKQ)
        val btnCong = findViewById<Button>(R.id.btnCong)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnNhan = findViewById<Button>(R.id.btnNhan)
        val btnChia = findViewById<Button>(R.id.btnChia)
        var btnNhanLau = findViewById<Button>(R.id.btnNhanLau)
        var btnThoat = findViewById<Button>(R.id.btnThoat)

        // Set text cho textView
        // edtNhapA.setText ("ố là la")

        btnCong.setOnClickListener() {
            var a = edtNhapA.text.toString().toInt()
            var b = edtNhapB.text.toString().toInt()
            var kq = a + b
            edtKQ.setText(kq.toString())
        }
        btnReset.setOnClickListener() {
            edtNhapA.setText("")
            edtNhapB.setText("")
            edtKQ.setText("")
            // Thông báo nhanh trên màn hình
            Toast.makeText(this, "Đã xóa hết rồi", Toast.LENGTH_SHORT).show()
            // Short nhanh hơn Long
        }

        // Tạo sự kiên chia sẻ: 1 biến có thế chia sẻ sự kiện cho >= 2 control
        var suKienChiaSe: View.OnClickListener? = null
        suKienChiaSe = View.OnClickListener{
            if(it == btnNhan){
                var a = edtNhapA.text.toString().toInt()
                var b = edtNhapB.text.toString().toInt()
                var kq = a * b
                edtKQ.setText(kq.toString())
            }
            if(it == btnChia){
                var a = edtNhapA.text.toString().toDouble()
                var b = edtNhapB.text.toString().toDouble()
                var kq = a / b
                edtKQ.setText(kq.toString())
            }
        }
        btnNhan.setOnClickListener(suKienChiaSe)
        btnChia.setOnClickListener(suKienChiaSe)

        // 5.setOnLongClickListener : nhấn lâu trên control
        var suKienNhanLau: View. OnLongClickListener? = null
        suKienNhanLau = View.OnLongClickListener {
            if (it == btnNhanLau){
                Toast.makeText(this, "Bạn đã nhấn lâu trên nút này", Toast.LENGTH_SHORT).show()
                btnNhanLau.visibility = View.GONE  // Ẩn button
            } else if (it == btnNhan) {
                btnNhanLau.visibility = View.GONE
                Toast.makeText(this, "Bạn đã nhấn lâu trên nút này", Toast.LENGTH_SHORT).show()
            }
            // Chú ý: Phải có true nếu ko thì code phần này sẽ bị lỗi
            true
        }
        btnNhanLau.setOnLongClickListener(suKienNhanLau)
        btnNhan.setOnLongClickListener(suKienNhanLau)

        btnThoat.setOnClickListener{
            Toast.makeText(this,"Cảm ơn bạn đã sử dụng phần mềm", Toast.LENGTH_LONG) .show()
            finish() // thoát chương trình
        }
    }
}