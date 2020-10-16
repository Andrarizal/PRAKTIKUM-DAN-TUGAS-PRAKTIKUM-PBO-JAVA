package com.AndraR.Modul2.Polymorfisme;

public class DemoOverLoading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Merah Putih");
        Lagu lagu2 = new Lagu("guruku tersayang","Bison");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
