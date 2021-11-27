package com.company;

public class Main {

    public static void main(String[] args) {

        Figura figura1 = new Figura(new Punkt(4, 5));

        Prostokat prostokat1 = new Prostokat(4, 5);

        Punkt punkt1 = new Punkt(7, 2);

        Trojkat trojkat1 = new Trojkat(5, 3);

        figura1.opis();
        prostokat1.opis();

        System.out.println(prostokat1.punkt.getX());
        System.out.println(prostokat1.punkt.getY());
        prostokat1.przesun(3, 5);

        System.out.println(prostokat1.punkt.getX());
        System.out.println(prostokat1.punkt.getY());

        Kwadrat kwadrat1 = new Kwadrat(5);
    }
}
