package com.AndraR.TugasMod1.no3;

import java.util.Scanner;

public class Main {

    private static void karyawan1() {
        System.out.println("Nama Karyawan\t\t: Andra Aulia Rizaldy");
        System.out.println("ID Karyawan\t\t\t: 19104062");
        System.out.println("Jabatan Karyawan\t: Backend Developer");
    }

    private static void karyawan2() {
        System.out.println("Nama Karyawan\t\t: Melo Da Rocha");
        System.out.println("ID Karyawan\t\t\t: 19101090");
        System.out.println("Jabatan Karyawan\t: Frontend Developer");
    }

    private static void karyawan3() {
        System.out.println("Nama Karyawan\t\t: Park Ji Sung");
        System.out.println("ID Karyawan\t\t\t: 19102087");
        System.out.println("Jabatan Karyawan\t: Backend Developer");
    }

    private static int JumlahKaryawan() {
        /*
        int jmlh = 3;
        return jmlj;
        */
        return 3;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Data Karyawan");
        System.out.println("====================================");

        System.out.println("Jumlah Karyawan\t: " + JumlahKaryawan());
        System.out.print("Pilih Karyawan\t: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                karyawan1();

                break;

            case 2:
                karyawan2();

                break;

            case 3:
                karyawan3();

                break;
        }
    }
}
