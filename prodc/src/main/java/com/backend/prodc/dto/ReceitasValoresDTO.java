package com.backend.prodc.dto;

import com.backend.prodc.entities.ReceitasValores;

public class ReceitasValoresDTO {
    private Long idReceita;
    private Float jan;
    private Float fev;
    private Float mar;
    private Float abr;
    private Float mai;
    private Float jun;
    private Float jul;
    private Float ago;
    private Float sete;
    private Float outu;
    private Float nov;
    private Float dez;

    public ReceitasValoresDTO() {

    }

    public ReceitasValoresDTO(Float jan, Float fev, Float mar, Float abr, Float mai, Float jun, Float jul, Float ago,
            Float sete, Float outu, Float nov, Float dez, Long idReceita) {
        this.idReceita = idReceita;
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
        this.abr = abr;
        this.mai = mai;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.sete = sete;
        this.outu = outu;
        this.nov = nov;
        this.dez = dez;
    }

    public ReceitasValoresDTO(ReceitasValores entity) {
        this.idReceita = entity.getIdReceita();
        this.jan = entity.getJan();
        this.fev = entity.getFev();
        this.mar = entity.getMar();
        this.abr = entity.getAbr();
        this.mai = entity.getMai();
        this.jun = entity.getJun();
        this.jul = entity.getJul();
        this.ago = entity.getAgo();
        this.sete = entity.getSete();
        this.outu = entity.getOutu();
        this.nov = entity.getNov();
        this.dez = entity.getDez();
    }

    public Long getidReceita() {
        return idReceita;
    }

    public void setidReceita(Long idReceita) {
        this.idReceita = idReceita;
    }

    public Float getJan() {
        return jan;
    }

    public void setJan(Float jan) {
        this.jan = jan;
    }

    public Float getFev() {
        return fev;
    }

    public void setFev(Float fev) {
        this.fev = fev;
    }

    public Float getMar() {
        return mar;
    }

    public void setMar(Float mar) {
        this.mar = mar;
    }

    public Float getAbr() {
        return abr;
    }

    public void setAbr(Float abr) {
        this.abr = abr;
    }

    public Float getMai() {
        return mai;
    }

    public void setMai(Float mai) {
        this.mai = mai;
    }

    public Float getJun() {
        return jun;
    }

    public void setJun(Float jun) {
        this.jun = jun;
    }

    public Float getJul() {
        return jul;
    }

    public void setJul(Float jul) {
        this.jul = jul;
    }

    public Float getAgo() {
        return ago;
    }

    public void setAgo(Float ago) {
        this.ago = ago;
    }

    public Float getSete() {
        return sete;
    }

    public void setSete(Float sete) {
        this.sete = sete;
    }

    public Float getOutu() {
        return outu;
    }

    public void setOutu(Float outu) {
        this.outu = outu;
    }

    public Float getNov() {
        return nov;
    }

    public void setNov(Float nov) {
        this.nov = nov;
    }

    public Float getDez() {
        return dez;
    }

    public void setDez(Float dez) {
        this.dez = dez;
    }
}
