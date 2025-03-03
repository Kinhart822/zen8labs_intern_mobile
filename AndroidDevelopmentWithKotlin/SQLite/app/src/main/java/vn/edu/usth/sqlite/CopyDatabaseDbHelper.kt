package vn.edu.usth.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import java.io.File
import java.io.FileOutputStream

class CopyDatabaseDbHelper(private var context: Context) {

// Trong Kotlin, companion object được sử dụng để định nghĩa một khối mã thuộc về lớp (class) nhưng không gắn liền với bất kỳ đối tượng cụ thể nào của lớp đó. Nó
//      cho phép bạn tạo các thành viên (như hàm hoặc biến) được chia sẻ giữa tất cả các đối tượng của lớp. Các thành viên bên trong companion object có
//              thể được truy cập bằng cách sử dụng tên lớp, tương tự như các thành viên tĩnh (static) trong Java.
    companion object {
        private const val DB_NAME = "TUHOCDB.db"
    }

    fun openDatabase(): SQLiteDatabase {
        val dbFile = context.getDatabasePath(DB_NAME)
        val file = File(dbFile.toString())
        Log.wtf("DB", dbFile.toString())
        if (file.exists()) {
            //  Không Làm gì cả
            Log.e("tuhoc", "file đã tổn tại")
        } else {
            copyDatabase(dbFile)
        }
        return SQLiteDatabase.openDatabase(
            dbFile.path,
            null,
            SQLiteDatabase.OPEN_READWRITE
        )
    }

    private fun copyDatabase(dbFile: File) {
        val openDB = context.assets.open(DB_NAME)       // openDB coi như là InputStream
        val outPutStream = FileOutputStream(dbFile)
        val buffer = ByteArray(1024)        // tạo ra một mảng byte có kích thước 1024 byte

        var length: Int
        while (openDB.read(buffer).also { length = it } > 0) {
// Chuyển từng dòng code trong sql (ko đọc 1 lượt) thành nhiều lần 1024 byte đến khi
// hết thì dừng (Vòng lặp while tiếp tục lặp lại cho đến khi inputStream.read(buffer) không còn đọc được dữ liệu nữa
// (tức là trả về -1, nghĩa là đã đọc hết dữ liệu từ file gốc))

// Lặp Nhiều Lần:
// Nếu file của bạn lớn hơn 1024 byte, vòng lặp sẽ lặp nhiều lần. Mỗi lần lặp, bộ đệm buffer sẽ được làm
// đầy bằng một khối dữ liệu từ inputStream và ghi vào outputStream.

            outPutStream.write(buffer, 0, length)   // Phương thức này ghi dữ liệu từ buffer vào outputStream, bắt đầu từ chỉ số 0 và ghi số byte bằng giá trị của length.
            Log.wtf("DB", "writing")
        }

//        while (openDB.read(buffer) > 0) {
//            outPutStream.write(buffer)
//            Log.wtf("DB", "writing")       // sau mỗi lần 1024 thì in dòng này, check ở logcat
//        }               // Code cũ

// Log.wtf là một phương thức đặc biệt trong Android được sử dụng để ghi lại các sự kiện hoặc thông tin trong ứng dụng mà bạn cho là không thể xảy ra. Tên của
//      phương thức này là viết tắt của "What a Terrible Failure," và nó được sử dụng trong các tình huống mà bạn muốn báo cáo một điều gì đó cực kỳ bất thường
//      hoặc lỗi nghiêm trọng mà về lý thuyết không bao giờ nên xảy ra.

            outPutStream.flush()            // Đẩy dữ liệu
            outPutStream.close()            // Đóng dữ liệu
            openDB.close()                  // Đóng db
            Log.wtf("DB", "copy DB completed")

    }
}