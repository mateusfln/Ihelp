package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class telaInfoPessoais extends AppCompatActivity {
    EditText dataNasc, nomeCompleto, sexo, cpf, nTelefone;
    static Usuario logado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_info_pessoais);
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

        Intent y = new Intent(this, TelaColetarDados.class);
        startActivity(y);
    }
}
