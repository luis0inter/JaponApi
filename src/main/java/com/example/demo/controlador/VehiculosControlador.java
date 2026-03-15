package com.example.demo.controlador;

import com.example.demo.model.Vehiculos;
import com.example.demo.servicio.VehiculosServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculosControlador {

    private final VehiculosServicio vehiculosServicio;

    public VehiculosControlador(VehiculosServicio vehiculosServicio) {
        this.vehiculosServicio = vehiculosServicio;
    }


    @GetMapping("/ciudad/{ciudadId}")
    public ResponseEntity<List<Vehiculos>> getPorPrefectura(@PathVariable String ciudadId) { //PathVariable conecta el valor del url al parámetro ciudadId
        List<Vehiculos> vehiculos = vehiculosServicio.getPorPrefectura(ciudadId);

        if (vehiculos.isEmpty()) {
            return ResponseEntity.noContent().build(); // Error 204
        }

        return ResponseEntity.ok(vehiculos); //Error 200
    }


    @GetMapping("/ciudad/{ciudad}/alimentacion")
    public ResponseEntity<List<Vehiculos>> getTipoAlimentacion(
            @PathVariable String ciudad,
            @RequestParam boolean alimentacionEco) {

        List<Vehiculos> vehiculos = vehiculosServicio.getTipoAlimentacion(ciudad, alimentacionEco);

        if (vehiculos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(vehiculos);
    }

}