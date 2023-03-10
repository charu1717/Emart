package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import adapter.G_productadapter;
import models.G_productitem;

public class groceryproductcard extends AppCompatActivity {
    ArrayList<G_productitem>G_productlist;
    G_productadapter adapater;
    RecyclerView G_playout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceryproductcard);
        G_playout = findViewById(R.id.groceryproductcard);

        G_productlist = new ArrayList<>();
        G_productlist.add(new G_productitem(R.drawable.g1,1,"Cadbury Oreo (pack of 3)","1300 rating","70/-"));
        G_productlist.add(new G_productitem(R.drawable.g2,2,"Bikaji bhujia, 1kg","10000 rating","120/-"));
        G_productlist.add(new G_productitem(R.drawable.g3,3,"Cornflakes (Pack of 2)","5000 rating","100/-"));
        G_productlist.add(new G_productitem(R.drawable.g4,4,"MyFitness PeanutButter, 1.2kg","170 rating","300/-"));
        G_productlist.add(new G_productitem(R.drawable.g5,5,"Karachi Bakery biscuit","13000 rating","100/-"));



        adapater = new G_productadapter(G_productlist,this);
        G_playout.setAdapter(adapater);
        G_playout.setLayoutManager(new GridLayoutManager(this,2));

    }
}