package com.example.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "evenimente")
public class Eveniment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String denumirea;
    private String locatia;
    private LocalDate data;
    private int timpul;
    private float pretul;

    public Eveniment() {}

    public Eveniment(int id, String denumirea, String locatia, LocalDate data, int timpul, float pretul) {
        this.id = id;
        this.denumirea = denumirea;
        this.locatia = locatia;
        this.data = data;
        this.timpul = timpul;
        this.pretul = pretul;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumirea() {
        return denumirea;
    }

    public void setDenumirea(String denumirea) {
        this.denumirea = denumirea;
    }

    public String getLocatia() {
        return locatia;
    }

    public void setLocatia(String locatia) {
        this.locatia = locatia;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getTimpul() {
        return timpul;
    }

    public void setTimpul(int timpul) {
        this.timpul = timpul;
    }

    public float getPretul() {
        return pretul;
    }

    public void setPretul(float pretul) {
        this.pretul = pretul;
    }

    @Override
    public String toString() {
        return id + ", " + denumirea + ", " + locatia + ", " + data + ", " + timpul + ", " + pretul;
    }
}
