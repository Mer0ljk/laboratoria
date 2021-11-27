package com.company;

class Figura
{

    //pola metody i kontruktory
    Punkt punkt;
    String kolor = "bialy";


    public Figura(){
        punkt = new Punkt(0,0);
    }
    public Figura(String kolor){
        this.kolor=kolor;
        punkt= new Punkt(0,0);
    }
    public Figura(Punkt punkt){
        this.punkt=punkt;
    }
    public String getKolor() {
        return kolor;
    }

    public void opis()
    {
        System.out.println("Figura");
    }
}
