package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class TickTacktoe : AppCompatActivity() {
    var turn = 0;
    var ifwins = false

    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tick_tacktoe)

         btn1 = findViewById<Button>(R.id.btn1)
         btn2 = findViewById<Button>(R.id.btn2)
         btn3 = findViewById<Button>(R.id.btn3)
         btn4 = findViewById<Button>(R.id.btn4)
         btn5 = findViewById<Button>(R.id.btn5)
         btn6 = findViewById<Button>(R.id.btn6)
         btn7 = findViewById<Button>(R.id.btn7)
         btn8 = findViewById<Button>(R.id.btn8)
         btn9 = findViewById<Button>(R.id.btn9)

    }
       fun btnclick(view: View) {
            var button = view as Button

          if(ifwins == false){
              if(button.text == ""){

                  if(turn == 0){
                      button.setText("X")
                      turn = 1
                  }else{
                      button.setText("O")
                      turn = 0
                  }
              }
          }
            whowin()
        }



    fun whowin() {
        var b1 = btn1.text.toString()
        var b2 = btn2.text.toString()
        var b3 = btn3.text.toString()
        var b4 = btn4.text.toString()
        var b5 = btn5.text.toString()
        var b6 = btn6.text.toString()
        var b7 = btn7.text.toString()
        var b8 = btn8.text.toString()
        var b9 = btn9.text.toString()
        if(b1 == b2 && b2 == b3 && b3 != ""){
            Toast.makeText(this, "winner is ${b1}", Toast.LENGTH_SHORT).show()
            ifwins = true
        }else if(b4 == b5 && b5 == b6 && b6 != ""){
            Toast.makeText(this, "winner is ${b6}", Toast.LENGTH_SHORT).show()
            ifwins = true
        }else if(b7 == b8 && b8 == b9 && b9 != ""){
            Toast.makeText(this, "winner is ${b9}", Toast.LENGTH_SHORT).show()
            ifwins = true
        }
        else if(b1 == b5 && b5 == b9 && b9 != ""){
            Toast.makeText(this, "winner is ${b9}", Toast.LENGTH_SHORT).show()
            ifwins = true
        }
        else if(b3 == b5 && b5 == b7 && b7 != ""){
            Toast.makeText(this, "winner is ${b5}", Toast.LENGTH_SHORT).show()
            ifwins = true
        }
    }


    fun clearbtn(view: View) {
        btn1.setText("")
        btn2.setText("")
        btn3.setText("")
        btn4.setText("")
        btn5.setText("")
        btn6.setText("")
        btn7.setText("")
        btn8.setText("")
        btn9.setText("")
    }


}