package day9;
import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
        
        int pilihan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan pilihan :");
        pilihan=sc.nextInt();
        
        switch (pilihan){
            case 1:
                System.out.println("Anda memilih opsi 1");
                break;
            case 2:
                System.out.println("Anda memilih opsi 2");
                break;
            case 3:
                System.out.println("Anda memilih opsi 3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
