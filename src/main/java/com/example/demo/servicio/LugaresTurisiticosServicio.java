package com.example.demo.servicio;

import com.example.demo.exception.ActividadesVacias;
import com.example.demo.exception.CampoVacio;
import com.example.demo.exception.ReviewsVacias;
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
    //Se valida si los valores de los atributos son vacíos para arrojar excepciones
   boolean validActividades = lugarTurisitico.getActividades().isEmpty();
   boolean validReviews = lugarTurisitico.getReviews().isEmpty();
   boolean nombreVacio = lugarTurisitico.getNombre().isEmpty();
   boolean ubicacionVacia = lugarTurisitico.getUbicacion().isEmpty();
    if(validActividades){
        throw new ActividadesVacias("La lista de actividades no debe estar vacía");
    }
    if (validReviews){
        throw new ReviewsVacias("La lista de reviews no debe estar vacía");
    }
    if (nombreVacio || ubicacionVacia){
        throw new CampoVacio("Ningun campo debe estar vacío");
    }
    return lugaresTurisiticosRepositorio.guardarLugarTuristico(lugarTurisitico);
}

public LugaresTurisiticos buscarLugarTuristico(int lugarTuristicoId){
    lugarTuristicoId--;
    return lugaresTurisiticosRepositorio.buscarLugarTuristico(lugarTuristicoId);
}

public List<String> getActividades(int lugarTuristicoId){
    lugarTuristicoId--;
    return lugaresTurisiticosRepositorio.getActividades(lugarTuristicoId);
}

public String getUbicacion(int lugarTuristicoId){
    lugarTuristicoId--;
    return lugaresTurisiticosRepositorio.getUbicacion(lugarTuristicoId);
}

public List<String> getReviews(int lugarTuristicoId){
    lugarTuristicoId--;
    return lugaresTurisiticosRepositorio.getReviews(lugarTuristicoId);
}

public LugaresTurisiticos agregarReview(int lugarTuristicoId, String review){
    lugarTuristicoId--;
    //Eliminar caracteres extra del body del request
    return lugaresTurisiticosRepositorio.agregarReview(lugarTuristicoId, review);
}


}
