package com.example.demo.repositorio;

import com.example.demo.model.LugaresTurisiticos;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LugaresTurisiticosRepositorio {
    private List<LugaresTurisiticos> lugaresTuristicos = new ArrayList<>();
private static int id = 1;

    public List<LugaresTurisiticos> getLugaresTuristicos() {
        return lugaresTuristicos;
    }
}
