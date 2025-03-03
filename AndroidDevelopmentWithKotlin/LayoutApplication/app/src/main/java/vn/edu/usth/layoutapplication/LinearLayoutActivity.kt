package vn.edu.usth.layoutapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
    }
}

// TableLayout
    // android:layout_column=""
    //          <!--       Set vị trí của view trên cột nào đó         -->

    //  android:layout_span=""
    //          <!--       Set vị trí của view nằm trên bao nhiêu cột         -->

    // android:stretchColumns="*"
    //          <!--       Dàn đều các view vừa màn hình         -->

// Linear Layout
    // android:layout_width = ""
    // android:layout_height = ""
    //             Các đơn vị dùng tương ứng: Wrap_content, match_parent, px, pd

    // android:gravity Sắp xếp các thành phần nằm trên view, view group
    //              Các đơn vị dùng tương ứng: center, center_vertical, center_horizontal, left, right

    // android:layout_margin = ""
    // android:layout_marginLeft = ""
    // android:layout_marginTop = ""
    // android:layout_marginRight = ""
    // android:layout_marginBottom = ""
    // android:layout_marginStart = ""
    // android:layout_marginEnd = ""
    //             Căn lề layout so với view chứa nó (Kiểu xem bản thân mình cách thằng cha bn)
    //             Các đơn vị dùng tương ứng: Wrap_content, match_parent, px, pd

    // android:layout_padding = ""
    // android:layout_paddingLeft = ""
    // android:layout_paddingTop = ""
    // android:layout_paddingRight = ""
    // android:layout_paddingBottom = ""
    // android:layout_paddingStart = ""
    // android:layout_paddingEnd = ""
    //             Căn lề nội dung trong nó (Thằng cha quy định cách thằng con phải cách nó bn)
    //             Các đơn vị dùng tương ứng: Wrap_content, match_parent, px, pd

    //  Android:layout_weight:
    //          <!-- Tỉ lệ của view đó so với view mẹ -->
    //          <!-- Mặc đinh view mẹ nếu không đặt thuộc tính weight_sum thì sẽ là 1 và view con sẽ có tỉ lệ nằm trong khoảng từ 0 đến 1 (chấp nhận số thập phân) -->