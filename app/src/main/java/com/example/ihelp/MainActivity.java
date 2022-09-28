package com.example.ihelp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText emailogin, senhalogin;
    AlertDialog.Builder alerta;

    Usuario u = new Usuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailogin = findViewById(R.id.emailogin2);
        senhalogin = findViewById(R.id.senhalogin2);
        alerta = new AlertDialog.Builder(this);

        getSupportActionBar().hide();
    }

    public void mudarTela() {
        //Intent a = new Intent(this, Cadastro.class);
        //startActivity(a);
    }
    public void irCadastro(View v){
        Intent i = new Intent(this, Cadastro.class);
        startActivity(i);
    }

    public void print(String p) {
        Toast.makeText(this, p, Toast.LENGTH_SHORT).show();
    }


    public void verfica_usuario(View view) {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Usuarios");
        reference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot d : snapshot.getChildren()) {
                    boolean aux = false;
                    String l = emailogin.getText().toString();
                    int s = Integer.parseInt(senhalogin.getText().toString());

                    for (DataSnapshot usuario : snapshot.getChildren()) {
                        if (d.getValue(Usuario.class).getLogin().equals(l) && d.getValue(Usuario.class).getSenha() == s) {
                            print("Bem Vindo!");
                            mudarTela();
                            break;

                        }
                    }
                    if (!aux) {
                        print("Usuario não Encontrado!");
                    }
                }

            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });


    }

}


