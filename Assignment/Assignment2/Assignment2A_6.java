package CodingNinjas.Assignment2; /**
 * Created by Hp on 6/12/2017.
 */
import  java.util.Scanner;
public class Assignment2A_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x ");
        int x = s.nextInt();
        System.out.println("Enter value of n");
        int n = s.nextInt();
        System.out.println("X^n :");
        int i = 0;
        int ans=1;
        if (n > 0) {
            while (i < n) {
                ans*=x;
                i++;
            }
        }
        System.out.println(ans);
    }
}