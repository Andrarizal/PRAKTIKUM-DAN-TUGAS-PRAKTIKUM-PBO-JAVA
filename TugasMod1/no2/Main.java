package com.AndraR.TugasMod1.no2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        Scanner scan = new Scanner(System.in);
        String nama = "";
        int nim, lahir_tgl, lahir_bln, lahir_thn;
        //Pendaftaran regist = new Pendaftaran();

        System.out.println("================================");
        System.out.println("Pendaftaran Mahasiswa Baru = ");
        System.out.println("================================");

        try {
            System.out.print("Masukan Nama\t: ");
            nama = bfr.readLine();
        } catch (IOException log) {
            log.printStackTrace();
        }

        System.out.print("Masukan NIM\t: ");
        nim = scan.nextInt();

        System.out.println("Masukan Tanggal Lahir (Bentuk Angka) : ");
        /*regist.setTnggl();*/
        System.out.print("Tanggal (dd)\t: ");
        lahir_tgl = scan.nextInt();
        System.out.print("Bulan (mm)\t\t: ");
        lahir_bln = scan.nextInt();
        System.out.print("Tanggal (tttt)\t: ");
        lahir_thn = scan.nextInt();

        Pendaftaran registe = new Pendaftaran(nama, nim, lahir_tgl, lahir_bln, lahir_thn);
        System.out.println();

        System.out.println("Data Yang Dimasukan = ");
        System.out.println("Nama\t\t\t: " + registe.getNama());
        System.out.println("NIM\t\t\t\t: " + registe.getNim());
        System.out.println("Tanggal Lahir\t: " + registe.getLahir_tgl() + "/" + registe.getLahir_bln() + "/" + registe.getLahir_thn());
        //regist.getTnggl();

        System.out.println();
        System.out.println("Selamat, Anda Terdaftar !");
        System.out.println("================================");
    }
}
