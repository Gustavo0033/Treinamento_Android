package com.example.treinamento;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAadapter extends RecyclerView.Adapter<RecyclerViewAadapter.MyViewHolder> {

    private List<DataModel> list;
    private ItemClickListener clickListener;

    public RecyclerViewAadapter(List<DataModel> list, ItemClickListener clickListener){
    this.list = list;
    this.clickListener = clickListener;
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

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        clickListener.onItemClick(list.get(position));
        }
    });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tittleTextView;


        public MyViewHolder(View view){
            super(view);

            tittleTextView = view.findViewById(R.id.tittleTextView);

        }
    }
    public interface ItemClickListener{

        public void onItemClick(DataModel dataModel);
    }
}
