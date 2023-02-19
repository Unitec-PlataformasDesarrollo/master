package com.minipascalcompiler.minipascal;

public class fila{
    private String identifiador;
    private String tipo;
    private String valor;

    public fila(String identifiador, String tipo, String valor) {
        this.identifiador = identifiador;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public fila(String identifiador, String tipo) {
        this.identifiador = identifiador;
        this.tipo = tipo;
    }

    public String getIdentifiador() {
        return identifiador;
    }

    public void setIdentifiador(String identifiador) {
        this.identifiador = identifiador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}