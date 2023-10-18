
package day9;

import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {
        int a,b,hasil;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input angka-1 : ");
        a = sc.nextInt();
        System.out.print("Input angka-2 : ");
        b = sc.nextInt();
        
        //Penjumlahan
        hasil = a+b;
        System.out.println("Hasil : "+hasil);
        
        System.out.print("Input angka-1 : ");
        a = sc.nextInt();
        System.out.print("Input angka-2 : ");
        b = sc.nextInt();
        
        //Pengurangan
        hasil = a-b;
        System.out.println("Hasil : "+hasil);
        
        System.out.print("Input angka-1 : ");
        a = sc.nextInt();
        System.out.print("Input angka-2 : ");
        b = sc.nextInt();
        
        //Perkalian
        hasil = a*b;
        System.out.println("Hasil : "+hasil);
        
        System.out.print("Input angka-1 : ");
        a = sc.nextInt();
        System.out.print("Input angka-2 : ");
        b = sc.nextInt();
        
        //Pembagian
        hasil = a/b;
        System.out.println("Hasil : "+hasil );
        
        System.out.print("Input angka-1 : ");
        a = sc.nextInt();
        System.out.print("Input angka-2 : ");
        b = sc.nextInt();
    
            
        //Sisa bagi
        hasil = a%b;
        System.out.println("Hasil : "+hasil);
         
    }
    
}
