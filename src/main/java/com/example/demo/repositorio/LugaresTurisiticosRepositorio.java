package com.example.demo.repositorio;

import com.example.demo.model.LugaresTurisiticos;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LugaresTurisiticosRepositorio {
    private List<LugaresTurisiticos> lugaresTuristicos = new ArrayList<>();
    private static int id = 1;

    public List<LugaresTurisiticos> getLugaresTuristicos() {
        return lugaresTuristicos;
    }

    public LugaresTurisiticos guardarLugarTuristico(LugaresTurisiticos lugarTurisitico){
        lugarTurisitico.setId(id++);
        lugaresTuristicos.add(lugarTurisitico);
        return lugarTurisitico;
    }

    public LugaresTurisiticos buscarLugarTuristico(int lugarTurisiticoId){
        return lugaresTuristicos.get(lugarTurisiticoId);
    }

    public List<String> getActividades(int lugarTuristicoId){
        return lugaresTuristicos.get(lugarTuristicoId).getActividades();
    }

    public String getUbicacion(int lugarTuristicoId){
        return lugaresTuristicos.get(lugarTuristicoId).getUbicacion();
    }

    public List<String> getReviews(int lugarTuristicoId){
        return lugaresTuristicos.get(lugarTuristicoId).getReviews();
    }

    public LugaresTurisiticos agregarReview( int lugarTuristicoId, String review){
        lugaresTuristicos.get(lugarTuristicoId).getReviews().add(review);
        return lugaresTuristicos.get(lugarTuristicoId);
    }

}
