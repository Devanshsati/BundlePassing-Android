package com.example.bundlepassing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bundlepassing.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySecondBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")
        val address = intent.getStringExtra("address")

        binding.showName.text = getString(R.string.display_name, name)
        binding.showEmail.text = getString(R.string.display_email, email)
        binding.showPhone.text = getString(R.string.display_phone, phone)
        binding.showAddress.text = getString(R.string.display_address, address)
    }
}
