package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class telaNumerosEmergencia extends AppCompatActivity {
    static Usuario logado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_numeros_emergencia);
        getSupportActionBar().hide();
    }


    public void salvarInfo(View view) {
        Intent y = new Intent(this, TelaColetarDados.class);
        startActivity(y);
    }
}