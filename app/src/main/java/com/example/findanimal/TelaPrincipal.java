package com.example.findanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        getActionBar().hide();
    }
}