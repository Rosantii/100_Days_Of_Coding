
package day9;
import java.util.Scanner;
public class Day21 {
    public static void main(String[] args) {
        
        //membuat variabel dan scanner
        String nama;
        int nilai;
        Scanner sc=new Scanner(System.in);;
        
        //mengambil input
        System.out.print("Nama : ");
        nama=sc.nextLine();
        System.out.print("Nilai : ");
        nilai=sc.nextInt();
        
        //cek apakah dia lulus atau tidak
        if(nilai >= 70){
            System.out.println("Selamat "+nama+ ",anda lulus!");
        } else{
            System.out.println("Maaf "+nama+ ",anda gagal");
        
    }
    }
}
