package com.example.demo.servicio;

import com.example.demo.exception.CampoVacio;
import com.example.demo.exception.DineroNegativo;
import com.example.demo.model.Producto;
import com.example.demo.model.Tiendas;
import com.example.demo.repositorio.TiendasRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendasServicio {
    private final TiendasRepositorio tiendasRepositorio;

    public TiendasServicio(TiendasRepositorio tiendasRepositorio) {
        this.tiendasRepositorio = tiendasRepositorio;
    }

    public Tiendas guardarTiendas(Tiendas tienda) {
        if(hayPreciosNegativosProducto(tienda.getProductos())){
            throw new DineroNegativo("No puedes ponerle precio negativo");
        }
        if (hayAtributosVaciosTienda(tienda)) {
            throw new CampoVacio("Falta información de un atributo");
        }
        return tiendasRepositorio.guardarTiendas(tienda);
    }

    public List<Tiendas> mostrarTodas() {
        return tiendasRepositorio.mostrarTodas();
    }

    public Tiendas mostrarTienda(long id) {
        return tiendasRepositorio.mostrarTienda(id);
    }

    public Tiendas borrarTienda(long id) {
        return tiendasRepositorio.borrarTienda(id);
    }

    public Tiendas actualizarTienda(long id, Tiendas tienda) {
        return tiendasRepositorio.actualizarTienda(id,tienda);
    }
    public String mostrarUbicacion (long id){return tiendasRepositorio.mostrarUbiacion(id);}
    public List<Tiendas> mostrarTipoDeTiendaEnCiudad(String ciudad, String tipoTienda){
        return tiendasRepositorio.mostrarTipoDeTiendaEnCiudad(ciudad,tipoTienda);
    }
    private boolean hayPreciosNegativosProducto (List<Producto> listaProducto){
        for(int i=0; i<listaProducto.size(); i++){
            if(hayAtributosVaciosProducto(listaProducto.get(i))){
                return true;
            }
            if(listaProducto.get(i).getPrecio()<0){
                throw new DineroNegativo("No se puede poner precio negativo");
            }
        }
        return false;
    }
    private boolean hayAtributosNullTienda(Tiendas tienda){
        return tienda.getTipoTienda()==null||tienda.getPresupuesto()==null||tienda.getCiudad()==null||tienda.getNombre()==null||tienda.getUbicacion()==null;
    }
    private boolean hayAtributosVaciosTienda(Tiendas tienda){
        if(hayAtributosNullTienda(tienda)){
            throw new CampoVacio("Falta información de algunos atributo en la tienda");
        }
        return tienda.getTipoTienda().isBlank()||tienda.getCiudad().isBlank()||tienda.getNombre().isBlank()||tienda.getUbicacion().isBlank();
    }
    private boolean hayAtributosNullProducto(Producto producto){
        return producto.getPrecio()==null||producto.getBuenEstado()==null||producto.getCatalogo()==null||producto.getMarca()==null;
    }
    private boolean hayAtributosVaciosProducto(Producto producto){
        if(hayAtributosNullProducto(producto)){
            throw new CampoVacio("Falta información de algun atributo en los productos");
        }
        return producto.getMarca().isBlank()||producto.getCatalogo().isBlank();
    }
}