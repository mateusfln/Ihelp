package com.example.ihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {
    EditText email, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
        getSupportActionBar().hide();
    }
    public void mudaTelaCadastro(){
        Toast.makeText(this, "Usuario Cadastrado", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void cadastrar(View view){
        String l = email.getText().toString();
        int s = Integer.parseInt(senha.getText().toString());
        Usuario usu = new Usuario(l,s);
        usu.salvar();
        mudaTelaCadastro();
    }
}