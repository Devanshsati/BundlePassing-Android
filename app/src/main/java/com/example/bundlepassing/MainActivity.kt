package com.example.bundlepassing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bundlepassing.databinding.ActivityMainBinding
import com.example.bundlepassing.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val name = binding.name.text.toString()
            val email = binding.email.text.toString()
            val phone = binding.phone.text.toString()
            val address = binding.address.text.toString()
            val bundle = Bundle().apply {
                putString("name", name)
                putString("email", email)
                putString("phone", phone)
                putString("address", address)
            }
            val intent = Intent(this, SecondActivity::class.java).putExtras(bundle)
            startActivity(intent)
        }
    }
}