package CodingNinjas.Assignment2; /**
 * Created by Hp on 6/11/2017.
 */

import java.util.Scanner;

public class Assignment2A_1 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter name");
//        String name = s.nextLine();
//        int marks1, marks2, marks3, average;
//        System.out.println("Enter marks obtained in tests");
//        marks1 = s.nextInt();
//        marks2 = s.nextInt();
//        marks3 = s.nextInt();
//        if (marks1 < marks2 && marks1 < marks3) {
//            average = (marks2 + marks3) / 2;
//        } else if (marks2 < marks1 && marks2 < marks3) {
//            average = (marks1 + marks3) / 2;
//        } else {
//            average = (marks1 + marks2) / 2;
//        }
//        System.out.println("Name :" + name);
//        System.out.println("Average : " + average);
        Scanner s = new Scanner(System.in);
        char name = s.next().charAt(0);
        int marks1, marks2, marks3, average;
        marks1 = s.nextInt();
        marks2 = s.nextInt();
        marks3 = s.nextInt();
        if (marks1 < marks2 && marks1 < marks3) {
            average = (marks2 + marks3) / 2;
        }
        else if (marks2 < marks1 && marks2 < marks3) {
            average = (marks1 + marks3) / 2;
        }
        else {
            average = (marks1 + marks2) / 2;
        }
        System.out.print(name + " " + average);


    }
}
