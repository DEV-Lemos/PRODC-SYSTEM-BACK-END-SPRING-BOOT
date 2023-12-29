package com.backend.prodc.dto;

import com.backend.prodc.entities.CustosDespesas;

public class CustosDespesasDTO {

    private Long id;
    private Integer numero;
    private String nome;

    public CustosDespesasDTO() {

    }

    public CustosDespesasDTO(Long id, String nome, Integer numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public CustosDespesasDTO(CustosDespesas entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.numero = entity.getNumero();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
