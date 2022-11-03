package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaColetarDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_coletar_dados);
        getSupportActionBar().hide();
    }
    public void informacoesPessoais(View view){
        Intent i = new Intent(this, TelaColetaDeDados2.class);
        startActivity(i);
    }

    public void informacoesSaude(View view){
        Intent i = new Intent(this, TelaColetaDeDados3.class);
        startActivity(i);
    }

    public void informacoesNumero(View view){
        Intent i = new Intent(this, TelaColetaDeDados4.class);
        startActivity(i);
    }

    public void Planos(View view) {
        Intent y = new Intent(this, TelaDeVendas.class);
        startActivity(y);
    }

    public void salvarInfo(View view) {
        Intent y = new Intent(this, MainActivity.class);
        startActivity(y);
    }
}