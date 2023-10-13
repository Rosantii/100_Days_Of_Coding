
package day4;

import java.util.LinkedList;
import java.util.Queue;

public class Day4 {

    public static void main(String[] args) {
       Queue<String> antrianBank = new LinkedList<>();
       
       antrianBank.add("ros");
       antrianBank.add("nisa");
       antrianBank.add("ayu");
       
        System.out.println("Daftar antrian yang sedang menunggu : "+antrianBank);
        
       String antrian1 = antrianBank.poll();
        System.out.println(antrian1+ "Sedang dilayani.");
        
        System.out.println("Sisa antrian : "+antrianBank);
       
       
       
      
       
       
          
       
       
     
       
       

    }
    
}
