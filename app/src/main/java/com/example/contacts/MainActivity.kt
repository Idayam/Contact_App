package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       }

    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val contactnumber=ContactRvAdapter("Amina","","0754689432","minaswake@gmail.com")
        val contactnumber2=ContactRvAdapter("Sasha","","0745780869","sashakay@gmail.com")

        val contact_list= listOf(contactnumber,contactnumber2)
        val contactAdapter=ContactRvAdapter(contact_list)
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        binding.rvNames.adapter=contactAdapter


    }


    }


}


