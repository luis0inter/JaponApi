package com.example.demo.repositorio;

import com.example.demo.model.Vehiculos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class    VehiculosRepositorio {
 //Simulo base de datos de vehículos. Vehículos de prueba
    public ArrayList<Vehiculos> vehiculos = new ArrayList<>(Arrays.asList(
            new Vehiculos(111, 2025, true,  "Tokyo"),
            new Vehiculos(112, 2019, false, "Tokyo"),
            new Vehiculos(113, 2022, true,  "Osaka")
    ));

    public List<Vehiculos> obtenerPorPrefectura(String ciudad) {
        List<Vehiculos> resultado = new ArrayList<>();

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo.getPrefecturaa().equalsIgnoreCase(ciudad)) { //equalsIgnoreCase compara la ciudad guardada en "vehiculo" contra la que manda el usuario en la URL.

                resultado.add(vehiculo);
            }
        }

        return resultado;
    }

    public List<Vehiculos> obtenerCiudadAndAlimentacion(String ciudad, boolean alimentacionEco) {
        List<Vehiculos> resultadoDeVehi = new ArrayList<>();

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo.getPrefecturaa().equalsIgnoreCase(ciudad) && vehiculo.isAlimentacionEco() == alimentacionEco) {
                resultadoDeVehi.add(vehiculo);
            }
        }

        return resultadoDeVehi;
    }
}