package com.example.autonomia;

public class usuario {
    private String nome,senha,cpf,email, nascimento;
//Construtor

    public usuario(String nome, String senha, String cpf, String nascimento) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
        this.nascimento = nascimento;
    }

    //Construtor vazio
    public usuario(){
    }
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getNascimento() { return nascimento; }

    public void setNascimento(String nascimento) { this.nascimento = nascimento; }
}
