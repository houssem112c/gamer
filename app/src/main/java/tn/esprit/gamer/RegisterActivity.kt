package tn.esprit.gamer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register) // Replace with your layout resource ID

        // Initialize UI components and set up any necessary event listeners
        val editTextName = findViewById<EditText>(R.id.editTextText)
        val editTextEmail = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val editTextPassword = findViewById<EditText>(R.id.editTextTextPassword2)
        val editTextPassword2 = findViewById<EditText>(R.id.editTextTextPassword3)
        val buttonRegister = findViewById<Button>(R.id.button2)

        // Set up a click listener for the registration button
        buttonRegister.setOnClickListener {
            // Retrieve user input from EditText fields
            val name = editTextName.text.toString()
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            val password2 = editTextPassword2.text.toString()


            // Perform registration logic here, e.g., send data to a server

            // After successful registration, you can navigate to another activity
            // For example, go to the main activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}
