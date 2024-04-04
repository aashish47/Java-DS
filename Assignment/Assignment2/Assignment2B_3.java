package CodingNinjas.Assignment2; /**
 * Created by Hp on 6/13/2017.
 */
import java.util.Scanner;
public class Assignment2B_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binary=s.nextInt();
        int decimal=0,i=0;
        while(binary>0){

            decimal+=(binary%10)*Math.pow(2,i);
            i++;
            binary=binary/10;
        }
        System.out.println("decimal " +" "+ decimal);

    }
}
