package CodingNinjas.Assignment2;

import java.util.Scanner;
public class Assignment2A_3 {
    public static void main(String[] args) {
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
}
