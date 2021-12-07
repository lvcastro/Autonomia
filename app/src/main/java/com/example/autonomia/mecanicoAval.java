package com.example.autonomia;

public class mecanicoAval{
    private Double atendimento, custo, agilidade,prazo,qualidade;
    public mecanicoAval(Double atendimento,Double custo,Double agilidade,Double prazo,Double qualidade){
           this.atendimento = atendimento;
           this.custo = custo;
           this.agilidade = agilidade;
           this.prazo = prazo;
           this.qualidade = qualidade;
    }
    public mecanicoAval(){

    }
    
    public Double getatendimento() {
        return atendimento;
    }
    public void setatendimento(Double atendimento) {
        this.atendimento = atendimento;
    }
    public Double getcusto() {
        return custo;
    }
    public void setcusto(Double custo) {
        this.custo = custo;
    }
    public Double getagilidade() {
        return agilidade;
    }
    public void setagilidade(Double agilidade) {
        this.agilidade = agilidade;
    }
    public Double getprazo() {
        return prazo;
    }
    public void setprazo(Double prazo) {
        this.prazo = prazo;
    }
    public Double getqualidade() {
        return qualidade;
    }
    public void setqualidade(Double qualidade) {
        this.qualidade = qualidade;
    }
}