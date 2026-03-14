package com.example.demo.controlador;

import com.example.demo.model.Tiendas;
import com.example.demo.servicio.TiendasServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiendas")
public class TiendasControlador {
    private final TiendasServicio tiendasServicio;
    public TiendasControlador(TiendasServicio tiendasServicio){
        this.tiendasServicio = tiendasServicio;
    }
    @GetMapping
    public ResponseEntity<List<Tiendas>> mostrarTodas(){
        return new ResponseEntity<>(tiendasServicio.mostrarTodas(), HttpStatus.OK);
    }
    @GetMapping("{tiendaID}")
    public ResponseEntity<Tiendas> mostrarTienda(@PathVariable long tiendaID){
        return new ResponseEntity<>(tiendasServicio.mostrarTienda(tiendaID),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> guardarTienda(@RequestBody Tiendas tienda){
        tiendasServicio.guardarTiendas(tienda);
        return new ResponseEntity<>("Se ha guardado la tienda correctamente",HttpStatus.CREATED);
    }
    @DeleteMapping ("{tiendaID}")
    public ResponseEntity<String> borrarTienda (@PathVariable long tiendaID){
        Tiendas tiendaRandom = tiendasServicio.borrarTienda(tiendaID);
        return new ResponseEntity<>("La "+tiendaRandom.getNombre()+" ha sido borrada exitosamente",HttpStatus.OK);
    }
    @PutMapping ("{tiendaID}")
    public ResponseEntity<String> actualizarTienda (@PathVariable long tiendaID, @RequestBody Tiendas tienda){
        tiendasServicio.actualizarTienda(tiendaID,tienda);
        return new ResponseEntity<>("Se han guardado los cambios correctamente "+tienda.getNombre(),HttpStatus.OK);
    }
}
