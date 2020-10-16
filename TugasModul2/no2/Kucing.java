package com.AndraR.TugasModul2.no2;

public class Kucing extends Binatang{
    public String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + nama);
    }

    public void meong() {
        System.out.println("Binatang ini membuat suara 'Meong' ");
    }
}
