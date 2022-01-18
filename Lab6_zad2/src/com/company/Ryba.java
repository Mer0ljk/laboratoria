package com.company;

public abstract class Ryba extends Zwierze implements Plywanie {

    void jedz(){
        System.out.println("zwierze je");
    }
    void wydalaj(){
        System.out.println("zwierze wydala");
    }

    @Override
    public String gatunek() {
        return "Ssak";
    }

    public Ryba(){

    }

    @Override
    public void plyn() {
        System.out.println("zwierze plywa");
    }

    @Override
    public void wynurz() {
        System.out.println("zwierze sie wynurza");
    }

    @Override
    public void zanurz() {
        System.out.println("zwierze sie zanurza");
    }
}
