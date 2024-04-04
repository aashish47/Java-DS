package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class Staircases {
    public static int findWays(int n){
        // Write your code here
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return findWays(n-1) + findWays(n-2) + findWays(n-3);
    }

    public static void main(String[] args) {
        System.out.println(findWays(4));
    }
}
