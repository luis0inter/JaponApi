package com.example.demo.repositorio;

import com.example.demo.exception.NoEncontrado;
import com.example.demo.model.Tiendas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TiendasRepositorio {
    private static long tiendaID = 1L;
    private List<Tiendas> tiendas = new ArrayList<>();
    public Tiendas guardarTiendas(Tiendas tienda){
        tienda.setID_Tiendas(tiendaID);
        tiendas.add(tienda);
        return tienda;
    }
    public List<Tiendas> mostrarTodas(){
        return tiendas;
    }
    public Tiendas mostrarTienda(long id){
        return tiendas.get(encontrarTienda(id));
    }
    public Tiendas borrarTienda (long id){
        Tiendas tiendaRandom = tiendas.get(encontrarTienda(id));
        tiendas.remove(encontrarTienda(id));
        return tiendaRandom;
    }
    public Tiendas actualizarTienda (long id, Tiendas tienda){
        tiendas.get(encontrarTienda(id)).setNombre(tienda.getNombre());
        tiendas.get(encontrarTienda(id)).setDireccion(tienda.getDireccion());
        tiendas.get(encontrarTienda(id)).setPresupuesto(tienda.getPresupuesto());
        tiendas.get(encontrarTienda(id)).setProductos(tienda.getProductos());
        return tienda;
    }
    private int encontrarTienda(long id) {
        for (int i = 0; i < tiendas.size(); i++) {
            if (tiendas.get(i).getID_Tiendas().equals(id)) {
                return i;
            }
        }
        throw new NoEncontrado("Esa tienda no existe");
    }
}
