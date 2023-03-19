package adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.emart.R;
import com.example.emart.furnituredetailproduct;

import java.util.ArrayList;

import models.F_productitem;

public class F_productadapter extends RecyclerView.Adapter<F_productadapter.viewHolder> {
    ArrayList<F_productitem> arrayList = new ArrayList<>();
    Context context;

    public F_productadapter(Context context, ArrayList<F_productitem> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.furnitureproductlayout,parent,false);
       viewHolder viewHolder1 = new viewHolder(view);
       return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.F_pimage.setImageResource(arrayList.get(position).getImage());
        holder.F_price.setText(arrayList.get(position).getPrice());
        holder.F_desc.setText(arrayList.get(position).getTitle());
        holder.F_rank.setText(arrayList.get(position).getRank());
        holder.card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, furnituredetailproduct.class);
                intent.putExtra("furniture",arrayList.get(position).getImage());
                intent.putExtra("desc",arrayList.get(position).getTitle());
                intent.putExtra("price",arrayList.get(position).getPrice());
                intent.putExtra("rank",arrayList.get(position).getRank());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        public ImageView F_pimage;
        public TextView F_desc,F_price,F_rank,F_addcart;
        CardView card1;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            F_addcart = itemView.findViewById(R.id.AddCartFurPr);
            F_pimage=itemView.findViewById(R.id.furprimage1);
            F_desc=itemView.findViewById(R.id.furdes1);
            F_price=itemView.findViewById(R.id.furcost1);
            F_rank=itemView.findViewById(R.id.frank);
            card1 = itemView.findViewById(R.id.card1);
        }
    }
}
