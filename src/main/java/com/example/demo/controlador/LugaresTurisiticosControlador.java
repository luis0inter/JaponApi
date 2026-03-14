package com.example.demo.controlador;

import com.example.demo.model.LugaresTurisiticos;
import com.example.demo.repositorio.LugaresTurisiticosRepositorio;
import com.example.demo.servicio.LugaresTurisiticosServicio;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/japon/lugares-turisticos")
@Slf4j
public class LugaresTurisiticosControlador {
private final LugaresTurisiticosServicio lugaresTurisiticosServicio;
    private final LugaresTurisiticosRepositorio lugaresTurisiticosRepositorio;


    public LugaresTurisiticosControlador(LugaresTurisiticosServicio lugaresTurisiticosServicio, LugaresTurisiticosRepositorio lugaresTurisiticosRepositorio){
        this.lugaresTurisiticosServicio = lugaresTurisiticosServicio;
        this.lugaresTurisiticosRepositorio = lugaresTurisiticosRepositorio;
    }

@GetMapping public ResponseEntity<List<LugaresTurisiticos>> getLugaresTuristicos(){ //METODO GET para devolver todos los lugares
return ResponseEntity.ok(lugaresTurisiticosServicio.getLugaresTuristicos());
}

@PostMapping public ResponseEntity<LugaresTurisiticos> guardarLugarTursitico(@RequestBody LugaresTurisiticos lugarTurisitico){ //METODO POST para guardar un lugar nuevo
    log.info("Guardando lugar turístico como: " + lugarTurisitico.getNombre());
    return new ResponseEntity<>( lugaresTurisiticosServicio.guardarLugarTuristico(lugarTurisitico), HttpStatus.CREATED);
}


    //METODO GET para devolver un lugar específico
@GetMapping ("/{lugarTuristicoId}")public ResponseEntity<LugaresTurisiticos> buscarLugarTuristico(@PathVariable int lugarTuristicoId){
return new ResponseEntity<>(lugaresTurisiticosServicio.buscarLugarTuristico(lugarTuristicoId),HttpStatus.OK);
}


    //METODO GET para devolver las actividades de un lugar específico
@GetMapping("/{lugarTuristicoId}/actividades") public ResponseEntity<List<String>> getActividades(@PathVariable int lugarTuristicoId){
    return ResponseEntity.ok(lugaresTurisiticosServicio.getActividades(lugarTuristicoId));
}


    //METODO GET para devolver la ubicación de un lugar específico
@GetMapping("/{lugarTuristicoId}/ubicacion") public ResponseEntity<String> getUbicacion(@PathVariable int lugarTuristicoId){
    return ResponseEntity.ok(lugaresTurisiticosServicio.getUbicacion(lugarTuristicoId));
}

    //METODO GET para devolver las reviews de un lugar específico
    @GetMapping("/{lugarTuristicoId}/reviews") public ResponseEntity<List<String>> getReviews(@PathVariable int lugarTuristicoId){
        return ResponseEntity.ok(lugaresTurisiticosServicio.getReviews(lugarTuristicoId));
    }

    //METODO PATCH para actualizar un campo específico del recurso, en este caso, agregar una reseña a un lugar turístico
    //NOTA: En la sección body del request de POSTMAN, seleccionar la opción de raw y en el menú desplegable seleccionar TEXT. Escribir la nueva reseña sin comillas, puro texto
    @PatchMapping("/{lugarTuristicoId}") public ResponseEntity<LugaresTurisiticos> agregarReview(@PathVariable int lugarTuristicoId, @RequestBody String review){
        return ResponseEntity.ok(lugaresTurisiticosServicio.agregarReview(lugarTuristicoId,review));
    }

}
