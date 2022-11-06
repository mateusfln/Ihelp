package com.example.ihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaDeVendas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_vendas);
        getSupportActionBar().hide();
    }

    public void salvarInfoVendas(View view) {
        Intent y = new Intent(this, BotaoEmergencia.class);
        startActivity(y);
    }

}