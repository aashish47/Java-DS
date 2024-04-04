package Recursion;

import java.util.Scanner;

/**
 * Created by Hp on 6/23/2017.
 */
public class KeypadCombinations {
    public static String[] combinations(int num) {
        if (num == 0) {
            String result[] = {""};
            return result;
        }
        String smallResult[] = combinations(num / 10);
        String keys = keyLetters(num % 10);
        if (keys.length() == 0) {
            return smallResult;
        }
        String result[] = new String[smallResult.length * keys.length()];
        int k = 0;
        for (int i = 0; i < keys.length(); i++) {
            for (int j = 0; j < smallResult.length; j++) {
                result[k++] = smallResult[j] + keys.charAt(i);
            }
        }
        return result;
    }

    public static String keyLetters(int num) {
        String letters[] = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "xyz"};
        return letters[num];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String result[] = combinations(num);
        for (String i : result) {
            System.out.println(i);
        }
    }
}
