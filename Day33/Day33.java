package day9;
import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
        //membuat objek scanner
        Scanner sc = new Scanner(System.in);
        
        //infinite Loop dimulai di sini
        while (true){
            //meminta pengguna untuk memasukkan perintah
            System.out.print("Masukkan perintah (ketik 'kelura' untuk keluar):");
            
            String perintah = sc.nextLine(); //membaca input pengguna
            
            //memeriksa apakah pengguna memasukkan "keluar"
            if (perintah.equalsIgnoreCase("keluar")){
                //menampilkan pesan dan keluar jika "keluar" dimasukkan
                System.out.println("Program berakhir.");
                break; //keluar dari loop
            }
            System.out.println("Menjalankan perintah:"+perintah);
            
        }

    }
}
