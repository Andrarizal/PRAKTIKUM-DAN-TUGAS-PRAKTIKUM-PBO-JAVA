package com.AndraR.TugasModul2.no1;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String nama;
        int tahunBerdiri;
        String stadion;
        int juaraUcl;
        String deskripsi;
        String name;
        //int repeat = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            if (repeat == 5) {
                break;
            }

            System.out.print("Input\t: ");
            name = scan.next();

            System.out.println("Name\t= " + name);

            repeat = repeat + 1;
        }

        System.out.println("Masukan Nama Team\t: " );*/

        Club Bali = new Club();
        Club Arema = new Club("Arema");
        Club Persija = new Club("Persija", "Pemenang di segala situasi");
        Club Madura = new Club("Madura", 1978, "Muara Namu");
        Club Barcelona = new Club("Barcelona", 1965, "Camp Nou", 18, "Mes Que Un Club");

        Bali.getTeam();
        System.out.println();

        Arema.getTeam();
        System.out.println();

        Persija.getTeam();
        System.out.println();

        Madura.getTeam();
        System.out.println();

        Barcelona.getTeam();
        System.out.println();

    }
}
