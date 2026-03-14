package com.example.demo.servicio;

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
            if(listaProducto.get(i).getPrecio()<0){
                return true;
            }
        }
        return false;
    }
}