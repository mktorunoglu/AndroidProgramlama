package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox javaC, javascriptC, phpC, pythonC, csharpC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        mesajVer();
    }

    public void tanimla(){
        javaC = (CheckBox) findViewById(R.id.java);
        javascriptC = (CheckBox) findViewById(R.id.javascript);
        phpC = (CheckBox) findViewById(R.id.php);
        pythonC = (CheckBox) findViewById(R.id.python);
        csharpC = (CheckBox) findViewById(R.id.csharp);
    }

    public void mesajVer(){
        javaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(javaC.isChecked()){
                    Toast.makeText(getApplicationContext(), javaC.getText() + " tıklandı.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), javaC.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        javascriptC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(javascriptC.isChecked()){
                    Toast.makeText(getApplicationContext(), javascriptC.getText() + " tıklandı.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), javascriptC.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        phpC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phpC.isChecked()){
                    Toast.makeText(getApplicationContext(), phpC.getText() + " tıklandı.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), phpC.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        pythonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pythonC.isChecked()){
                    Toast.makeText(getApplicationContext(), pythonC.getText() + " tıklandı.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), pythonC.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        csharpC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(csharpC.isChecked()){
                    Toast.makeText(getApplicationContext(), csharpC.getText() + " tıklandı.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), csharpC.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}