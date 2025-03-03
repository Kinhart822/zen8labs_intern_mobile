package vn.edu.usth.firebase.authentication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import vn.edu.usth.firebase.R

class GetUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_user)

        val firebaseAuth = FirebaseAuth.getInstance()
        val currentUser = firebaseAuth.currentUser

        if (currentUser != null) {
            val userId = currentUser.uid // Lấy UID của user
            val email = currentUser.email // Lấy email của user

            Log.d("User Info", "ID: $userId, Email: $email")
        } else {
            Log.d("User Info", "No user is signed in")
        }

    }
}