package adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.emart.R;
import com.example.emart.electronicdetailproduct;
import com.example.emart.furnituredetailproduct;

import java.util.ArrayList;

import models.E_productitem;
import models.F_productitem;

public class E_productadapter extends RecyclerView.Adapter<E_productadapter.viewHolder> {
    ArrayList<E_productitem> arrayList = new ArrayList<>();
    Context context;

    public E_productadapter(Context context,ArrayList<E_productitem> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.electronicproductlayout,parent,false);
        viewHolder viewHolder1 = new viewHolder(view);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.E_pimage.setImageResource(arrayList.get(position).getImage());
        holder.E_price.setText(arrayList.get(position).getPrice());
        holder.E_desc.setText(arrayList.get(position).getTitle());
        holder.E_rank.setText(arrayList.get(position).getRank());
        holder.card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, electronicdetailproduct.class);
                intent.putExtra("electronic",arrayList.get(position).getImage());
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
        public ImageView E_pimage;
        public TextView E_desc,E_price,E_rank;

        CardView card2;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            E_pimage=itemView.findViewById(R.id.eleprimage1);
            E_desc=itemView.findViewById(R.id.eledes1);
            E_price=itemView.findViewById(R.id.elecost1);
            E_rank=itemView.findViewById(R.id.elerank);
            card2 = itemView.findViewById(R.id.card2);
        }
    }
}
