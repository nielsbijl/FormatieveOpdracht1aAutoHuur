package com.company;

public class Klant {
    String naam;
    double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }
    public void setKorting(double kP){
        kortingsPercentage = kP;
    }
    public double getKorting(){
        return kortingsPercentage;
    }
}
