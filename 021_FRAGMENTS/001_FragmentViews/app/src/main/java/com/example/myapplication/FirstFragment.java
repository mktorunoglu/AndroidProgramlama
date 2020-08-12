package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    View view;
    Button button;
    EditText editText;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_first, container, false);
        tanimla();
        action();
        return view;
    }

    public void tanimla(){
        button = view.findViewById(R.id.show_button);
        editText = view.findViewById(R.id.name_edittext);
        textView = view.findViewById(R.id.name_textview);
    }

    public void action(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
                editText.setText("");
            }
        });
    }
}