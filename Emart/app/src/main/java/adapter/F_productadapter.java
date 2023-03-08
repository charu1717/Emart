package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.emart.R;

import java.util.ArrayList;

import models.F_productitem;

public class F_productadapter extends RecyclerView.Adapter<F_productadapter.viewHolder> {
    ArrayList<F_productitem>plist;
    Context context;

    public F_productadapter(ArrayList<F_productitem> plist, Context context) {
        this.plist = plist;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.furnitureproductlayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final F_productitem items = plist.get(position);
        holder.F_pimage.setImageResource(items.getImage());
        holder.F_desc.setText(items.getTitle());
        holder.F_price.setText(items.getPrice());
        holder.F_rank.setText(items.getRank());
    }

    @Override
    public int getItemCount() {
        return plist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        public ImageView F_pimage;
        public TextView F_desc,F_price,F_rank;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            F_pimage=itemView.findViewById(R.id.furprimage1);
            F_desc=itemView.findViewById(R.id.furdes1);
            F_price=itemView.findViewById(R.id.furcost1);
            F_rank=itemView.findViewById(R.id.frank);
        }
    }
}
