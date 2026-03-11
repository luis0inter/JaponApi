package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class LugaresTurisiticos {
    private String ubicacion;
    private List<String> actividades;
    private List<String> reviews;

    public LugaresTurisiticos (String ubicacion, List<String> actividades, List<String> reviews){
        this.ubicacion = ubicacion;
        this.actividades = actividades;
        this.reviews = reviews;
    }


}
