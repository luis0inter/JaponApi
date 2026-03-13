package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class LugaresTurisiticos {

    private String nombre;
    private String ubicacion;
    private List<String> actividades;
    private List<String> reviews;
    private int id;

    public LugaresTurisiticos (String ubicacion, List<String> actividades, List<String> reviews){
        this.ubicacion = ubicacion;
        this.actividades = actividades;
        this.reviews = reviews;
    }
    public String getUbicacion(){
        return ubicacion;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public List<String> getActividades() {
        return actividades;
    }

    public void setActividades(List<String> actividades) {
        this.actividades = actividades;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
