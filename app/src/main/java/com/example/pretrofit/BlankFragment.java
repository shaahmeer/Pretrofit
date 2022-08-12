package com.example.pretrofit;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BlankFragment extends Fragment {

   RecyclerView recyclerView;
   ArrayList<datamodel> dataholder;
   Context context;

    public BlankFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        recyclerView = view.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder = new ArrayList<>();
        datamodel obj1 = new datamodel(R.drawable.java,"java","javaprograming");
        dataholder.add(obj1);
        datamodel obj2 = new datamodel(R.drawable.javascript,"javascript","javascript");
        dataholder.add(obj2);
        datamodel obj3 = new datamodel(R.drawable.python,"python","python");
        dataholder.add(obj3);

        recyclerView.setAdapter(new myadapter(dataholder,context));
        return view;
    }
}