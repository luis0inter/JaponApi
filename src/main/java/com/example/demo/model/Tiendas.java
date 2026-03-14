package com.example.demo.model;

import com.example.demo.exception.DineroNegativo;

import java.util.List;

public class Tiendas {
    private Long ID_Tiendas;
    private String nombre;
    private String direccion;
    private double presupuesto;
    private List<Producto> productos;

    public Tiendas (String nombre, String direccion, double presupuesto, List<Producto> productos){
        this.nombre = nombre;
        this.direccion = direccion;
        this.presupuesto = presupuesto;
        this.productos = productos;
    }

    public Long getID_Tiendas() {
        return ID_Tiendas;
    }

    public double getPresupuesto() {return presupuesto;}

    public void setID_Tiendas(long ID_Tiendas) {
        this.ID_Tiendas = ID_Tiendas;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPresupuesto(double presupuesto) {
        if(presupuesto<0){
            throw new DineroNegativo("El presupuesto no debe ser negativo");
        }
        this.presupuesto = presupuesto;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
