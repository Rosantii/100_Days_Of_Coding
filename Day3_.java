
package day3_;

import java.util.Scanner;

public class Day3_ {
    
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan data
        System.out.print("Masukkan nama Anda: ");

        // Membaca teks yang dimasukkan oleh pengguna
        String nama = sc.nextLine();

        // Meminta pengguna untuk memasukkan angka
        System.out.print("Masukkan usia Anda: ");

        // Membaca angka yang dimasukkan oleh pengguna
        int usia = sc.nextInt();
        
        // Menampilkan informasi yang dimasukkan oleh pengguna
        System.out.println("Halo, " + nama + "!");
        System.out.println("Usia Anda adalah " + usia + " tahun.");
     

        // Menutup objek Scanner
        sc.close();
    }
    
}
