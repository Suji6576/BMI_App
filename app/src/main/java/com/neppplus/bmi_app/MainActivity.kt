package com.neppplus.bmi_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val mContext = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEdt = findViewById<EditText>(R.id.heightEdt)
        val weightEdt = findViewById<EditText>(R.id.weightEdt)
        val resultBtn = findViewById<Button>(R.id.resultBtn)

        resultBtn.setOnClickListener {
            if (heightEdt.text.isEmpty() || weightEdt.text.isEmpty()){
                Toast.makeText(mContext, "빈칸을 채워주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//            이 아래로는 절대 빈 값이 올 수 없음
            val height : Int = heightEdt.text.toString().toInt()
            val weight : Int = weightEdt.text.toString().toInt()

            val myIntent = Intent(mContext, ResultActivity::class.java)
            startActivity(myIntent)
        }


    }

}