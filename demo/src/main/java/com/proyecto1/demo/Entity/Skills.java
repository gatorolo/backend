package com.proyecto1.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String NombreSkill;
    private String fotoSkill;
    private int porcentajeSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, String fotoSkill, int porcentajeSkill) {
        this.idSkill = idSkill;
        NombreSkill = nombreSkill;
        this.fotoSkill = fotoSkill;
        this.porcentajeSkill = porcentajeSkill;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return NombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        NombreSkill = nombreSkill;
    }

    public String getFotoSkill() {
        return fotoSkill;
    }

    public void setFotoSkill(String fotoSkill) {
        this.fotoSkill = fotoSkill;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }
}