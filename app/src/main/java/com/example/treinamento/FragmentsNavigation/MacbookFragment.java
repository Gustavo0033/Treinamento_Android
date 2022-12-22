package com.example.treinamento.FragmentsNavigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.treinamento.Adapters.MyAdapterMac;
import com.example.treinamento.DataModel;
import com.example.treinamento.Lists.Macbook;
import com.example.treinamento.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MacbookFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MacbookFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ArrayList<Macbook> macbookArrayList = new ArrayList<>();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int[] imageProduct;
    private String[] textMacbook;
    private RecyclerView recyclerview;

    public MacbookFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MacbookFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MacbookFragment newInstance(String param1, String param2) {
        MacbookFragment fragment = new MacbookFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_macbook, container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitiaLize();

        recyclerview = view.findViewById(R.id.recyclerview_);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        MyAdapterMac Myadapter = new MyAdapterMac(getContext(),macbookArrayList);
        recyclerview.setAdapter(Myadapter);

    }

    private void dataInitiaLize(){

        macbookArrayList = new ArrayList<>();

        imageProduct = new int[]{
                R.drawable.icon_macbook,
                R.drawable.icon_macbook,
                R.drawable.icon_macbook,
                R.drawable.icon_macbook,
        };

        textMacbook = new String[]{
                getString(R.string.Macbook),
                getString(R.string.Macbook),
                getString(R.string.Macbook),
                getString(R.string.Macbook),
        };
    }
}