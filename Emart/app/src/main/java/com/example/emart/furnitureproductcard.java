package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

import adapter.F_productadapter;
import models.F_productitem;

public class furnitureproductcard extends AppCompatActivity {
ArrayList<F_productitem> arrayList = new ArrayList<>();
F_productadapter adapater;
RecyclerView F_playout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furnitureproductcard);
        F_playout = findViewById(R.id.furnitureproductcard);
        F_playout.setLayoutManager(new GridLayoutManager(this,2));

        arrayList.add(new F_productitem(R.drawable.fur1,1,"Classic Tethered Metallic Table","13 rating","15000/-","Add to Cart"));
        arrayList.add(new F_productitem(R.drawable.fur5,2,"White furnished Shoe rack","10 rating","20000/-","Add to Cart"));
        arrayList.add(new F_productitem(R.drawable.fur3,3,"Aesthetic blush fur sofa","5 rating","25000/-","Add to Cart"));
        arrayList.add(new F_productitem(R.drawable.fur4,4,"FullFurnished Dining Table","17 rating","60000/-","Add to Cart"));
        arrayList.add(new F_productitem(R.drawable.f2,5,"Grey couch single sofa","13 rating","22000/-","Add to Cart"));
        arrayList.add(new F_productitem(R.drawable.f3,6,"Mustered triple joint sofa","6 rating","72000/-","Add to Cart"));

        F_productadapter f_productadapter = new F_productadapter(this,arrayList);
        F_playout.setAdapter(f_productadapter);

    }


}