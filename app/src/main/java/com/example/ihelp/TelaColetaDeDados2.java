package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TelaColetaDeDados2 extends AppCompatActivity {
    EditText dataNasc, nomeCompleto, sexo, cpf, nTelefone;
    static Usuario logado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_coleta_de_dados2);
        getSupportActionBar().hide();

    }

    public void salvar1(View view) {
        Usuario u = logado;
        dataNasc = findViewById(R.id.dataNascimento);
        String dn = dataNasc.getText().toString();
        u.setDataNasc(dn);

        nomeCompleto = findViewById(R.id.nomeCompleto);
        String nc = nomeCompleto.getText().toString();
        u.setNomeCompleto(nc);

        sexo = findViewById(R.id.sexo);
        String sx = sexo.getText().toString();
        u.setSexo(sx);

        cpf = findViewById(R.id.cpf);
        String cp = cpf.getText().toString();
        u.setCpf(cp);

        nTelefone = findViewById(R.id.numeroDeTelefone);
        String nt = nTelefone.getText().toString();
        u.setnTelefone(nt);

        u.salvarInfo();
    }

    public void salvarInfo(View view) {
        Intent y = new Intent(this, TelaColetarDados.class);
        startActivity(y);
    }

//    public void cadastrar() {
//        String a = dataNasc.getText().toString();
//        String b = nomeCompleto.getText().toString();
//        String c = sexo.getText().toString();
//        String d = cpf.getText().toString();
//        String e = nTelefone.getText().toString();
//        if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(b) && !TextUtils.isEmpty(c) && !TextUtils.isEmpty(d) && !TextUtils.isEmpty(e)) {
//            Usuario usu = new Usuario(a, b, c, d, e);
//            usu.salvarInfo();
//
//        } else {
//            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
//        }
//    }
}



