package com.example.demo.repositorio;

import com.example.demo.model.Vehiculos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class    VehiculosRepositorio {

    public ArrayList<Vehiculos> vehiculos = new ArrayList<>(Arrays.asList(
            new Vehiculos(111, 2025, true,  "Tokyo"),
            new Vehiculos(112, 2019, false, "Tokyo"),
            new Vehiculos(113, 2022, true,  "Osaka")
    ));

    public List<Vehiculos> obtenerPorPrefectura(String ciudad) {
        return vehiculos.stream()
                .filter(v -> v.getPrefecturaa().equalsIgnoreCase(ciudad)) //Explicar mejor esta parte porq no se por que los punteros
                .collect(Collectors.toList());
    }

    public List<Vehiculos> obtenerCiudadAndAlimentacion(String ciudad, boolean alimentacionEco) {
        return vehiculos.stream()
                .filter(v -> v.getPrefecturaa().equalsIgnoreCase(ciudad) && v.isAlimentacionEco() == alimentacionEco)
                .collect(Collectors.toList());
    }
}