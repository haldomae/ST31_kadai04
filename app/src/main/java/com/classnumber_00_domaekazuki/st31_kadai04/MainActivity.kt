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
        // EditTextを取得
        val input: EditText =
            findViewById(R.id.input_num)
        // ボタンを取得
        val plusButton: Button =
            findViewById(R.id.plusButton)
        // ボタンにクリックリスナーを付ける
        plusButton.setOnClickListener {
            // ボタンが押されたときにEditTextの文字を取得
            val inputText = input.text

            // ログ出力
            // インフォメーション
            Log.i("DEBUG_LOG", inputText.toString())
            // デバックのログ
            Log.d("デバッグ", inputText.toString())
            // ワーニング
            Log.w("デバッグのログ", inputText.toString())
            // エラーログ
            Log.e("error", inputText.toString())
        }
    }
}