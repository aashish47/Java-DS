package CodingNinjas.Assignment1;

import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int number = s.nextInt();
        int i = 2;
        boolean isPrime=true ;

        while (i <= number / 2) {
            if (number % i != 0) {
                isPrime = true;
            }
            else {
                isPrime = false;
            }
            i++;
        }
            if (isPrime) {
                System.out.print("number is prime");
            } else
                System.out.print("number is not prime");
        }
}
