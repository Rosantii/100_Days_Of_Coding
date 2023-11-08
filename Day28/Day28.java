package day9;
import java.util.Scanner;
public class Day28 {
    public static void main(String[] args) {
        int a;
        String b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inputkan nilai :");
        a=sc.nextInt();
        
        if (a >= 90) {
            b = "A";
        } else if (a >= 80){
            b = "B+";
        } else if (a >= 70){
            b = "B";
        } else if (a >= 60){
            b= "C";
        } else if (a >= 50){
            b = "D";
        } else {
            b = "E";
        }
        
        System.out.println("Grade :"+b);
    }
}
