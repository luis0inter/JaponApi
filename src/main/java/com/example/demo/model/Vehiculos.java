package com.example.demo.model;

import lombok.Data;


@Data

public class Vehiculos {
    int id;
    int year;
    boolean alimentacionEco; //false será igual a gasolina
    String prefectura;

    public Vehiculos (int id, int year, boolean alimentacionEco, String prefectura){
        this.id = id;
        this.year = year;
        this.alimentacionEco = alimentacionEco;
        this.prefectura = prefectura;
    }
    //Getters
    public int getIddd() {
        return id;
    }
    public int getYearr() {
        return year;
    }
    public boolean getAlimentacion() {
        return alimentacionEco;
    }
    public String getPrefecturaa(){
        return prefectura;
    }

    //Setters
    public void setIdd(int id){
        this.id = id;
    }
    public void setYearr (int year){
        this.year = year;
    }
    public void setAlimentacion( boolean alimentacionEco){
        this.alimentacionEco = alimentacionEco;
    }
    public void setPrefecturaa (String prefectura){
        this.prefectura = prefectura;
    }

}