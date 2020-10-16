package com.AndraR.LatMod1.objek;

//tips : alt + insert

public class Mahasiswa {
    String nama;
    int nim;

    //constructor tanpa parameter
    public Mahasiswa() {}

    //constructor dengan parameter
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Getter nama
    public String getNama() {
        return nama;
    }

    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter and Setter nim
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
