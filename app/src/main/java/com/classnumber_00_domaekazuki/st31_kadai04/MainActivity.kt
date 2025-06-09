package com.classnumber_00_domaekazuki.st31_kadai04

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
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
        val input: EditText =
            findViewById(R.id.input_num)
        // ボタンを取得
        val button: Button =
            findViewById(R.id.plusButton)
        // ボタンを押した時の処理
        button.setOnClickListener {
            // EditTextに入力された文字を取得して、String型に変更
            val inputText = input.text.toString()

            // ログに出力
            Log.i("DEBUG_LOG", inputText)
            Log.e("デバッグ", inputText) // エラーログ
            Log.d("ログ", inputText) // デバッグログ
        }
    }
}