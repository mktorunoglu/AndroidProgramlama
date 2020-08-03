package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    Realm realm;
    EditText kullaniciAdi, parola;
    RadioGroup cinsiyet;
    Button girisYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        ekle();
    }

    public void tanimla(){
        realm = Realm.getDefaultInstance();
        kullaniciAdi = findViewById(R.id.username_et);
        parola = findViewById(R.id.password_et);
        cinsiyet = findViewById(R.id.gender_rg);
        girisYap = findViewById(R.id.login_btn);
    }

    public void ekle(){
        girisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kullaniciAdiText = kullaniciAdi.getText().toString();
                String parolaText = parola.getText().toString();
                String cinsiyetText = ((RadioButton)findViewById(cinsiyet.getCheckedRadioButtonId())).getText().toString();

                realmIslem(kullaniciAdiText, parolaText, cinsiyetText);

                kullaniciAdi.setText("");
                parola.setText("");
            }
        });
    }

    public void realmIslem(final String username, final String password, final String gender){
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Kisiler kisiler = realm.createObject(Kisiler.class);
                kisiler.setKullaniciAdi(username);
                kisiler.setParola(password);
                kisiler.setCinsiyet(gender);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Toast.makeText(getApplicationContext(), "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                goster();
            }
        }, new Realm.Transaction.OnError(){
            @Override
            public void onError(Throwable error) {
                Toast.makeText(getApplicationContext(), "Giriş Başarısız", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goster(){
        RealmResults<Kisiler> kisilers = realm.where(Kisiler.class).findAll();
        for(Kisiler k :kisilers){
            Log.i("Kişiler", k.toString());
        }
    }
}