package adapter;

import android.annotation.SuppressLint;
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
import com.example.emart.grocerydetailproduct;

import java.util.ArrayList;

import models.G_productitem;

public class G_productadapter extends RecyclerView.Adapter<G_productadapter.viewHolder> {
    ArrayList<G_productitem> arrayList = new ArrayList<>();
    Context context;

    public G_productadapter(Context context,ArrayList<G_productitem> arrayList) {
        this.arrayList=arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.groceryproductlayout,parent,false);
        viewHolder viewHolder4 = new viewHolder(view);
        return viewHolder4 ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.G_pimage.setImageResource(arrayList.get(position).getImage());
        holder.G_desc.setText(arrayList.get(position).getTitle());
        holder.G_price.setText(arrayList.get(position).getPrice());
        holder.G_rank.setText(arrayList.get(position).getRank());
        holder.card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, grocerydetailproduct.class);
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
        public ImageView G_pimage;
        public TextView G_desc,G_price,G_rank;

        CardView card4;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            G_pimage=itemView.findViewById(R.id.furprimage1);
            G_desc=itemView.findViewById(R.id.furdes1);
            G_price=itemView.findViewById(R.id.furcost1);
            G_rank=itemView.findViewById(R.id.frank);
            card4=itemView.findViewById(R.id.card4);
        }
    }
}
