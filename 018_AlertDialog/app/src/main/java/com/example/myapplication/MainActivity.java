package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
    }

    public void tanimla(){
        btn = findViewById(R.id.bilgiGir);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog(){
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alert_layout, null);

        final EditText name_et = view.findViewById(R.id.name);
        final EditText age_et = view.findViewById(R.id.age);
        final EditText address_et = view.findViewById(R.id.address);
        Button kaydet_btn = view.findViewById(R.id.kaydet);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setView(view);
        alert.setCancelable(true);   // Alert dialog, ekranının dışına tıklandığında kapanır.
        final AlertDialog dialog = alert.create();
        dialog.show();

        kaydet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), name_et.getText().toString() + " " + age_et.getText().toString() + " " + address_et.getText().toString(), Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
    }
}