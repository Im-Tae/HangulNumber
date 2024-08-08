package com.leaf.hangulnumberapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.leaf.hangulnumber.HangulNumber
import com.leaf.hangulnumberapp.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                resultTextView.text = HangulNumber.numberToHangul(inputEditText.text.toString())
            }
        }

        startRandomNumber()
    }

    private fun startRandomNumber() {
        lifecycleScope.launch {
            while (isActive) {
                val random = Random.nextInt(1, 1000000001)

                val hangulNumber = withContext(Dispatchers.Default) {
                    HangulNumber.numberToHangul(random.toString())
                }

                binding.randomTextView.text = hangulNumber

                delay(5000)
            }
        }
    }
}