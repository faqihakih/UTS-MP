package com.example.uts_mp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_mp.R
import kotlinx.android.synthetic.main.activity_kalkulator.*

class KalkulatorActivity : AppCompatActivity() {
    private val count = Count()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        var nilai1 = nilaiA.text
        var nilai2 = nilaiB.text

        btnHitung.setOnClickListener {
            hasil.text = "Hasilnya =  ${count.CountNumber(nilai1.toString().toInt(),nilai2.toString().toInt())}"}
        }
    }
