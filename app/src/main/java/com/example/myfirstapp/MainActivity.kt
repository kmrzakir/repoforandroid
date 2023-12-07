package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate()
    }
    fun calculate() {
        var  edittext1 = findViewById<EditText>(R.id.edittext1)
        var  edittext2 = findViewById<EditText>(R.id.edittext2)
        var addition = findViewById<Button>(R.id.addition)
        var division = findViewById<Button>(R.id.division)
        var multiple = findViewById<Button>(R.id.multiple)


        addition.setOnClickListener {
            var num1 = edittext1.text.toString().toInt()
            var num2 = edittext2.text.toString().toInt()
            Toast.makeText(this, "${num1 + num2}", Toast.LENGTH_SHORT).show()
        }

        division.setOnClickListener {
            var num1 = edittext1.text.toString().toInt()
            var num2 = edittext2.text.toString().toInt()
            Toast.makeText(this, "${num1 / num2}", Toast.LENGTH_SHORT).show()

        }

        multiple.setOnClickListener {
            var num1 = edittext1.text.toString().toInt()
            var num2 = edittext2.text.toString().toInt()
            Toast.makeText(this, "${num1 * num2}", Toast.LENGTH_SHORT).show()
        }

    }
}