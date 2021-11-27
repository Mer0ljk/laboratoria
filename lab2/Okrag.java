package com.company;

import java.lang.Math;

public class Okrag {

    double srodekX;
    double srodekY;
    double promien;

    public Okrag()
    {
        this.srodekX = 0;
        this.srodekY = 0;
        this.promien = 1;
    }

    public Okrag(double srodekX, double srodekY, double promien)
    {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
    }

    public double getPowierzchnia()
    {
        return Math.PI * promien * promien;
    }

    public double getSrednica()
    {
        return promien * 2;
    }

    public double getPromien()
    {
        return promien;
    }

    public boolean wSrodku(double x, double y)
    {
        return (x <= srodekX + promien && y <= srodekY + promien);
    }

    public static Okrag opisany(double a, double b)
    {
        double srodekX = a/2;
        double srodekY = b/2;
        double promien = Math.sqrt((srodekX * srodekX + srodekY * srodekY));

        return new Okrag(srodekX, srodekY, promien);
    }

    public static Okrag wpisany(double a)
    {
        double srodekX = a/2;
        double srodekY = a/2;
        double promien = (a * Math.sqrt(2))/2;

        return new Okrag(srodekX, srodekY, promien);
    }
}
