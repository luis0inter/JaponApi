package com.example.demo.servicio;

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
}