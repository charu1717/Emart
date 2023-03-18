package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class furnituredetailproduct extends AppCompatActivity {
    ImageView furimg;
    TextView furprice,furaddtocart,furdes,furrank;

    Button furbuy;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furnituredetailproduct);
        furimg = findViewById(R.id.Pdimage);
        furprice = findViewById(R.id.Pdprice);
        furaddtocart = findViewById(R.id.AddCartFurPr);
        furbuy = findViewById(R.id.BuyFurPr);
        furdes=findViewById(R.id.Pddecs);
        furrank = findViewById(R.id.frank);

        Intent intent = getIntent();
        String desc = intent.getExtras().getString("desc");
        String price = intent.getExtras().getString("price");
        String rank = intent.getExtras().getString("rank");
        int furniture = intent.getExtras().getInt("furniture");

        furprice.setText(price);
        furdes.setText(desc);
        furrank.setText(rank);
        furimg.setImageResource(furniture);
    }
}