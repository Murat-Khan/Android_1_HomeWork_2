package com.murat.android1homework2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeWorkFragment extends Fragment {

    Button btnPlus,btnMinus;
    TextView tvCount;
    int numCount;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_work, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setupButtonClick();
    }
    private void setupButtonClick() {
        btnPlus.setOnClickListener(view1 -> {
            numCount++;
            tvCount.setText(String.valueOf(numCount));
        });

        btnMinus.setOnClickListener(view1 -> {
            numCount--;
            tvCount.setText(String.valueOf(numCount));
        });
    }
    private void initView(View view) {
        btnPlus = view.findViewById(R.id.btn_plus);
        btnMinus = view.findViewById(R.id.btn_minus);
        tvCount = view.findViewById(R.id.tv_count);


    }


}