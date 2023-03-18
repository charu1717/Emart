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
import com.example.emart.cosmeticdetailproduct;
import java.util.ArrayList;
import models.C_productitem;

public class C_productadapter extends RecyclerView.Adapter<C_productadapter.viewHolder> {
    ArrayList<C_productitem> arrayList = new ArrayList<>();
    Context context;

    public C_productadapter( Context context,ArrayList<C_productitem> arrayList) {
        this.arrayList = arrayList ;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cosmeticproductlayout,parent,false);
        viewHolder viewHolder1 = new viewHolder(view);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.C_pimage.setImageResource(arrayList.get(position).getImage());
        holder.C_desc.setText(arrayList.get(position).getTitle());
        holder.C_price.setText(arrayList.get(position).getPrice());
        holder.C_rank.setText(arrayList.get(position).getRank());
   holder.C_card.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, cosmeticdetailproduct.class);
        intent.putExtra("cosmetic",arrayList.get(position).getImage());
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
        public ImageView C_pimage;
        public TextView C_desc,C_price,C_rank;
        CardView C_card;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            C_pimage=itemView.findViewById(R.id.cospimage);
            C_desc=itemView.findViewById(R.id.cospdesc);
            C_price=itemView.findViewById(R.id.cospprice);
            C_rank=itemView.findViewById(R.id.cosprank);
            C_card=itemView.findViewById(R.id.cosmeticcard);

        }
    }
}
