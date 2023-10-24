
package day9;
import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        //membuat array nama-nama hewan
        String hewan[] = new String[4];
        
        //membuat scanner
        Scanner sc = new Scanner(System.in);
        
        //mengisi data ke array
        for (int i = 0; i < hewan.length; i++) {
            System.out.print("Hewan ke- "+i+ ":");
            hewan[i]=sc.nextLine();  
        }
        
        System.out.println("======================");
      
        //menampilkan semua isi array
        for (String a : hewan) {
            System.out.println(a);
            
        }
    }
}
