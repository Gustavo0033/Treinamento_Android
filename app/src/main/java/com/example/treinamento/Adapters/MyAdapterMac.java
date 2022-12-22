package com.example.treinamento.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.treinamento.Lists.Macbook;
import com.example.treinamento.R;

import java.util.ArrayList;

import javax.crypto.Mac;

public class MyAdapterMac extends RecyclerView.Adapter<MyAdapterMac.MyViewHolderMac> {

    Context context;
    ArrayList<Macbook> macbookArrayList;

    public MyAdapterMac(Context context, ArrayList<Macbook> macbookArrayList){
        this.context = context;
        this.macbookArrayList = macbookArrayList;

    }

    @NonNull
    @Override
    public MyViewHolderMac onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycler_row, parent,false);

        return new MyViewHolderMac(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderMac holder, int position) {

        Macbook macbook = macbookArrayList.get(position);
        holder.imageProduct.setImageResource(macbookArrayList.get(position).getImageProduct());
        holder.textMacbook.setText(macbookArrayList.get(position).getTextProduct());

    }

    @Override
    public int getItemCount() {
        return macbookArrayList.size();
    }

    public static class MyViewHolderMac extends RecyclerView.ViewHolder{
        ImageView imageProduct;
        TextView textMacbook;


    public MyViewHolderMac(@NonNull View itemView) {
        super(itemView);

        imageProduct = itemView.findViewById(R.id.imageProduct);
        textMacbook = itemView.findViewById(R.id.tittleTextView);
    }
}

}








