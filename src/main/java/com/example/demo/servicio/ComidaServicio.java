package com.example.demo.servicio;

import com.example.demo.model.Comida;
import com.example.demo.repositorio.ComidaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComidaServicio {
    private final ComidaRepositorio comidaRepositorio;

    public ComidaServicio(ComidaRepositorio comidaRepositorio){
        this.comidaRepositorio = comidaRepositorio;
    }

    public List<Comida> getComida(){
        return comidaRepositorio.getComida();
    }

}
