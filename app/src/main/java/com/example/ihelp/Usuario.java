package com.example.ihelp;

import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Usuario {
    String dataNasc, nomeCompleto, sexo, cpf, nTelefone, doencasQuePossui, alergias, medicamentosQueFazUso, tipoSanguineo;
    String login;
    int senha;


    public Usuario(String login, int senha) {
        this.login = login;
        this.senha = senha;

    }

    public Usuario() {

    }

    public Usuario(String dataNasc, String nomeCompleto, String sexo, String cpf, String nTelefone,String doencasQuePossui, String medicamentosQueFazUso, String tipoSanguineo,String alergias) {
        this.dataNasc = dataNasc;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.cpf = cpf;
        this.nTelefone = nTelefone;
        this.doencasQuePossui = doencasQuePossui;
        this.alergias= alergias;
        this.medicamentosQueFazUso = medicamentosQueFazUso;
        this.tipoSanguineo = tipoSanguineo;


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void salvar() {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Usuarios").child(login).setValue(this);
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getnTelefone() {
        return nTelefone;
    }

    public void setnTelefone(String nTelefone) {
        this.nTelefone = nTelefone;
    }

    public String getDoencasQuePossui() {
        return doencasQuePossui;
    }

    public void setDoencasQuePossui(String doencasQuePossui) {
        this.doencasQuePossui = doencasQuePossui;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentosQueFazUso() {
        return medicamentosQueFazUso;
    }

    public void setMedicamentosQueFazUso(String medicamentosQueFazUso) {
        this.medicamentosQueFazUso = medicamentosQueFazUso;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public void salvarInfo(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Usuarios").child(login).setValue(this);
    }


}

