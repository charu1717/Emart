package com.example.emart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class categoryadapter extends RecyclerView.Adapter<categoryadapter.ViewHolder> {

    private List<categorymodel>categorymodelList;

    public categoryadapter(List<categorymodel> categorymodelList) {
        this.categorymodelList = categorymodelList;
    }

    @NonNull
    @Override
    public categoryadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_item,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull categoryadapter.ViewHolder viewHolder, int position) {
    String icon =categorymodelList.get(position).getCategoryiconlink();
    String name=categorymodelList.get(position).getCategoryname();
    viewHolder.setCategoryname(name);
    }

    @Override
    public int getItemCount() {
        return categorymodelList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView categoryIcon;
        private TextView categoryname;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryIcon=itemView.findViewById(R.id.category_icon);
            categoryname=itemView.findViewById(R.id.category_name);

        }
        private void setCategoryIcon(){
            ///todosetcategory icons here;
        }
        private void setCategoryname(String name){
            categoryname.setText(name);
        }
    }
}
