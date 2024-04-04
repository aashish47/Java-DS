package CodingNinjas.Assignment2;

import java.util.Scanner;
public class Assignment2A_2 {
    public static void main(String[] args) {
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
}
