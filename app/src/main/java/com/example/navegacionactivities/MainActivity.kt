package com.example.navegacionactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_FORM = "com.example.navegacionactivities.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val email = editTextTextPersonName.text.toString()

        val personForm = PersonForm(email)

        val intent = Intent(this,DisplayMessageActivity::class.java).apply{
            putExtra(EXTRA_FORM,personForm)
        }

        startActivity(intent)
    }
}