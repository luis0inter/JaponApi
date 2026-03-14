package com.example.demo.repositorio;

import com.example.demo.model.Comida;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComidaRepositorio {
    private List<Comida> comidas = new ArrayList<>(
            List.of(
                    new Comida(1, "Sushi", 1800),
                    new Comida(2, "Ramen", 950),
                    new Comida(3, "Tempura", 1600),
                    new Comida(4, "Okonomiyaki", 1200),
                    new Comida(5, "Takoyaki", 600),
                    new Comida(6, "Udon", 850),
                    new Comida(7, "Soba", 900),
                    new Comida(8, "Katsudon", 1100),
                    new Comida(9, "Onigiri", 250),
                    new Comida(10, "Sopa Miso", 200),
                    new Comida(11, "Tonkatsu", 1400),
                    new Comida(12, "Gyudon", 650),
                    new Comida(13, "Shabu Shabu", 2500),
                    new Comida(14, "Sukiyaki", 2700),
                    new Comida(15, "Yakitori", 500),
                    new Comida(16, "Unagi Don", 2200),
                    new Comida(17, "Chawanmushi", 450),
                    new Comida(18, "Omurice", 900),
                    new Comida(19, "Curry Japonés", 800),
                    new Comida(20, "Korokke", 300)
            )
    );

    public List<Comida> getComida(){
        return comidas;
    }



}
