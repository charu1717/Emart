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

import models.C_productitem;
import models.E_productitem;
import models.F_productitem;

public class C_productadapter extends RecyclerView.Adapter<C_productadapter.viewHolder> {
    ArrayList<C_productitem>plist;
    Context context;

    public C_productadapter(ArrayList<C_productitem> plist, Context context) {
        this.plist = plist;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cosmeticproductlayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final C_productitem items = plist.get(position);
        holder.C_pimage.setImageResource(items.getImage());
        holder.C_desc.setText(items.getTitle());
        holder.C_price.setText(items.getPrice());
        holder.C_rank.setText(items.getRank());
    }

    @Override
    public int getItemCount() {

        return plist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        public ImageView C_pimage;
        public TextView C_desc,C_price,C_rank;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            C_pimage=itemView.findViewById(R.id.cosmprimage);
            C_desc=itemView.findViewById(R.id.cosmdes);
            C_price=itemView.findViewById(R.id.cosmcost);
            C_rank=itemView.findViewById(R.id.cosmrank);
        }
    }
}
