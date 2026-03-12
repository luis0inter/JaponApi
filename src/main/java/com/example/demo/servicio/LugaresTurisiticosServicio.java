package com.example.demo.servicio;

import com.example.demo.model.LugaresTurisiticos;
import com.example.demo.repositorio.LugaresTurisiticosRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugaresTurisiticosServicio {
private final LugaresTurisiticosRepositorio lugaresTurisiticosRepositorio;

public LugaresTurisiticosServicio(LugaresTurisiticosRepositorio lugaresTurisiticosRepositorio){
    this.lugaresTurisiticosRepositorio = lugaresTurisiticosRepositorio ;
}

public List<LugaresTurisiticos> getLugaresTuristicos(){
    return lugaresTurisiticosRepositorio.getLugaresTuristicos();
}

public LugaresTurisiticos guardarLugarTuristico(LugaresTurisiticos lugarTurisitico){
    return lugaresTurisiticosRepositorio.guardarLugarTuristico(lugarTurisitico);
}






}
