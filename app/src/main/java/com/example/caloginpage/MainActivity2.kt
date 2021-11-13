package com.example.caloginpage

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import android.widget.*
import android.widget.Toast

import android.widget.CompoundButton

import android.widget.CheckBox



class MainActivity2 : AppCompatActivity() {

    lateinit var RadioBtn: RadioButton
    lateinit var RadioBtn2: RadioButton

    lateinit var RememberMe: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = findViewById<EditText>(R.id.etMobileNumber)
        val password = findViewById<EditText>(R.id.etPassword)
        val Submit = findViewById<Button>(R.id.btnlOGIN)

        RadioBtn = findViewById(R.id.radiobtn1)
        RadioBtn.setOnClickListener{

            if (RadioBtn.isChecked){
                Toast.makeText(applicationContext, "You have selected Male", Toast.LENGTH_SHORT).show()
            }
        }

        RadioBtn2 = findViewById(R.id.radiobtn2)
        RadioBtn2.setOnClickListener{

            if (RadioBtn2.isChecked){
                Toast.makeText(applicationContext, "You have selected Female", Toast.LENGTH_SHORT).show()
            }
        }

        RememberMe = findViewById(R.id.checkbox1)
        RememberMe.setOnClickListener{

            if (RememberMe.isChecked){
                Toast.makeText(applicationContext, "Your login information would be saved for later use", Toast.LENGTH_LONG).show()
            }
        }

    }
}

