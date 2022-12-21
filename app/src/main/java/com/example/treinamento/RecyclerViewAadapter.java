package com.example.treinamento;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class RecyclerViewAadapter extends RecyclerView.Adapter<RecyclerViewAadapter.MyViewHolder> {

    private List<DataModel> list;

    public RecyclerViewAadapter(List<DataModel> list){
    this.list = list;
    }


    @NonNull
    @Override
    public RecyclerViewAadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAadapter.MyViewHolder holder, int position) {

        holder.tittleTextView.setText(list.get(position).getTittle());
        holder.imagePhone.setImageResource(list.get(position).getImagePhone());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tittleTextView;
        ImageView imagePhone;


        public MyViewHolder(View view){
            super(view);

            tittleTextView = view.findViewById(R.id.tittleTextView);
            imagePhone = view.findViewById(R.id.imagePhone);

        }
    }
}
