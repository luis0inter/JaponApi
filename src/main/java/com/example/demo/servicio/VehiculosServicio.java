package com.example.demo.servicio;
import com.example.demo.model.Vehiculos;
import com.example.demo.repositorio.VehiculosRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculosServicio {
    private final VehiculosRepositorio vehiculosRepositorio;

    public VehiculosServicio(VehiculosRepositorio vehiculosRepositorio) {
        this.vehiculosRepositorio = vehiculosRepositorio;
    }

    public List<Vehiculos> getPorPrefectura(String ciudadId) {
        return vehiculosRepositorio.obtenerPorPrefectura(ciudadId);
    }

    public List<Vehiculos> getTipoAlimentacion(String ciudad, boolean alimentacionEco) {
        return vehiculosRepositorio.obtenerCiudadAndAlimentacion(ciudad, alimentacionEco);
    }

}