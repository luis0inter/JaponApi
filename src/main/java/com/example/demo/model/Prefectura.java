package com.example.demo.model;

import lombok.Data;


@Data

public class Prefectura {
    Long id;
    String nombre;
    String region;
    String capital;
    int poblacion;

    public Prefectura(Long id, String nombre, String region, String capital, int poblacion){
        this.id = id;
        this.capital = capital;
        this.region = region;
        this.poblacion = poblacion;
        this.nombre = nombre;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getRegion() { return region; }
    public String getCapital() { return capital; }
    public int getPoblacion() { return poblacion; }


    public void setId(Long id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRegion(String region) { this.region = region; }
    public void setCapital(String capital) { this.capital = capital; }
    public void setPoblacion(int poblacion) { this.poblacion = poblacion; }
}

