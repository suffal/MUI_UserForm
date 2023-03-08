package com.example.mui_userform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mui_userform.databinding.ActivityMainBinding
import com.example.mui_userform.databinding.ActivitySecoundBinding

class secound : AppCompatActivity() {

    private lateinit var binding: ActivitySecoundBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecoundBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent=intent
        val firstnmae=intent.getStringExtra("firstname")
        val lastnmae=intent.getStringExtra("lastname")
        val phone=intent.getStringExtra("phone")
        val Alphone=intent.getStringExtra("Alphone")
        val email=intent.getStringExtra("email")
        val gender=intent.getStringExtra("gender")
        val hobbies=intent.getStringExtra("hobbies")

        binding.textview.text="Name:- $firstnmae$lastnmae \nphone No:-$phone\nAl.mo.no:-$Alphone \nEmail:-$email \n Hobbies:-$hobbies"
    }
}