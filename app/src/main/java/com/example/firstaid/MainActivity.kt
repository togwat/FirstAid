package com.example.firstaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        big_button.setOnClickListener {
            d("pitama", "Button has been pressed!")      // this output is found in the "Logcat section"
            startActivity(Intent(this, AnotherTest::class.java))
        }
    }
}

//big brian plz workk