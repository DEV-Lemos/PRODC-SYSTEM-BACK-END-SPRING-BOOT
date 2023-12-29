package com.backend.prodc.dto;

import com.backend.prodc.entities.Receitas;

public class ReceitasDTO {
    private Long id;
    private String descricao;
    private String tipo;

    public ReceitasDTO() {

    }

    public ReceitasDTO(Long id, String descricao, String tipo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public ReceitasDTO(Receitas entity) {
        this.id = entity.getId();
        this.descricao = entity.getDescricao();
        this.tipo = entity.getTipo();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
