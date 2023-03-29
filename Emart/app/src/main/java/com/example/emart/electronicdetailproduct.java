package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class electronicdetailproduct extends AppCompatActivity {

    ImageView Eleimg;
    TextView Eledesc,Eleprice,Eleaddtocart,Elerank;
    Button Elebuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronicdetailproduct);
        Eleimg = findViewById(R.id.Pedimage);
        Eledesc = findViewById(R.id.Pddecs);
        Eleprice = findViewById(R.id.Pdprice);
        Elerank = findViewById(R.id.frank);
        Eleaddtocart = findViewById(R.id.AddCartFurPr);
        Elebuy = findViewById(R.id.BuyFurPr);

        Intent intent = getIntent();
        String desc = intent.getExtras().getString("desc");
        String price = intent.getExtras().getString("price");
        String rank = intent.getExtras().getString("rank");
        int electronic = intent.getExtras().getInt("electronic");

        Eleaddtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(electronicdetailproduct.this,mycart.class);
                startActivity(main);
            }
        });

        Elebuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(electronicdetailproduct.this, elec_orderplaced.class);
                startActivity(main);
            }
        });

        Eleprice.setText(price);
        Eledesc.setText(desc);
        Elerank.setText(rank);
        Eleimg.setImageResource(electronic);
    }
}