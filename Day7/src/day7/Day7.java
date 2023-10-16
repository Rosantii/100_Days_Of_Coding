
package day7;

import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {
        
        String nama,alamat;
        int gaji,usia;
        
        Scanner r = new Scanner(System.in);
        
        System.out.println("##Pendataan Karyawan##");
        
        System.out.println("Nama Karyawan");
        nama = r.nextLine();
        
        System.out.println("Alamat");
        alamat = r.nextLine();
        
        System.out.println("Usia");
        usia = r.nextInt();
        
        System.out.println("Gaji");
        gaji = r.nextInt();
        
        System.out.println("-------------------");
        System.out.println("Nama :"+ nama);
        System.out.println("Alamat :"+alamat);
        System.out.println("Usia :"+usia);
        System.out.println("Gaji :"+gaji);
    
    }
    
}
