package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class myaccount extends AppCompatActivity {

    TextView Fullname, Email;

    FirebaseUser fAuth;
    FirebaseFirestore fStore;

    String userId;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount);



        Fullname = findViewById(R.id.profilename);
        Email = findViewById(R.id.profileEmail);

        fAuth = FirebaseAuth.getInstance().getCurrentUser();

        Fullname.setText(fAuth.getDisplayName());
        Email.setText(fAuth.getEmail());

    }
}