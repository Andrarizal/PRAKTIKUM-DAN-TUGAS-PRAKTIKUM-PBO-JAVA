package com.AndraR.Modul2.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Masukkan Data Ke Superclass");
        superclass.X = 30;
        superclass.Y = 50;
        superclass.printXY();

        subclass.X = 30;
        subclass.Y = 40;
        subclass.Z = 10;
        subclass.printXY();
        subclass.sumValue();

    }
}
