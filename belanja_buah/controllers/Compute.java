package controllers;

import datas.Buah;

public class Compute {
    public static double bayar(double harga, int jumlahBeli) {
        double payment = harga * jumlahBeli;
        double diskon = 0;

        if (payment >= 500000) {
            diskon = 0.05;
        } 
        
        if (payment >= 300000) {
            diskon = 0.02;
        }

        return payment - (payment * diskon);
    }

    public static void displayMenu(Buah buah){
        System.out.print("Kode buah : " + buah.getKode());
        System.out.print(" | Nama buah : " + buah.getNamaBuah());
        System.out.println(" | Harga buah : " + buah.getNamaBuah());

    }

    public static void display(String kode, String nama, double harga, int jumlah, double total) {
        double totalHarga = harga * jumlah;
        double diskon = (totalHarga >= 500000) ? 0.05 : (totalHarga >= 300000) ? 0.02 : 0;
        double jumlahDiskon = totalHarga * diskon;

        System.out.println("\nToko Buah \"Segar\"");
        System.out.println("===================");
        System.out.println("Kode Buah      : " + kode);
        System.out.println("Nama Buah      : " + nama);
        System.out.println("Harga/Kg       : Rp" + harga);
        System.out.println("Jumlah Beli    : " + jumlah + " Kg");
        System.out.println("Total Harga    : Rp" + totalHarga);
        System.out.println("Diskon         : " + (diskon * 100) + "% (Rp" + jumlahDiskon + ")");
        System.out.println("===================");
        System.out.println("Total Bayar    : Rp" + total);
    }
}
