package CodingNinjas.Assignment2;

import java.util.Scanner;

public class Assignment2A_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter coefficient of equation");
        System.out.println("Enter a");
        double a = s.nextDouble();
        System.out.println("Enter b");
        double b = s.nextDouble();
        System.out.println("Enter c");
        double c = s.nextDouble();
        double d = b * b - (4 * a * c);
        if (d > 0) {
            System.out.println("Roots are real and distinct");

            System.out.println((((-b) + Math.sqrt(d)) / (2 * a)) + " " + ((-b) - Math.sqrt(d)) / (2 * a));
        }
        else if
                (d < 0) {
            System.out.println("Roots are imaginary");
            System.out.println((-b )/ (2 * a) + "+i" + Math.sqrt(-d) / (2 * a) + " " + (-b) / (2 * a) + "-i" + Math.sqrt(-d) / (2 * a));

        }
        else {
            System.out.println("Roots are equal and real");
            System.out.println(-b / (2 * a));
        }

    }
}
