package com.example.ihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BotaoEmergencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_botao_emergencia);
        getSupportActionBar().hide();
    }
}