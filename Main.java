package com.company;

public class Main {

    public static void main(String[] args) {

        Human osoba1 = new Human(20,80,170,"Maciek",true);
        Human osoba2 = new Human(22,60,163,"Ania",false);

        System.out.println(osoba1.getWzrost());
        System.out.println(osoba1.getWaga());
        System.out.println(osoba1.getWiek());
        System.out.println(osoba1.getImie());
        System.out.println(osoba1.isMale());

        Prostokat figura1 = new Prostokat(5,10);

        System.out.println("\nPole wynosi: " + figura1.pole());
        System.out.println("Obwod wynosi: " + figura1.obwod());
        System.out.println("Przekatna wynosi: " + figura1.przekatna());

        MyNumber liczba1 = new MyNumber(7);

        System.out.println("\nNieparzysta: " + liczba1.isOdd());
        System.out.println("Parzysta: " + liczba1.isEven());
        System.out.println("Pierwiastek: " + liczba1.sqrt());
        System.out.println("Potega 2: " + liczba1.pow(2));
        System.out.println("Dodac 4: " + liczba1.add(4));
        System.out.println("Odjac 3: " + liczba1.substract(3));

        Okrag kolo1 = new Okrag(0, 0, 10);

        System.out.println("\nPole powierzchni: " + kolo1.getPowierzchnia());
        System.out.println("Srednica: " + kolo1.getSrednica());
        System.out.println("Promien: " + kolo1.getPromien());
        System.out.println("Punkt w srodku: " + kolo1.wSrodku(2,4));
        System.out.println("Kolo na prostokacie o = 4 i b = 5: " + Okrag.opisany(4, 5));
        System.out.println("Kolo w kwadracie o a = 6: " + Okrag.wpisany(6));
    }
}
