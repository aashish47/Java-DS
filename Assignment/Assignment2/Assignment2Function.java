package CodingNinjas.Assignment2;

import java.util.Scanner;

/**
 * Created by Hp on 6/13/2017.
 */
public class Assignment2Function {
    public static void main(String[] args) {
       ques1();
       ques2();
       ques3();
       ques4();
       ques5();
       ques6();
       ques7();
    }

    public static void ques1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name");
        String name = s.nextLine();
        int marks1, marks2, marks3, average;
        System.out.println("Enter marks obtained in tests");
        marks1 = s.nextInt();
        marks2 = s.nextInt();
        marks3 = s.nextInt();
        if (marks1 < marks2 && marks1 < marks3) {
            average = (marks2 + marks3) / 2;
        } else if (marks2 < marks1 && marks2 < marks3) {
            average = (marks1 + marks3) / 2;
        } else {
            average = (marks1 + marks2) / 2;
        }
        System.out.println("Name :" + name);
        System.out.println("Average : " + average);


    }
    public static void ques2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = s.next().charAt(0);
        if(character >='A'&& character <= 'Z')
            System.out.println("Uppercase character");
        else if (character>='a'&&character<='z')
            System.out.println("Lowercase character" );
        else
            System.out.println("Invalid character");

    }
    public static void ques3() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter basic salary");
        int basic = s.nextInt();
        System.out.println("Enter grade");
        char grade = s.next().charAt(0);
        int allow=0;
        if(grade=='A'||grade=='a')
            allow=1700;
        if(grade=='B'||grade=='b')
            allow=1500;
        if(grade=='C'||grade=='c')
            allow=1200;
        System.out.println("Total salary is " + (basic + allow + (0.2*basic)+(.5*basic)-(1.1*basic)));


    }
    public static void ques4() {
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
    public static void ques5() {
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
    public static void ques6() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x ");
        int x = s.nextInt();
        System.out.println("Enter value of n");
        int n = s.nextInt();
        System.out.println("X^n :");
        int i = 0;
        int ans=1;
        if (n > 1) {
            while (i < n) {
                ans*=x;
                i++;
            }
        }
        System.out.println(ans);
    }
    public static void ques7() {
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
