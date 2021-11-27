package com.company;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        //zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5();
        //zadanie6();
        //zadanie7();
    }

    public static void zadanie1() {
        int[] array = new int[10];
        int max = array[0], min = array[0], ileW = 0, ileM = 0;
        float srednia, suma = 0;

        Random rand = new Random();

        System.out.println("Zadanie 1\n");

        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(21) - 10;
            System.out.print(array[i] + " ");

            if(max < array[i]) max = array[i];
            else if(min > array[i]) min = array[i];

            suma += array[i];
        }

        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);

        srednia = suma/array.length;

        for (int i = 0; i < array.length; i++)
        {
            if(array[i] > srednia) ileW++;
            else ileM++;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Srednia: " + srednia);
        System.out.println("Mniejszych niz srednia: " + ileM);
        System.out.println("Wiekszych niz srednia: " + ileW);

        System.out.println("Odwrocona tablica: ");
        for (int i = array.length - 1; i >= 0 ; i--)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void zadanie2() {
        int[][] matrix = new int[5][5];
        int minK = matrix[0][0], minW = matrix[0][0], maxK = matrix[0][0], maxW = matrix[0][0];

        Random rand = new Random();

        System.out.println("Zadanie 2\n");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = rand.nextInt(11)-5;

                if(matrix[i][j] >= 0)
                {
                    System.out.print(" ");
                }

                System.out.print(matrix[i][j] + " | ");
            }
            System.out.print("\n------------------------\n");
        }

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if( matrix[i][j] > maxW)
                {
                    maxW = matrix[i][j];
                }
                else if (matrix[i][j] < minW)
                {
                    minW = matrix[i][j];
                }

            }
            System.out.print("\n W" + i + " MaxW = " + maxW);
            System.out.print(" MinW = " + minW);

            minW = 5;
            maxW = -5;
        }

        System.out.println("\n");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if( matrix[j][i] > maxK)
                {
                    maxK = matrix[j][i];
                }
                else if (matrix[j][i] < minK)
                {
                    minK = matrix[j][i];
                }

            }
            System.out.print("\n K" + i + " MaxK = " + maxK);
            System.out.print(" MinK = " + minK);

            minK = 5;
            maxK = -5;
        }
    }

    public static void zadanie3() {

        int[] array = new int[32];
        int Unumber;
        int licznik = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita: ");
        Unumber = in.nextInt();

        if (Unumber < 0)
        {
            Unumber *= -1;

            while (Unumber > 0)
            {
                if (Unumber % 2 == 0) {

                    array[licznik] = 0;
                }
                else
                {
                    array[licznik] = 1;
                }
                Unumber = Math.floorDiv(Unumber, 2);
                licznik += 1;
            }

            array[licznik] = 1;

            System.out.print(array[licznik]);
            System.out.print(".");

            for( int i = licznik; i > 0; i--)
            {
                System.out.print(array[i - 1]);
            }
        }
        else
        {
            while (Unumber > 0) {
                if (Unumber % 2 == 0)
                {
                    array[licznik] = 0;
                }
                else
                {
                    array[licznik] = 1;
                }
                Unumber = Math.floorDiv(Unumber, 2);
                licznik += 1;
            }

            array[licznik] = 0;

            System.out.print(array[licznik]);
            System.out.print(".");

            for( int i = licznik; i > 0; i--)
            {
                System.out.print(array[i - 1]);
            }
        }
    }

    public static boolean wzg(int a, int b)
    {
        if (a == 0)
        {
            return b == 1;
        }
        else
        {
            return wzg(b % a, a);
        }
    }

    public static void zadanie4() {
        int tablex;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbe calkowita z zakresu 1 - 9: "); //10 psuje formatowanie
            tablex = in.nextInt();
        } while(tablex <= 0 || tablex > 9);

        int[][] matrix = new int[tablex][tablex];

        String divider = "\n";

        System.out.print(" ");
        for(int i = 0; i < tablex + 1; i++)
        {
            System.out.print(i + " | ");
            divider += "---|";
        }

        System.out.print(divider + "\n ");

        for (int i = 0; i < tablex; i++)
        {
            System.out.print(i + 1 + " | ");

            for (int j = 0; j < tablex; j++)
            {
                if(wzg(i + 1, j + 1))
                {
                    System.out.print("+ | ");
                }
                else
                {
                    System.out.print(". | ");
                }

            }
            System.out.print(divider + "\n ");
        }
    }

    public static void zadanie5() {

        int ilosc = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj wpis: ");
        String wpis = in.nextLine();

        char ostatnia = wpis.charAt(wpis.length() - 1);

        for (int i = 0; i < wpis.length(); i++)
        {
            if(wpis.charAt(i) == ostatnia)
            {
                ilosc++;
            }
        }

        System.out.print("ilosc: " + ilosc);
    }

    public static void zadanie6() {

        int suma = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj wpis: ");
        String wpis = in.nextLine();
        String temp = "0";

        for (int i = 0; i < wpis.length(); i++)
        {
            char current = wpis.charAt(i);
            if(Character.isDigit(current) )
            {
                temp = "0";
                temp += current;
                suma += Integer.parseInt(temp);
            }
            else
            {
                temp = "0";
                suma += Integer.parseInt(temp);

            }
        }

        System.out.print("suma: " + suma);

    }

    public static void zadanie7() {

        String output = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj wpis: ");
        String wpis = in.nextLine();

        in = new Scanner(System.in);
        System.out.println("Podaj przeniesienie: ");
        int adj = in.nextInt();

        for (int i = 0; i < wpis.length(); i++) {
            char current = ' ';

            if(!Character.isSpaceChar(wpis.charAt(i)))
            {
                current = wpis.charAt(i);

                current += adj;

                if (current > 122)
                {
                    current -= 26;
                }
                else if (current < 97)
                {
                    current += 26;
                }

            }

            output += current;
        }

        System.out.print(output);
    }
}