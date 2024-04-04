package CodingNinjas.Assignment2; /**
 * Created by Hp on 6/13/2017.
 */
import java.util.Scanner;
public class Assignment2B_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal=s.nextInt();
        int binary=0,base =1,rem;
//        int i=0;
//        int array[]=new int[100];
//        while(decimal>0){
//
//            array[i]=decimal%2;
//            i++;
//            decimal=decimal/2;
//        }
//        i=i-1;
//        while(i>=0){
//            System.out.print(array[i]);
//            i--;
//        }
        while(decimal>0){
            rem = decimal%2;
            binary=binary+rem*base;
            decimal=decimal/2;
            base=base*10;
        }
        System.out.print(binary);

    }
}
