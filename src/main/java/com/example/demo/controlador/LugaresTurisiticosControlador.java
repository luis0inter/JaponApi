package com.example.demo.controlador;

import com.example.demo.model.LugaresTurisiticos;
import com.example.demo.servicio.LugaresTurisiticosServicio;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/japon/lugares-turisticos")
class LugaresTurisiticosControlador {
private final LugaresTurisiticosServicio lugaresTurisiticosServicio;

public LugaresTurisiticosControlador(LugaresTurisiticosServicio lugaresTurisiticosServicio){
this.lugaresTurisiticosServicio = lugaresTurisiticosServicio;
}

@GetMapping public ResponseEntity<LugaresTurisiticos> getLugaresTuristicos(){
return ResponseEntity.ok(lugaresTurisiticosServicio.getLugaresTuristicos());
}
}
