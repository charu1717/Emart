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

import models.G_productitem;

public class G_productadapter extends RecyclerView.Adapter<G_productadapter.viewHolder> {
    ArrayList<G_productitem>plist;
    Context context;

    public G_productadapter(ArrayList<G_productitem> plist, Context context) {
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
        final G_productitem items = plist.get(position);
        holder.G_pimage.setImageResource(items.getImage());
        holder.G_desc.setText(items.getTitle());
        holder.G_price.setText(items.getPrice());
        holder.G_rank.setText(items.getRank());
    }

    @Override
    public int getItemCount() {
        return plist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        public ImageView G_pimage;
        public TextView G_desc,G_price,G_rank;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            G_pimage=itemView.findViewById(R.id.furprimage1);
            G_desc=itemView.findViewById(R.id.furdes1);
            G_price=itemView.findViewById(R.id.furcost1);
            G_rank=itemView.findViewById(R.id.frank);
        }
    }
}
