package com.company;

class Trojkat extends Figura
{
    int wys=0;
    int podst=0;

    public Trojkat(int wys,int podst)
    {
        this.wys = wys;
        this.podst = podst;
    }

    public Trojkat(int wys, int podst, String kolor) {
        super();
        this.wys = wys;
        this.podst = podst;
        this.kolor = kolor;
    }

    @Override
    public void opis() {
        System.out.println("Kwadrat");
    }
}