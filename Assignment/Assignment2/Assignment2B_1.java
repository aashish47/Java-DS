package CodingNinjas.Assignment2; /**
 * Created by Hp on 6/13/2017.
 */
import java.util.Scanner;
public class Assignment2B_1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int sum=0,product=1,i=1;
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("Enter P for product or S for sum");
        char choice=s.next().charAt(0);
        if(choice=='s'){
            while(i<=num){
              sum+=i;
              i++;
            }
            System.out.println("sum " + sum);
        }
        if(choice=='p'){
            while(i<=num){
                product*=i;
                i++;

            }
            System.out.println("product "+product);
        }
    }
}
