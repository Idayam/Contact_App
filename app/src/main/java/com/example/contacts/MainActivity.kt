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
        val contactnumber=ContactData("rose","", "07254845382","aminaswa@gmail.com")
        val contactnumber2=ContactData("Sasha","","0745780869","sashakay@gmail.com")
        val contactnumber3=ContactData("Ali","","0786954784","ajssvd@gmail.com")
        val contactnumber4=ContactData("Anita","","0725362727","aniatagam@gmail.com")
        val contactnumber5=ContactData("Becky","","07351809364","backyabni@gmail.com")
        val contactnumber6=ContactData("Winnie","","0789658794","winniesk@gmail.com")

        var contactList= listOf(contactnumber,contactnumber2,contactnumber3,contactnumber4,contactnumber5,contactnumber6)
        var contactAdapter=ContactAdapter(contactList)
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        binding.rvNames.adapter=contactAdapter


    }


    }





