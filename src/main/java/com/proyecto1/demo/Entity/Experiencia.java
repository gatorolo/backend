package com.proyecto1.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long idExp;
    private String tituloExp;
    private int fechaExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(long idExp) {

    }

    public Experiencia(long idExp, String tituloExp, int fechaExp, String imgExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.imgExp = imgExp;
    }

    public long getIdExp() {
        return idExp;
    }

    public void setIdExp(long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(int fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
}