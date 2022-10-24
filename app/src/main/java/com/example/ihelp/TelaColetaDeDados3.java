package com.example.ihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaColetaDeDados3 extends AppCompatActivity {
    EditText doencasQuePossui, alergias, medicamentosQueFazUso, tipoSanguineo;
    static Usuario logado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_coleta_de_dados3);
        getSupportActionBar().hide();
    }

    public void salvar1(View view) {
        Usuario u = logado;
        doencasQuePossui = findViewById(R.id.doencasQuePossui);
        String dp = doencasQuePossui.getText().toString();
        u.setDoencasQuePossui(dp);

        alergias = findViewById(R.id.Alergia);
        String al = alergias.getText().toString();
        u.setNomeCompleto(al);

        medicamentosQueFazUso = findViewById(R.id.Medicamentos);
        String md = medicamentosQueFazUso.getText().toString();
        u.setSexo(md);

        tipoSanguineo = findViewById(R.id.TpSanguineo);
        String ts = tipoSanguineo.getText().toString();
        u.setCpf(ts);
        
        u.salvarInfo();
    }

    public void salvarInfo(View view) {
        Intent y = new Intent(this, TelaColetarDados.class);
        startActivity(y);
    }

    public void cadastrar() {
        String a = doencasQuePossui.getText().toString();
        String b = alergias.getText().toString();
        String c = medicamentosQueFazUso.getText().toString();
        String d = tipoSanguineo.getText().toString();
        if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(b) && !TextUtils.isEmpty(c) && !TextUtils.isEmpty(d) && !TextUtils.isEmpty(d)) {
            Usuario usu = new Usuario(a, b, c, d);
            usu.salvarInfo();
            //salvarInfo(view);
        } else {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        }
    }
}