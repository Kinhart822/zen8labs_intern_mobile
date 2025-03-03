package vn.edu.usth.layoutapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
    }
}

// Relative Layout
// RelativeLayout và các Layout con của nó hiển thị bằng các quan hệ với các layout trong cùng một layout cha, hoặc với chính layout cha.
//      Vị trí dựa trên quan hệ: layout_above, layout_below, layout_toLeftOf, layout_toRightOf
//      Vị trí dựa trên layout cha: android:layout_centerHorizontal, android:layout_centerVertical
//      Căn chỉnh dựa trên quan hệ: layout_alignTop, layout_alignBottom, layout_alignLeft, layout_alignRight, layout_alignBaseline
//      Căn chỉnh dựa trên layout cha: layout_alignParentTop, layout_alignParentBottom, layout_alignParentLeft, layout_alignParentRight

// Khác biệt
// LinearLayout là một ViewGroup có trách nhiệm giữ các view trong nó theo chiều ngang hoặc chiều dọc.
// RelativeLayout là một layout trong đó chúng ta có thể sắp xếp các view / widget theo vị trí của các view / widget khác.

// Chú ý
// Khi chưa thiết lập mối ràng buộc vị trí với ViewGroup cha, hoặc với các view con khác thì mặc định các view sẽ được đặt tại gốc 0,0 (góc trên, bên trái màn hình)
// View khai báo sau sẽ chồng lên view khai báo trước nó

// 1 số tính chất của layout
//  Android: gravity
//                         Sắp xếp các thành phần nằm trên view, view group
//          Các đơn vị dùng tương ứng: center, center_vertical, center_horizontal, left, right

// ignoreGravity : Bỏ qua áp dụng Gravity với 1 view nào đó

// ##1. Thiết lập vị trí giữa view con và view cha : Dựa trên align
// (Thiết lập tại view con)
//          android: layout_alignParentBottom
//          android: layout_alignParentEnd
//          android:layout_alignParentLeft
//          android:layout_alignParentRight
//          android: layout_alignParentStart
//          android: layout_alignParentTop
// Ví dụ 1:     android: layout_alignParentBottom="true"    ->      Cạnh dưới view con trùng với cạnh dưới view cha
//              android: layout_alignParentEnd="true"       ->      Cạnh trái view con trùng với cạnh trái view cha
//  Ví dụ 2: Nếu có nhiều ràng buộc vị trí
//              android:layout_alignParentBottom="true"
//              android: layout_alignParentTop="true"
//      ->  Cạnh dưới và cạnh trên của view con trùng cạnh dưới và trên của view cha

// ##2. Thiết lập vị trí giữa view con và view cha : Căn giữa center
//          android: layout_centerInParent
//          android: layout_centerHorizontal
//          android: layout_centerVertical

// ##3. Thiết lập vị trí giữa view con với view con : Trên, dưới, trái, phải
//          android: layout_above
//          android: layout_below
//          android: layout_toLeftOf
//          android: layout_toRightOf

// ##4. Thiết lập vị trí giữa view con với view con : Căn các cạnh view con align
//          android: layout_alignTop
//          android: layout_alignBottom
//          android: layout_alignLeft
//          android: layout_alignRight