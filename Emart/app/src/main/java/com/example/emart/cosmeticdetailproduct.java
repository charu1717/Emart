package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class cosmeticdetailproduct extends AppCompatActivity {
    ImageView cosimg;
    TextView cosdesc,cosprice,cosaddtocart,cosrank;
    Button cosbuy;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmeticdetailproduct);
        cosimg = findViewById(R.id.cosmprimage);
        cosdesc = findViewById(R.id.cosmdes);
        cosprice = findViewById(R.id.cosmcost);
        cosrank = findViewById(R.id.cosmrank);
        cosaddtocart = findViewById(R.id.addtocartcos);
        cosbuy = findViewById(R.id.BuycosPr);

        Intent intent = getIntent();
        String desc = intent.getExtras().getString("desc");
        String price = intent.getExtras().getString("price");
        String rank = intent.getExtras().getString("rank");
        int cosmetic = intent.getExtras().getInt("cosmetic");

        cosprice.setText(price);
        cosdesc.setText(desc);
        cosrank.setText(rank);
        cosimg.setImageResource(cosmetic);
    }
}