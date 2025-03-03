package vn.edu.usth.layoutapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConstrainLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrain_layout)
    }
}

//               Constrain Layout

//           1. Ràng buộc view với ViewGroup
// - Constrain Layout là một ViewGroup làm việc dựa vào ràng buộc giữa các View
// => A ConstraintLayout is similar to a RelativeLayout, but having more power
// - Ví dụ :
//              Button phía dưới có 4 vòng trọn tại 4 cạnh, ta có thể click chuột để thiết lập ràng buộc
// - Chú ý: nếu chỉ có 1 nối 1 trong 4 vòng tròn theo hướng horizontal or vertical thì nó sẽ hiện lỗi Missing Constraints,
//          để sửa đổi thì cần thêm ràng buộc nhưng theo chiều ngược lại với nó vertical or horizontal
// => Mỗi view phải có ít nhất 1 ràng buộc Horizontal và 1 ràng buộc Vertical, ếu ràng buộc này không được thêm vào thì view sẽ được đặt tại điểm gốc zero (0,0)

//           2. Ràng buộc View với View
// - Ví dụ :
//              Có 2 button mỗi cái đều có 4 vòng trọn tại 4 cạnh, ta có thể click chuột để thiết lập ràng buộc giữa 2 cái
//           3. Auto ràng buộc khi kéo thả view
// - Ấn vào biểu tượng nam châm để enable auto ràng buộc, khi kéo thả 1 view nó sẽ tự ràng buộc với parent
//           4. Default Margin
// - Default Margin : Quy định xem khoảng cách mặc định khi ràng buộc các View là bao nhiêu
// - Chỉnh bằng cách nhấn biểu tượng tiếp đến nam châm hoặc chỉnh ở phần layout của Attributes
//           5. Lấp đầy vùng ràng buộc
// - Cho 2 button ràng buộc với nhau sau đó chỉnh layout_width của 1 button về 0 hay vì wrap_content
//           6. Xoá tất cả các ràng buộc
// - Ấn vào biểu tượng tiếp đến Default Margin để xóa các ràng buộc
//           7. Xếp vị trí và tự động ràng buộc
// - Ấn vào biểu tượng tiếp đến Clear All Constraints là Infer Constraints sẽ tư động thiết lập ràng buộc
