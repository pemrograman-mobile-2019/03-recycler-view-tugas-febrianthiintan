package com.example.recyclerviewtugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewtugas.R;
import com.example.recyclerviewtugas.adapter.ContactsAdapter;
import com.example.recyclerviewtugas.models.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.rvContact);
        contacts = Contact.createContactsList(20);
        com.example.recyclerviewtugas.adapter.ContactsAdapter contactsAdapter = new com.example.recyclerviewtugas.adapter.ContactsAdapter(contacts);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setAdapter(ContactsAdapter);
        rv.setLayoutManager(layoutManager);
    }
}
