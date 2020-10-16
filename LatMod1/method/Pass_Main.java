package com.AndraR.LatMod1.method;

//class main
public class Pass_Main {
    public static void main(String[] args) {
        int no1, no2;

        //TestPass passed = new TestPass(50, 100);

        TestPass tespas;
        tespas = new TestPass(50, 100);
        no1 = 10;
        no2 = 20;

        System.out.println("Nilai sebelum passed by value = ");
        System.out.println("Nomer 1\t: " + no1);
        System.out.println("Nomer 2\t: " + no2);
        System.out.println();

        tespas.calculate(no1, no2);
        System.out.println("Nilai sesudah passed by value = ");
        System.out.println("Nomer 1\t: " + no1);
        System.out.println("Nomer 2\t: " + no2);
        System.out.println();

        System.out.println("Nilai sebelum passed by reference = ");
        System.out.println("Nomer 1\t: " + tespas.no1);
        System.out.println("Nomer 2\t: " + tespas.no2);
        System.out.println();

        tespas.calculate(tespas);
        System.out.println("Nilai sesudah passed by value = ");
        System.out.println("Nomer 1\t: " + tespas.no1);
        System.out.println("Nomer 2\t: " + tespas.no2);
        System.out.println();

    }
}
