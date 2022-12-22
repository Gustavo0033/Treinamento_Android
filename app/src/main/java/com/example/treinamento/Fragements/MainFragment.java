package com.example.treinamento.Fragements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.treinamento.DataModel;
import com.example.treinamento.R;
import com.example.treinamento.Adapters.RecyclerViewAadapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    private ArrayList<DataModel> list = new ArrayList<>();
    public MainFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if ((getArguments() != null)){

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_main, container, false);

        buildListData();
        initRecyclerView(view);
        return view;
    }
    private void initRecyclerView(View view){
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAadapter adapter = new RecyclerViewAadapter(list);
        recyclerView.setAdapter(adapter);

    }
    public void buildListData(){
        list.add(new DataModel(("iPhone 14 PRO MAX"),R.drawable.iphone_14));
        list.add(new DataModel(("iPhone 14"),R.drawable.iphone_14_normal));
        list.add(new DataModel(("iPhone 13 PRO MAX"),R.drawable.iphone_13_pro_max));
        list.add(new DataModel(("iPhone 13"),R.drawable.iphone_13___certo));
        list.add(new DataModel(("iPhone 12"),R.drawable.iphone12));
        list.add(new DataModel(("iPhone 11"),R.drawable.iphone11));


    }

}