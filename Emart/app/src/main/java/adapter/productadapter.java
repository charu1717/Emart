package adapter;



import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.emart.R;

import java.util.ArrayList;

import models.productitem;

public class productadapter extends RecyclerView.Adapter<productadapter.viewHolder> {
    ArrayList<productitem>plist;



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        public ImageView pimage;
        public TextView desc,price,rank;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
       pimage=itemView.findViewById(R.id.furprimage1);
        desc=itemView.findViewById(R.id.furdes1);
        price=itemView.findViewById(R.id.furcost1);
        rank=itemView.findViewById(R.id.frank);
        }
    }
}
