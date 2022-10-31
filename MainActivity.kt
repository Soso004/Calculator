package com.example.test

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    private var operand = 0.0
    private var operation = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.textView4)
    }



    fun numberClick(clickedView: View){
        if (clickedView is TextView){
            var text = resultTextView.text.toString()
            val number = clickedView.text.toString()

            if (text == "0"){
                text = ""
            }

            val result = text + number

            resultTextView.text = result
        }
    }
    fun operationClick(clickedView: View){
        if (clickedView is TextView)
            operand = resultTextView.text.toString().toDouble()

        resultTextView.text = ""
    }
    fun equalsClick(clickedView: View){
        val secOperand = resultTextView.text.toString().toDouble()

        when(operation){
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()
            "/" -> resultTextView.text = (operand / secOperand).toString()
        }

    }

}