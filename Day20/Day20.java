
package day9;
import java.util.Scanner;
public class Day20 {
    public static void main(String[] args) {
        
        //membuat variabel dan scanner
        int belanja = 0;
        Scanner sc = new Scanner(System.in);
        
        //mengambil input
        System.out.print("Total belanja : Rp");
        belanja = sc.nextInt();
        
        //cek apakah dia belanja di atas 50000
        if (belanja > 50000) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }
        System.out.println("Terima kasih...");
    }
}
