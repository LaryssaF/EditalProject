package com.example.EditalProject.Entity;

import java.time.LocalDate;

public class EditalExtensao {
    private String titulo;
    private String descricao;
    private LocalDate prazo;
    private String criteriosSelecao;
    private String requisitos;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setCriteriosSelecao(String criteriosSelecao) {
        this.criteriosSelecao = criteriosSelecao;
    }

    public String getCriteriosSelecao() {
        return criteriosSelecao;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getRequisitos() {
        return requisitos;
    }
}