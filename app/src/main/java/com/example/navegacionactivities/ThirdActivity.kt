package com.example.navegacionactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {

    var personForm = PersonForm("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        personForm = intent.getSerializableExtra(EXTRA_FORM2) as PersonForm
        val textView = findViewById<TextView>(R.id.textView2).apply{
            text = personForm.email + " | " + personForm.generaCodigo()
        }
    }

}