package com.example.autonomia;

public class servico {
    String lava,loja,mercado,borracharia,outro;

    public servico(String lava, String loja, String mercado, String borracharia, String outro) {
        this.lava = lava;
        this.loja = loja;
        this.mercado = mercado;
        this.borracharia = borracharia;
        this.outro = outro;
    }
    public servico() {

    }

    public String getLava() {
        return lava;
    }

    public void setLava(String lava) {
        this.lava = lava;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getBorracharia() {
        return borracharia;
    }

    public void setBorracharia(String borracharia) {
        this.borracharia = borracharia;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }
}
