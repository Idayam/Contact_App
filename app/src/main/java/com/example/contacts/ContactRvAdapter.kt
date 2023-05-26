package com.example.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contacts.databinding.ContactListItemBinding

class ContactAdapter(var contactlist:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact=contactlist.get(position)
        var binding=holder.binding
        binding.tvname.text=contact.names
        binding.tvnumber.text = contact.number
        binding.tvemail.text=contact.email


    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}

class ContactViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root)







