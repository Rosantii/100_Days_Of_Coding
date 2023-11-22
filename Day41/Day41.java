package day9;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("masukkan angka : ");
        int angka=sc.nextInt();
        
        if (angka%2==0) {
            System.out.println("angka positif :"+angka);   
        }else if (angka%2==1) {
            System.out.println("angka negatif: "+angka*-1);
            
        }
        }
        
    }

    

