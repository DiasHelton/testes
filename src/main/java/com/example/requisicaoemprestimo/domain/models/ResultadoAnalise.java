package com.example.requisicaoemprestimo.domain.models;

public class ResultadoAnalise {
    private boolean aprovado;
    private String[] resultado;

    public ResultadoAnalise(){
        this.aprovado = false;
        this.resultado = new String[0];
    }

    public ResultadoAnalise(boolean aprovado, String[] resultado)
    {
        this.aprovado = aprovado;
        this.resultado = resultado;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public String[] getResultado() {
        return resultado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void setResultado(String[] resultado) {
        this.resultado = resultado;
    }
}

