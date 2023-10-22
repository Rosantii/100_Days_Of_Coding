
package day9;

public class Day13 {
    public static void main(String[] args) {
        
        //Operator logika
        
        boolean saya = false;
        boolean aku = true;
        boolean kami;
        
        //konjungsi (dan)
        kami = saya && aku;
        System.out.println("true && false = "+kami);
        
        //disjungsi (atau)
        kami = saya || aku;
        System.out.println("true || false = "+kami);
        
        //negasi (bukan)
        System.out.println("Negasi, !true = "+!aku);
    }
    
}
