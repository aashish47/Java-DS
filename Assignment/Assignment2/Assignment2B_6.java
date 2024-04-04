package CodingNinjas.Assignment2;
/**
 * Created by Hp on 6/13/2017.
 */

import java.util.Scanner;

public class Assignment2B_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int number = s.nextInt();
        int count = 0, numberCopy = number, reverseNum = number, digit, digitNext;
//        /**
//         * count no .of digits
//         */
//        while (number > 0) {
//            number = number / 10;
//            count++;
//        }
//        count--;
//        /**
//         * reverse number
//         */
//        while (numberCopy > 0) {
//            reverseNum += (int) ((numberCopy % 10) * (Math.pow(10, count)));
//            numberCopy = numberCopy / 10;
//            count--;
//        }
//        //System.out.println(reverseNum);
//        /**
//         * checking begins
//         */
        digit = reverseNum % 10;
        reverseNum = reverseNum / 10;
        while (reverseNum > 0) {
            digitNext = reverseNum % 10;
            reverseNum = reverseNum / 10;
            if (digit < digitNext) {
                digit = digitNext;
                digitNext = reverseNum % 10;
                while (reverseNum > 0) {
                    if (digit > digitNext) {
                        System.out.println("No");
                        System.exit(0);
                    }
                    digit = digitNext;
                    reverseNum = reverseNum / 10;
                    digitNext = reverseNum % 10;
                }
            }
            if (reverseNum > 0) {
                digit = digitNext;
            }
        }
        System.out.println("yes");
    }
}
