package day9;
import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
       int angka;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        angka=sc.nextInt();
        
        if (angka % 2 == 0) {
            int hasil = angka + 5;
            System.out.println("angka positif hasil di tambah lima:" +hasil);
        }else{
            int hasil= angka * 3; 
            System.out.println("angka negatif hasil dikali tiga: " +hasil);
        }
    
    }
}
    

