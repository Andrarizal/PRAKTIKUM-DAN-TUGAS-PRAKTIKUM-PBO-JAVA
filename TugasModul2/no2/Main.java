package com.AndraR.TugasModul2.no2;

public class Main {
    public static void main(String[] args) {
        Binatang superclas = new Binatang();

        System.out.println("Superclass = ");
        superclas.tidur("Pterosaurus");
        superclas.gerak("Pterosaurus");
        System.out.println();

        System.out.println("Subclass 1 =");
        Ikan subclas1 = new Ikan("Ikan");
        subclas1.getNama();
        subclas1.berenang();
        subclas1.tidur(subclas1.nama);
        subclas1.gerak(subclas1.nama);
        System.out.println();

        System.out.println("Subclass 2 =");
        Burung subclas2 = new Burung("Burung");
        subclas2.getNama();
        subclas2.terbang();
        subclas2.tidur(subclas2.nama);
        subclas2.gerak(subclas2.nama);
        System.out.println();

        System.out.println("Subclass 3 =");
        Kucing subclas = new Kucing("Kucing");
        subclas.getNama();
        subclas.meong();
        subclas.tidur(subclas.nama);
        subclas.gerak(subclas.nama);

    }
}
