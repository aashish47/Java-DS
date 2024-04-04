package CodingNinjas.Assignment1;

import java.util.Scanner;

/**
 * Created by Hp on 6/15/2017.
 */
public class FarenheitToCelsius {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si = s.nextInt();
        int e = s.nextInt();
        int w = s.nextInt();
        int c;
        for (int i = si; i <= e; i += w) {
            c = (int) ((5.0 / 9) * (i - 32));
            System.out.println(i + "   " + c);
        }
    }
}

