package CodingNinjas.Assignment2; /**
 * Created by Hp on 6/12/2017.
 */
import java.util.Scanner;
public class Assignment2A_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int number = s.nextInt();
        System.out.println("Reverse of the number ");
        while(number>=1){
            System.out.print(number%10);
            number=number/10;
        }

    }
}
