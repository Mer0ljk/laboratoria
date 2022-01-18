package com.company;

public class Wieloryb implements Plywanie{
    @Override
    public void plyn() {
        System.out.println("wieloryb plywa");
    }

    @Override
    public void wynurz() {
        System.out.println("wieloryb wynurza sie");
    }

    @Override
    public void zanurz() {
        System.out.println("wieloryb zanurza sie");
    }
}
