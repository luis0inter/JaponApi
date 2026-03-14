package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comida {
    private int id;
    private String nombre;
    private double precioYen;

}


