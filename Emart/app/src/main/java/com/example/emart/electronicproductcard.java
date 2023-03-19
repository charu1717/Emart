package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import adapter.E_productadapter;
import models.E_productitem;

public class electronicproductcard extends AppCompatActivity {

    ArrayList<E_productitem> arrayList = new ArrayList<>();
    E_productadapter adapater;
    RecyclerView E_playout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronicproductcard);
        E_playout = findViewById(R.id.electronicproductcard);
        E_playout.setLayoutManager(new GridLayoutManager(this,2));

        arrayList.add(new E_productitem(R.drawable.ele1,1,"Macbook pro 2022","20 rating","80000/-"));
        arrayList.add(new E_productitem(R.drawable.ele2,2,"Lenovo ideapad flex","10 rating","96000/-"));
        arrayList.add(new E_productitem(R.drawable.ele3,3,"Iphone 14 pro max","15 rating","127000/-"));
        arrayList.add(new E_productitem(R.drawable.ele4,4,"Boult z40 earpods ","30 rating","1500/-"));
        arrayList.add(new E_productitem(R.drawable.ele5,5,"Applxe i-watch pro 22","10 rating","30000/-"));
        arrayList.add(new E_productitem(R.drawable.e6,6," Marshall KILBURN speaker","14 rating","29000/-"));

        E_productadapter e_productadapter = new E_productadapter(this,arrayList);
        E_playout.setAdapter(e_productadapter);
    }
}