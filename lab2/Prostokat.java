package com.company;

public class Prostokat {

    double dlugosc, szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double pole()
    {
        return dlugosc * szerokosc;
    }

    public double obwod()
    {
        return (2 * dlugosc) + (2 * szerokosc);
    }

    public double przekatna()
    {
        return Math.sqrt((dlugosc*dlugosc) + (szerokosc*szerokosc));
    }
}
