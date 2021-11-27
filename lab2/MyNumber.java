package com.company;

public class MyNumber {

    int num;

    public MyNumber(int num) {
        this.num = num;
    }

    public boolean isOdd()
    {
        return num%2!=0;
    }

    public boolean isEven()
    {
        return num%2==0;
    }

    public double sqrt()
    {
        return Math.sqrt(num);
    }

    public double pow(int x)
    {
        return Math.pow(num, x);
    }

    public int add(int y)
    {
        return num + y;
    }

    public int substract(int z)
    {
        return num - z;
    }
}
