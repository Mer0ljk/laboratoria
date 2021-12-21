package com.company;

public class Ksiazka {

    String autor;
    String nazwa;
    int dlugosc;

    public Ksiazka(String autor, String nazwa, int dlugosc){
        this.autor = autor;
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
    }

    public void opis()
    {
        System.out.println("Ksiaka: " + nazwa + " autor: " + autor + " dlugosc: " + dlugosc);
    }
}
