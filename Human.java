package com.company;

public class Human {

    int wiek;
    double waga, wzrost;
    String imie;
    boolean plec;

    public Human(int wiek, double waga, double wzrost, String imie, boolean plec) {
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
        this.imie = imie;
        this.plec = plec;
    }

    public int getWiek()
    {
        return wiek;
    }

    public double getWaga()
    {
        return waga;
    }

    public double getWzrost()
    {
        return wzrost;
    }

    public String getImie()
    {
        return imie;
    }

    public boolean isMale()
    {
        return true;
    }
}
