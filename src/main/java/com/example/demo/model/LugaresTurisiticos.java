package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class LugaresTurisiticos {

    private String nombre;
    private String ubicacion;
    private List<String> actividades;
    private List<String> reviews;
    private int id;


}
