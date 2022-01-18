package com.company;

public class Ptak implements Latanie{
    @Override
    public void lec() {
        System.out.println("Ptak leci");
    }

    @Override
    public void wyladuj() {
        System.out.println("Ptak laduje");
    }
}
