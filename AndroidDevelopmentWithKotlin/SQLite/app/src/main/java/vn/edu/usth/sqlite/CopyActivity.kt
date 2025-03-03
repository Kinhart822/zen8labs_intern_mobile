package vn.edu.usth.sqlite

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vn.edu.usth.sqlite.databinding.ActivityCopyBinding

//                                      SQlite database from assets to android studio kotlin
// Copy db vào assets (
//     Step1: chuột phải app ấn new ấn folder ấn assets folder rồi ấn finish
//     Step2: copy db vào assets rồi copy vào data của com.example.bai22_1_copydbfromassets
//  )

@SuppressLint("StaticFieldLeak")
lateinit var binding1: ActivityCopyBinding
class CopyActivity : AppCompatActivity() {
    private var db: CopyDatabaseDbHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding1 = ActivityCopyBinding.inflate(layoutInflater)
        setContentView(binding1.root)

        //1. Sao chép database
        db = CopyDatabaseDbHelper(this)
        db?.openDatabase()
    }
}