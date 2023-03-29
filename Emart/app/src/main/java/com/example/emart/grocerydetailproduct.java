package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class grocerydetailproduct extends AppCompatActivity {
    ImageView groimg;
    TextView grodesc,groprice,groaddtocart,grorank;
    Button grobuy;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocerydetailproduct);
        groimg = findViewById(R.id.gropdimg);
        grodesc = findViewById(R.id.gropddesc);
        groprice = findViewById(R.id.gropdprice);
        grorank = findViewById(R.id.gropdrank);
        groaddtocart = findViewById(R.id.gropdaddtocart);
        grobuy = findViewById(R.id.gropdbuy);

        Intent intent = getIntent();
        String desc = intent.getExtras().getString("desc");
        String price = intent.getExtras().getString("price");
        String rank = intent.getExtras().getString("rank");
        int grocery = intent.getExtras().getInt("grocery");

        groaddtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(grocerydetailproduct.this,mycart.class);
                startActivity(main);
            }
        });

        grobuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(grocerydetailproduct.this, grocery_orderplace.class);
                startActivity(main);
            }
        });

        groprice.setText(price);
        grodesc.setText(desc);
        grorank.setText(rank);
        groimg.setImageResource(grocery);
    }
}