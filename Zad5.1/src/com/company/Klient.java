package com.company;

public class Klient {

    String Imie;
    String Nazwisko;
    int wiek;

    public Klient(String Imie, String Nazwisko, int wiek){
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.wiek = wiek;
    }

    public void DaneKlienta()
    {
        System.out.println("Imie: " + Imie + " Nazwisko: " + Nazwisko + " Wiek: " + wiek);
    }
}
