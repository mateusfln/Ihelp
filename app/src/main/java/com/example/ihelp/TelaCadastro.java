package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastro extends AppCompatActivity {
    EditText email, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar);
        email = findViewById(R.id.emaiCadastro);
        senha = findViewById(R.id.senhaCadastro);
        getSupportActionBar().hide();
    }
    public void mudaTelaCadastro(View view) {
        Toast.makeText(this, "Usuario Cadastrado", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, TelaLogin.class);
        startActivity(i);
    }
    public void volta(View view) {
        Intent i = new Intent(this, TelaLogin.class);
        startActivity(i);
    }
    public void cadastrar(View view){
        String l = email.getText().toString();
        String s = senha.getText().toString();
        if (!TextUtils.isEmpty(l) && !TextUtils.isEmpty(s)) {
            int senhalogin_int = Integer.parseInt(senha.getText().toString());
            Usuario usu = new Usuario(l, senhalogin_int);
            usu.salvar();
            mudaTelaCadastro(view);
        } else {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        }
    }
}