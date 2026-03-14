package com.example.demo.controlador;

import com.example.demo.model.Prefectura;
import com.example.demo.servicio.PrefecturaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prefecturas")
public class PrefecturaControlador {
    private final PrefecturaServicio prefecturaServicio;

    public PrefecturaControlador(PrefecturaServicio prefecturaServicio){
        this.prefecturaServicio = prefecturaServicio;
    }

    @GetMapping
    public List<Prefectura> obtenerTodas(){
        return prefecturaServicio.obtenerTodas();
    }
    @GetMapping("/{id}")
    public Optional<Prefectura> obtenerPorId(@PathVariable Long id){
        return prefecturaServicio.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar (@PathVariable Long id){
        return prefecturaServicio.eliminar(id);
    }

    @PostMapping
    public Prefectura guardar(@RequestBody Prefectura prefectura){
        return prefecturaServicio.guardar(prefectura);
    }


}
