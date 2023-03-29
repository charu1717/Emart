package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class cosmeticdetailproduct extends AppCompatActivity {

    ImageView Cosmimg;
    TextView Cosmdesc,Cosmprice,Cosmaddtocart,Cosmrank;
    Button Cosmbuy;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmeticdetailproduct);
        Cosmimg = findViewById(R.id.cospdimage);
        Cosmdesc = findViewById(R.id.cospddesc);
        Cosmprice = findViewById(R.id.cospdprice);
        Cosmrank = findViewById(R.id.cospdrank);
        Cosmaddtocart = findViewById(R.id.cospdaddtocart);
        Cosmbuy = findViewById(R.id.cospdbuy);

        Intent intent = getIntent();
        String desc = intent.getExtras().getString("desc");
        String price = intent.getExtras().getString("price");
        String rank = intent.getExtras().getString("rank");
        int cosmetic = intent.getExtras().getInt("cosmetic");

        Cosmaddtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(cosmeticdetailproduct.this,mycart.class);
                startActivity(main);
            }
        });

        Cosmbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(cosmeticdetailproduct.this,orderplaced.class);
                startActivity(main);
            }
        });

        Cosmdesc.setText(desc);
        Cosmprice.setText(price);
        Cosmrank.setText(rank);
        Cosmimg.setImageResource(cosmetic);
    }
}