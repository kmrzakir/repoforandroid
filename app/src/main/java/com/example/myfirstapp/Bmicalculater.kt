package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class Bmicalculater : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculater)

        calculatebmi()
    }

    fun calculatebmi() {
        var edttexthightin = findViewById<EditText>(R.id.edttexthightin)
        var edttextwet = findViewById<EditText>(R.id.edttextwet)
        var edttexthightft = findViewById<EditText>(R.id.edttexthightft)
        var btncalculate = findViewById<Button>(R.id.btncalculate)
        var showresult = findViewById<TextView>(R.id.showresult)
        var linearLayoutbmi = findViewById<LinearLayout>(R.id.bmilinearlayout)

        btncalculate.setOnClickListener {

            var wet = edttextwet.text.toString().toInt()
            var inch = edttexthightin.text.toString().toInt()
            var feet = edttexthightft.text.toString().toInt()
            var totalin = feet*12 + inch
            var totalcm = totalin * 2.53
            var totalM = totalcm/100
            var bmi = wet/(totalM * totalM)

            if(bmi>25){
                showresult.setText("you are overweight")
                linearLayoutbmi.setBackgroundColor(resources.getColor(R.color.overweight))
            }else if(bmi<18){
                showresult.setText("you are underweight")
                linearLayoutbmi.setBackgroundColor(resources.getColor(R.color.underweight))
            }else{
                showresult.setText("you are healthy")
                linearLayoutbmi.setBackgroundColor(resources.getColor(R.color.healthy))
            }
        }
    }

}