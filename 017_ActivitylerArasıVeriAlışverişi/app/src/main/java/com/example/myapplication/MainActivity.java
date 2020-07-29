package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText kullanici, parola;
    Button btn;
    RadioGroup radioGroup;
    String kAdi, kParola, kCinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        gonderTikla();
    }

    public void tanimla(){
        kullanici = findViewById(R.id.username);
        parola = findViewById(R.id.password);
        btn = findViewById(R.id.gonder);
        radioGroup = findViewById(R.id.cinsiyet);
    }

    public void veriAl(){
        kAdi = kullanici.getText().toString();
        kParola = parola.getText().toString();
        kCinsiyet = ((RadioButton) findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
    }

    public void gonderTikla(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veriAl();
                Intent intent = new Intent(getApplicationContext(), DegerAl.class);
                intent.putExtra("intentKullaniciAdi", kAdi);
                intent.putExtra("intentParola", kParola);
                intent.putExtra("intentCinsiyet", kCinsiyet);
                startActivity(intent);
            }
        });
    }
}