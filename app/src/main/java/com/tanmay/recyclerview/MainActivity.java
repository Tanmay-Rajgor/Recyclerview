package com.tanmay.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactRecView;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactRecView = findViewById(R.id.contactRecView);
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("ahb hjk", "abc@gmail.com", "https://www.google.com"));

        ContactRecViewAdapter adapter = new ContactRecViewAdapter();
        adapter.setContacts(contacts);

        contactRecView.setAdapter(adapter);
        contactRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false
        ));
    }
}