package com.classnumber_00_domaekazuki.st31_kadai04

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 入力欄を取得
        val input1: EditText = findViewById(R.id.input_num_1)
        val input2: EditText = findViewById(R.id.input_num_2)

        // 四則演算のボタンを取得
        val operator1 : Button = findViewById(R.id.operator_1)
        val operator2 : Button = findViewById(R.id.operator_2)
        val operator3 : Button = findViewById(R.id.operator_3)
        val operator4 : Button = findViewById(R.id.operator_4)

        // 結果表示欄を取得
        val result: TextView = findViewById(R.id.result)

        // 足し算を実行
        operator1.setOnClickListener {
            val num1 = input1.text.toString().toInt()
            val num2 = input2.text.toString().toInt()
            result.text = (num1 + num2).toString()
        }

        // 足し算を実行
        operator2.setOnClickListener {
            val num1 = input1.text.toString().toInt()
            val num2 = input2.text.toString().toInt()
            result.text = (num1 - num2).toString()
        }

        // 足し算を実行
        operator3.setOnClickListener {
            val num1 = input1.text.toString().toInt()
            val num2 = input2.text.toString().toInt()
            result.text = (num1 * num2).toString()
        }

        // 足し算を実行
        operator4.setOnClickListener {
            val num1 = input1.text.toString().toInt()
            val num2 = input2.text.toString().toInt()
            result.text = (num1 / num2).toString()
        }
    }
}