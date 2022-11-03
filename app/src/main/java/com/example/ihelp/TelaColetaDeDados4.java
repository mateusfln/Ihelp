package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaColetaDeDados4 extends AppCompatActivity {
    static Usuario logado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_coleta_de_dados4);
        getSupportActionBar().hide();
    }


    public void salvarInfo(View view) {
        Intent y = new Intent(this, TelaColetarDados.class);
        startActivity(y);
    }
}