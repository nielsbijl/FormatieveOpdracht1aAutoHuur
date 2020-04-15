package com.company;

public class Auto {
    String type;
    double prijsPerDag;

    public Auto(String tp, double prPd){
        type = tp;
        prijsPerDag = prPd;
    }
    void setPrijsPerDag(double prPd){
        prijsPerDag = prPd;
    }
    double getPrijsPerDag(){
        return prijsPerDag;
    }
    public String toString(){
        return type + " met prijs per dag: " + prijsPerDag;
    }

}
