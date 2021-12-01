package com.example.autonomia;

import java.util.ArrayList;

public class posto {
    private String nome,estado,cidade,bairro,rua,numero;
    private ArrayList servicos = new ArrayList();

    public posto(String nome, String estado, String cidade, String bairro, String rua, String numero, ArrayList servicos) {
        this.nome = nome;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.servicos = servicos;
    }
    public posto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList servicos) {
        this.servicos = servicos;
    }
}
