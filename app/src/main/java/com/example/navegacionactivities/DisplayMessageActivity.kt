package com.example.navegacionactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*

const val EXTRA_FORM2 = "com.example.navegacionactivities.MESSAGE2"

class DisplayMessageActivity : AppCompatActivity() {

    var personForm = PersonForm("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        personForm = intent.getSerializableExtra(EXTRA_FORM) as PersonForm
        val textView = findViewById<TextView>(R.id.textView).apply{
            text = personForm.email
        }
    }
    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.nameInput)

        personForm.firstName =  nameInput.text.toString()
        personForm.lastName =  lastNameInput.text.toString()
        personForm.surname =  surnameInput.text.toString()

        val intent = Intent(this,ThirdActivity::class.java).apply{
            putExtra(EXTRA_FORM2,personForm)
        }

        startActivity(intent)
    }
}