package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragmentThree extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    TextView tv1;
    TextView tv2;
    public fragmentThree() {
        // Required empty public constructor
    }
    public static fragmentThree newInstance(String param1, String param2) {
        fragmentThree fragment = new fragmentThree();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable
    Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv1= (TextView) getView().findViewById(R.id.tv1);
        tv2= (TextView) getView().findViewById(R.id.tv2);
        tv1.setText(mParam1);
        tv2.setText(mParam2);
    }
}