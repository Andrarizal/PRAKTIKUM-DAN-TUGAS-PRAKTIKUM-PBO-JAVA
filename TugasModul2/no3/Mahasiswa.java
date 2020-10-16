package com.AndraR.TugasModul2.no3;

public class Mahasiswa {
    public String nama;
    public String status;
    public int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus() {
        System.out.println("Status Mahasiswa\t: " + status);
    }
}
