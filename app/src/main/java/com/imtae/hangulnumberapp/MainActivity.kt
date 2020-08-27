package com.imtae.hangulnumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imtae.hangulnumber.HangulNumber
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RandomThread().start()

        button.setOnClickListener {
            resultTextView.text = HangulNumber.numberToHangul(inputEditText.text.toString())
        }
    }

    inner class RandomThread : Thread() {

        override fun run() {

            while(true) {
                Thread.sleep(1000)

                val random = (1..1000000000).random()

                runOnUiThread {
                    randomTextView.text = HangulNumber.numberToHangul(random.toString())
                }
            }
        }
    }
}