package com.example.fragmentsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    private static final String TAG = "Fragmen1";
    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout, container,false);
        btnNavFrag1 = view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3 = view.findViewById(R.id.btnNavFrag3);
        btnNavSecondActivity = view.findViewById(R.id.btnNavSecondActivity);
        Log.d(TAG, "onCreateView: started");
        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Going to fragment 1", Toast.LENGTH_SHORT).show();
                //navigate to fragment 1
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });
        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Going to fragment 2", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);

            }
        });
        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Going to fragment 3", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);

            }
        });
        btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Going to activity 2", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(),SecondActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
