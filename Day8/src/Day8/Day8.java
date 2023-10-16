package Day8;
import java.util.Scanner;
public class Day8 {
    public static void main(String[] args) {
        
       //Deklarasi
       Double luas;
       int alas,tinggi;
       
       //membuat scanner baru
       Scanner r = new Scanner(System.in);
       
       //input
        System.out.print("Input alas :");
        alas = r.nextInt();
        System.out.print("Input tinggi :");
        tinggi = r.nextInt();
        
        //proses
        luas = Double.valueOf((alas*tinggi)/2);
        /*konversi tipe data
        variabel luas bertipe data Double,berarti nilai yang disimpan adalah Double.
        Sedangkan variabel alas dan tinggi  bertipe Integer.
        agar hasil operasi dapat disimpan dalam variabel bertipe double,maka perlu dikonversi
        */
        
        //output
        System.out.println("Luas ="+luas);
       
       
    }
    
}
