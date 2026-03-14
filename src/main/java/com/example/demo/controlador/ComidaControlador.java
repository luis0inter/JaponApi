package com.example.demo.controlador;

import com.example.demo.model.Comida;
import com.example.demo.repositorio.ComidaRepositorio;
import com.example.demo.servicio.ComidaServicio;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/japon/comida")
@Slf4j
public class ComidaControlador {
    private final ComidaServicio comidaServicio;


    public ComidaControlador(ComidaServicio comidaServicio){
        this.comidaServicio = comidaServicio;
    }

    @GetMapping public ResponseEntity<List<Comida>>getComida(){ //METODO GET para devolver toda la comida
        return ResponseEntity.ok(comidaServicio.getComida());
    }


}
