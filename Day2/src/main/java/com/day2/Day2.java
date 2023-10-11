
package com.day2;

public class Day2 {

    public static void main(String[] args) {
        
      // Tipe Data Byte: Digunakan untuk menghemat memori saat kita tahu nilai akan berada dalam rentang -128 hingga 127.
      byte umur = 25;
   
      // Tipe Data Int: Digunakan untuk merepresentasikan bilangan bulat dalam rentang yang lebih besar.
      int jumlahPenduduk = 1000000;
        
        
      // Tipe Data Short: Digunakan untuk merepresentasikan data yang membutuhkan lebih dari 8-bit, tetapi lebih kecil dari 32-bit.
      short jarakTempuh = 1500;
        
         System.out.println("Umur: " + umur);
         System.out.println("Jumlah Penduduk: " + jumlahPenduduk);
         System.out.println("Jarak Tempuh: " + jarakTempuh + " meter");
    }
}
