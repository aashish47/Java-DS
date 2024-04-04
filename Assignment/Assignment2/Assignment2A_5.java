package CodingNinjas.Assignment2; /**
 * Created by Hp on 6/12/2017.
 */
import java.util.Scanner;
public class Assignment2A_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int sumEven=0,sumOdd=0,c;
        while(num>=1){
            c=num%10;
            if(c%2==0)
                 sumEven+=c;
            else
                sumOdd+=c;
            num=num/10;
        }
        System.out.println("Sum of odd numbers " + sumOdd + " \nSum of even numbers " + sumEven);

    }
}