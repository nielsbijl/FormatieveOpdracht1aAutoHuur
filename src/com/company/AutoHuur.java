package com.company;

public class AutoHuur {
    int aantalDagen = 0;
    Auto gehuurdeAuto;
    Klant huurder;

    void setAantalDagen(int aD){
        aantalDagen = aD;
    }
    void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;
    }
    Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }
    void setHuurder(Klant k){
        huurder = k;
    }
    Klant getHuurder(){
        return huurder;
    }
    String getHuurderNaam(){
        String huurderNaam = huurder.naam;
        return huurderNaam;
    }
    double getTotaalPrijs(Auto auto){
        double prijs = auto.getPrijsPerDag() * aantalDagen;
        double discount = prijs * huurder.kortingsPercentage * 0.01;
        return prijs - discount;
    }
    public String toString(){
        String gehuurdeAutoString;
        String huurderString;
        String aantalDagenString;
        double huurPrijs = 0.0;
        try {
            huurPrijs = getTotaalPrijs(gehuurdeAuto);
        }
        catch (Exception e){
            huurPrijs = 0.0;
        }
        aantalDagenString = "Aantal dagen: " + aantalDagen + " en dat kost:  " + huurPrijs;
        if (gehuurdeAuto == null) {
            gehuurdeAutoString = "Er is geen auto bekend";
        }
        else {
            gehuurdeAutoString = "autotype: " + gehuurdeAuto.type + " met prijs per dag: " + gehuurdeAuto.prijsPerDag;
        }
        if (huurder == null){
            huurderString = "Er is geen huurder bekend";
        }
        else {
            huurderString = "Op naam van: " + getHuurderNaam();
        }
        return gehuurdeAutoString + "\n" + huurderString + "\n" + aantalDagenString + "\n";
    }
}
