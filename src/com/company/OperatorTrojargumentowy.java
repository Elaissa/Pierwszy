package com.company;

/**
 * Created by Developer on 2016-12-27.
 */
public class OperatorTrojargumentowy {

    public static void main(String[] args) {

        int a = 3;
        int b = 1;

        int c = (a > b) ? 10 : 0;

     System.out.println((a > b) ? "Tak" : "Nie");

        System.out.println((jestWiekszeOd(a, b)) ? pomnozPrzez100(a): pomnozPrzez100(b));
    }

    public static int pomnozPrzez100 ( int wartosc){

        return wartosc * 100;
    }

    public static boolean jestWiekszeOd( int a, int b){

        return a > b;
    }
}
