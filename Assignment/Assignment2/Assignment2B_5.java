package CodingNinjas.Assignment2;

/**
 * Created by Hp on 6/13/2017.
 */
import java.util.Scanner;
public class Assignment2B_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int number = s.nextInt();
        System.out.println("Sqrt of integral part " + "" +  (int)(Math.sqrt(number)));
        System.out.println("Enter decimal places");
        int deci = s.nextInt();
        int intermediate = (int)(number*(Math.pow(10,deci)));
        double decimal = intermediate/Math.pow(10,deci);
        System.out.println(decimal);
        System.out.println("sqrt of number upto decimal palces "+ deci +" = " +  Math.sqrt(decimal));
    }
}
