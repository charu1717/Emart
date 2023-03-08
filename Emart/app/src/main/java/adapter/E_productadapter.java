package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.emart.R;

import java.util.ArrayList;

import models.E_productitem;
import models.F_productitem;

public class E_productadapter extends RecyclerView.Adapter<E_productadapter.viewHolder> {
    ArrayList<E_productitem>plist;
    Context context;

    public E_productadapter(ArrayList<E_productitem> plist, Context context) {
        this.plist = plist;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.electronicproductlayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final E_productitem items = plist.get(position);
        holder.E_pimage.setImageResource(items.getImage());
        holder.E_desc.setText(items.getTitle());
        holder.E_price.setText(items.getPrice());
        holder.E_rank.setText(items.getRank());
    }

    @Override
    public int getItemCount() {

        return plist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        public ImageView E_pimage;
        public TextView E_desc,E_price,E_rank;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            E_pimage=itemView.findViewById(R.id.eleprimage1);
            E_desc=itemView.findViewById(R.id.eledes1);
            E_price=itemView.findViewById(R.id.elecost1);
            E_rank=itemView.findViewById(R.id.elerank);
        }
    }
}
