package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<UserModel> userModelList;
    UserModelAdapter uma;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        listeDoldur();
    }

    public  void listeDoldur() {
        userModelList = new ArrayList<>();

        UserModel user1 = new UserModel("Murat", "Koç", "22", "Student");
        UserModel user2 = new UserModel("Sadık", "Turan", "38", "Teacher");
        UserModel user3 = new UserModel("Ahmet", "Yaşar", "28", "Staff");
        UserModel user4 = new UserModel("Ayşe", "Pala", "71", "Retired");
        userModelList.add(user1);
        userModelList.add(user2);
        userModelList.add(user3);
        userModelList.add(user4);

        uma = new UserModelAdapter(userModelList, this);
        lv.setAdapter(uma);
    }

    public void tanimla(){
        lv = (ListView) findViewById(R.id.listView);
    }
}