package com.example.demo.model;
public class Producto {
    private static long ID_producto;
    private String marca;
    private Double precio;
    private Boolean buenEstado;
    private String catalogo;

    public Producto(String marca, Double precio, Boolean buenEstado, String catalogo){
        this.marca = marca;
        this.precio = precio;
        this.buenEstado = buenEstado;
        this.catalogo = catalogo;
    }

    public Boolean getBuenEstado() {
        return buenEstado;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getCatalogo() {
        return catalogo;
    }

    public String getMarca() {
        return marca;
    }

    public void setBuenEstado(Boolean buenEstado) {
        this.buenEstado = buenEstado;
    }

    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public static long getID_producto() {
        return ID_producto;
    }

    public static void setID_producto(long ID_producto) {
        Producto.ID_producto = ID_producto;
    }
}
