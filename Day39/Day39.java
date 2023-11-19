package day9;
import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nd ;
        String nb ;
        double tb ;
        double bb ;
        char ub ;
        boolean sp ;
        String al;
        
        System.out.print("Nama depan :");
        nd = sc.nextLine();
        System.out.print("Nama belakang :");
        nb = sc.nextLine();
        System.out.print("Tinggi badan :");
        tb = sc.nextDouble();
        System.out.print("Berat badan :");
        bb = sc.nextDouble();
        sc.nextLine();
        System.out.print("Alamat :");
        al = sc.nextLine(); 
        System.out.print("Ukuran baju :");
        ub = sc.next().charAt(0);
        System.out.print("Status pernikahan :");
        sp = sc.nextBoolean();
        
        
       
    }
    
}
