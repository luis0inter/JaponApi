package com.example.demo.model;

import java.util.List;

public class Tiendas {
    private Long ID_Tiendas;
    private String nombre;
    private String ubicacion;
    private Double presupuesto;
    private List<Producto> productos;
    private String ciudad;
    private String tipoTienda;

    public Tiendas (String nombre, String ubicacion, String ciudad, String tipoTienda, Double presupuesto, List<Producto> productos){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.ciudad = ciudad;
        this.tipoTienda = tipoTienda;
        this.presupuesto = presupuesto;
        this.productos = productos;
    }

    public Long getID_Tiendas() {
        return ID_Tiendas;
    }

    public Double getPresupuesto() {return presupuesto;}

    public void setID_Tiendas(long ID_Tiendas) {
        this.ID_Tiendas = ID_Tiendas;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPresupuesto(double presupuesto) {
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

    public void setID_Tiendas(Long ID_Tiendas) {
        this.ID_Tiendas = ID_Tiendas;
    }

    public String getTipoTienda() {
        return tipoTienda;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setTipoTienda(String tipoTienda) {
        this.tipoTienda = tipoTienda;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
