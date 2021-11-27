package com.company;

class Prostokat extends Figura
{
    int wys=0;
    int szer=0;


    Prostokat(int wys,int szer){

        this.wys = wys;
        this.szer = szer;

    }
    public Prostokat(int wys, int szer, String kolor) {
        super();
        this.wys = wys;
        this.szer = szer;
        this.kolor = kolor;
    }

    public void przesun(int x, int y)
    {
        super.punkt.x = x;
        super.punkt.y = y;
    }

    int getPowierzchnia() {
        return (szer * wys);
    }

    @Override
    public void opis() {
        System.out.println("Prostokat");
    }
}