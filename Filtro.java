package com.example.EditalProject.Entity;

import java.util.List;

public class Filtro {
    private boolean acessarEditalInovacao;
    private boolean acessarEditalPesquisa;
    private boolean acessarEditalExtensao;

    public Filtro(boolean acessarEditalInovacao, boolean acessarEditalPesquisa, boolean acessarEditalExtensao) {
        this.acessarEditalInovacao = acessarEditalInovacao;
        this.acessarEditalPesquisa = acessarEditalPesquisa;
        this.acessarEditalExtensao = acessarEditalExtensao;
    }

    public List<EditalInovacao> filtrarEditalInovacao(List<EditalInovacao> editais) {
        if (acessarEditalInovacao) {
            return editais;
        } else {
            return null;
        }
    }

    public List<EditalPesquisa> filtrarEditalPesquisa(List<EditalPesquisa> editais) {
        if (acessarEditalPesquisa) {
            return editais;
        } else {
            return null;
        }
    }

    public List<EditalExtensao> filtrarEditalExtensao(List<EditalExtensao> editais) {
        if (acessarEditalExtensao) {
            return editais;
        } else {
            return null;
        }
    }

    public boolean isAcessarEditalInovacao() {
        return acessarEditalInovacao;
    }

    public void setAcessarEditalInovacao(boolean acessarEditalInovacao) {
        this.acessarEditalInovacao = acessarEditalInovacao;
    }

    public boolean isAcessarEditalPesquisa() {
        return acessarEditalPesquisa;
    }

    public void setAcessarEditalPesquisa(boolean acessarEditalPesquisa) {
        this.acessarEditalPesquisa = acessarEditalPesquisa;
    }

    public boolean isAcessarEditalExtensao() {
        return acessarEditalExtensao;
    }

    public void setAcessarEditalExtensao(boolean acessarEditalExtensao) {
        this.acessarEditalExtensao = acessarEditalExtensao;
    }
}
