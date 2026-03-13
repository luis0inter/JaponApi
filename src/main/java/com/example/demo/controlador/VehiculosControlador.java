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

    //Debería de ser con algo como esto según yo osea si es posible
    /*    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes() {
        return ResponseEntity.ok(clienteService.getClientes());
        //return clienteService.getClientes(); esto es si lo hubiera puesto con ? en vez del responseEntity
    }

     */

    @GetMapping("/ciudad/{ciudadId}")
    public ResponseEntity<List<Vehiculos>> getPorPrefectura(@PathVariable String ciudadId) { //Checar lo de PathVariable q no se q es
        List<Vehiculos> vehiculos = vehiculosServicio.getPorPrefectura(ciudadId);

        if (vehiculos.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204
        }

        return ResponseEntity.ok(vehiculos); // 200
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