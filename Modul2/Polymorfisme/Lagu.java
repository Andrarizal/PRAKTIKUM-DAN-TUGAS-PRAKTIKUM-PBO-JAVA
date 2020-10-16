package com.AndraR.Modul2.Polymorfisme;

public class Lagu {
    public String Judul;
    public String Pencipta;

    //Overloading
    public Lagu(String judul) {
        Judul = judul;
    }

    //Overloading
    public Lagu(String judul, String pencipta) {
        Judul = judul;
        Pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("Judul\t: " + Judul);
        System.out.println("Pencipta : " + Pencipta);
        System.out.println();
    }
}
