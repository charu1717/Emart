package com.example.emart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class sgpage extends AppCompatActivity {
    TextView t1;
    private EditText Name,Sign_Email,Sign_Password;
    private Button Signup;

    private FirebaseAuth firebaseAuth;
    private FirebaseFirestore firebaseFirestore;

    private String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.[a-z]+";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpage);
        t1 = findViewById(R.id.textView6);
        Name = findViewById(R.id.editTextTextPersonName);
        Sign_Email = findViewById(R.id.editTextTextEmailAddress2);
        Sign_Password = findViewById(R.id.editTextTextPassword2);

        Signup = findViewById(R.id.button5);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s_l_intent = new Intent(sgpage.this,lgpage.class);
                startActivity(s_l_intent);
            }
        });

        Sign_Email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Sign_Password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkemailandpassword();
            }
        });
    }

    private void checkInputs() {
        if(!TextUtils.isEmpty(Sign_Email.getText())){
            if(!TextUtils.isEmpty(Name.getText())){
                if(!TextUtils.isEmpty(Sign_Password.getText()) && Sign_Password.length() >= 0){
                    Signup.setEnabled(true);
                }else{
                    Signup.setEnabled(false);
                }
            }else{
                Signup.setEnabled(false);
            }
        } else{
            Signup.setEnabled(false);
        }
    }

    private void checkemailandpassword(){
    if(Sign_Email.getText().toString().matches(emailPattern)){


        firebaseAuth.createUserWithEmailAndPassword(Sign_Email.getText().toString(),Sign_Password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
               if(task.isSuccessful()){

                   Map<Object,String> userdata = new HashMap<>();
                   userdata.put("Name",Name.getText().toString());

                   firebaseFirestore.collection("users").add(userdata).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                       @Override
                       public void onComplete(@NonNull Task<DocumentReference> task) {
                           if(task.isSuccessful()){
                               Intent mainintent = new Intent(sgpage.this,Home_Activity.class);
                               startActivity(mainintent);

                           }else{
                               String error = task.getException().getMessage();
                               Toast.makeText(sgpage.this, error, Toast.LENGTH_SHORT).show();
                           }
                       }
                   });


               }else{
                   String error = task.getException().getMessage();
                   Toast.makeText(sgpage.this, error, Toast.LENGTH_SHORT).show();
               }
            }
        });
    }else{
        Sign_Email.setError("Invalid Email");
    }
    }


}