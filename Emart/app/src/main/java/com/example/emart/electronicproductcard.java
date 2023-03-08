package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import adapter.E_productadapter;
import adapter.F_productadapter;
import models.E_productitem;
import models.F_productitem;

public class electronicproductcard extends AppCompatActivity {

    ArrayList<E_productitem>E_prductlist;
    E_productadapter adapater;
    RecyclerView E_playout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronicproductcard);
        E_playout = findViewById(R.id.electronicproductcard);

        E_prductlist = new ArrayList<>();
        E_prductlist.add(new E_productitem(R.drawable.ele1,1,"Macbook pro 2022","20 rating","80000/-"));
        E_prductlist.add(new E_productitem(R.drawable.ele2,2,"Lenovo ideapad flex","10 rating","96000/-"));
        E_prductlist.add(new E_productitem(R.drawable.ele3,3,"Iphone 14 pro max","15 rating","127000/-"));
        E_prductlist.add(new E_productitem(R.drawable.ele4,4,"Boult z40 earpods ","30 rating","1500/-"));
        E_prductlist.add(new E_productitem(R.drawable.ele5,5,"Apple i-watch pro 22","10 rating","30000/-"));



        adapater = new E_productadapter(E_prductlist,this);
        E_playout.setAdapter(adapater);
        E_playout.setLayoutManager(new GridLayoutManager(this,2));

    }
}