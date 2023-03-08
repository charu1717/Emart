package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import adapter.C_productadapter;
import models.C_productitem;


public class cosmeticproductcard extends AppCompatActivity {

    ArrayList<C_productitem>C_prductlist;
    C_productadapter adapater;
    RecyclerView C_playout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmeticproductcard);
        C_playout = findViewById(R.id.cosmeticproductcard);

        C_prductlist = new ArrayList<>();
        C_prductlist.add(new C_productitem(R.drawable.co1,1,"Kylie cosmetic stormi palette","40 rating","7000/-"));
        C_prductlist.add(new C_productitem(R.drawable.co2,2,"Fenty skin care ","10 rating","10000/-"));
        C_prductlist.add(new C_productitem(R.drawable.co3,3,"Huda beauty lipstick","100 rating","1200/-"));
        C_prductlist.add(new C_productitem(R.drawable.co4,4,"Blush Bronzer Highlighter palette ","60 rating","1000/-"));
        C_prductlist.add(new C_productitem(R.drawable.p4,5,"Chanel wonderlust perfume","50 rating","5000/-"));




        adapater = new C_productadapter(C_prductlist,this);
        C_playout.setAdapter(adapater);
        C_playout.setLayoutManager(new GridLayoutManager(this,2));

    }
}