package com.AndraR.TugasMod1.no2;

//import java.util.Scanner;

public class Pendaftaran {
    String nama;
    //String[] tnggl = new String[3];
    private int lahir_tgl;
    private int lahir_bln;
    private int lahir_thn;
    int nim;

    //public Pendaftaran() {}

    /*public Pendaftaran(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }*/

    public Pendaftaran(String nama, int nim, int lahir_tgl, int lahir_bln, int lahir_thn) {
        this.nama = nama;
        this.lahir_tgl = lahir_tgl;
        this.lahir_bln = lahir_bln;
        this.lahir_thn = lahir_thn;
        this.nim = nim;
    }

    public int getLahir_tgl() {
        return lahir_tgl;
    }

    public int getLahir_bln() {
        return lahir_bln;
    }

    public int getLahir_thn() {
        return lahir_thn;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    /*void setTnggl() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print("Tanggal (dd)\t: ");
                tnggl[i] = scan.next();
            } else if (i == 1) {
                System.out.print("Bulan (mm)\t: ");
                tnggl[i] = scan.next();
            } else {
                System.out.print("Tahun (tttt)\t: ");
                tnggl[i] = scan.next();
            }

        }
    }*/

    /*void getTnggl() {
        System.out.print("Tanggal : ");
        for (int k = 0; k < 3; k++) {
            System.out.print(tnggl[k]);

            if (k < 2) {
                System.out.print("/");
            }
        }
        System.out.println();
        System.out.println();
    }*/
}
