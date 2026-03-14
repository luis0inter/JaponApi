package com.example.demo.servicio;

import com.example.demo.model.Prefectura;
import com.example.demo.repositorio.PrefecturaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrefecturaServicio {
    private final PrefecturaRepositorio prefecturaRepositorio;

    public PrefecturaServicio (PrefecturaRepositorio prefecturaRepositorio){
        this.prefecturaRepositorio = prefecturaRepositorio;

    }
    public Prefectura guardar(Prefectura prefectura){
        return prefecturaRepositorio.guardar(prefectura);
    }
    public boolean eliminar (Long id){
        return prefecturaRepositorio.borrarPorId(id);
    }

    public Optional<Prefectura> obtenerPorId(Long id){
        return prefecturaRepositorio.encontrarPorId(id);
    }
    public List<Prefectura> obtenerTodas(){
        return prefecturaRepositorio.encontrarTodas();

    }
}
