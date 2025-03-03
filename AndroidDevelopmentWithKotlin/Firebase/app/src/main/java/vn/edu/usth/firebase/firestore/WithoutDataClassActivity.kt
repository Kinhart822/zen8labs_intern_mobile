package vn.edu.usth.firebase.firestore

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.FirebaseFirestore
import vn.edu.usth.firebase.R

class WithoutDataClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_without_data_class)

        val db = FirebaseFirestore.getInstance()

        val user = hashMapOf(
            "name" to "Jon Doe",
            "email" to "john@example.com",
            "age" to 25
        )

        // Insert
        db.collection("users").add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("Firestore", "Document added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error adding document", e)
            }

        // Get All
        db.collection("users").get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    Log.d("Firestore", "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error getting documents", e)
            }

        // Get By Single ID
        db.collection("users").document("12345").get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    Log.d("Firestore", "User: ${document.data}")
                } else {
                    Log.d("Firestore", "No such document")
                }
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error getting document", e)
            }

        // Update 1 field
        db.collection("users").document("12345")
            .update("age", 30)
            .addOnSuccessListener {
                Log.d("Firestore", "Document updated successfully")
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error updating document", e)
            }

        // Update Multiple Fields
        db.collection("users").document("12345")
            .update(mapOf("name" to "Jane Doe", "age" to 31))
            .addOnSuccessListener {
                Log.d("Firestore", "Document updated successfully")
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error updating document", e)
            }

        // Delete
        db.collection("users").document("12345")
            .delete()
            .addOnSuccessListener {
                Log.d("Firestore", "Document deleted successfully")
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error deleting document", e)
            }

        // Get Users Where Age > 20
        db.collection("users")
            .whereGreaterThan("age", 20)
            .get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    Log.d("Firestore", "${document.id} => ${document.data}")
                }
            }

        // Get Users Where Email = "john@example.com" and Age > 20
        db.collection("users")
            .whereEqualTo("email", "john@example.com")
            .whereGreaterThan("age", 20)
            .get()

    }
}