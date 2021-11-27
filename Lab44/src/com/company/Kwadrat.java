package com.company;

public class Kwadrat extends Prostokat{
    int bok=1;

    public Kwadrat(int bok)
    {
        super(bok, bok);
        this.bok = bok;
    }

    @Override
    public void opis() {
        System.out.println("Kwadrat");
    }
}
