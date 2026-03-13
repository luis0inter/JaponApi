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
class LugaresTurisiticosControlador {
private final LugaresTurisiticosServicio lugaresTurisiticosServicio;



public LugaresTurisiticosControlador(LugaresTurisiticosServicio lugaresTurisiticosServicio){
this.lugaresTurisiticosServicio = lugaresTurisiticosServicio;
}

@GetMapping public ResponseEntity<List<LugaresTurisiticos>> getLugaresTuristicos(){ //METODO GET para devolver todos los lugares
return ResponseEntity.ok(lugaresTurisiticosServicio.getLugaresTuristicos());
}

@PostMapping public ResponseEntity<LugaresTurisiticos> guardarLugarTursitico(@RequestBody LugaresTurisiticos lugarTurisitico){ //METODO POST para guardar un lugar nuevo
    log.info("Guardando lugar turístico como: " + lugarTurisitico.getNombre());
    return new ResponseEntity<>( lugaresTurisiticosServicio.guardarLugarTuristico(lugarTurisitico), HttpStatus.CREATED);
}

@GetMapping ("/{lugarTuristicoId}")public ResponseEntity<LugaresTurisiticos> obtenerLugarTuristico(@PathVariable int lugarTuristicoId){ //METODO GET para devolver un lugar específico
return new ResponseEntity<>(lugaresTurisiticosServicio.get(lugarTuristicoId),HttpStatus.OK);
}

@GetMapping("/{lugarTuristicoId}/actividades") public ResponseEntity<List<String>> getActividades(@PathVariable int lugarTuristicoId){
    return ResponseEntity.ok(lugaresTurisiticosServicio.getActividades(lugarTuristicoId),HttpStatus.OK);
}



}
