package vn.edu.usth.firebase.firestore

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.FirebaseFirestore
import vn.edu.usth.firebase.R

class WithADataClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_adata_class)

        val db = FirebaseFirestore.getInstance()

        val user = User("John Doe", "john@example.com", 25)

        // CREATE
        db.collection("users").document("12345").set(user)
            .addOnSuccessListener {
                Log.d("Firestore", "User added successfully")
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error adding user", e)
            }

        // READ
        db.collection("users").document("12345").get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    val user = document.toObject(User::class.java)
                    Log.d("Firestore", "User: ${user?.name} - ${user?.age}")
                }
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error getting user", e)
            }

        // Get All
        db.collection("users").get()
            .addOnSuccessListener { documents ->
                val userList = mutableListOf<User>()
                for (document in documents) {
                    val user = document.toObject(User::class.java)
                    userList.add(user)
                }
                Log.d("Firestore", "Users List: $userList")
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error getting documents", e)
            }

        // UPDATE
        user.name = "Jane Doe"
        db.collection("users").document("12345").update("name", user.name)
            .addOnSuccessListener {
                Log.d("Firestore", "User updated successfully")
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error updating user", e)
            }

        // DELETE
//        db.collection("users").document("12345").delete()
//            .addOnSuccessListener {
//                Log.d("Firestore", "User deleted successfully")
//            }
//            .addOnFailureListener { e ->
//                Log.e("Firestore", "Error deleting user", e)
//            }
    }
}