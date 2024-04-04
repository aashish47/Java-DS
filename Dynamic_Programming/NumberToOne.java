package Dynamic_Programming;

public class NumberToOne {

    public static int countStepsTo1(int n){

         int dp[] = new int[n + 1];

         for(int i = 2; i <= n; i++){
             int x, count1 = Integer.MAX_VALUE, count2 = Integer.MAX_VALUE;
             x = dp[i - 1];
             if(i % 2 == 0){
                 count1 = dp[i / 2];
             }
             if(i % 3 == 0){
                 count2 = dp[i / 3];
             }
             dp[i] = Math.min(Math.min(x,count1), count2) + 1;
         }
         return dp[n];

    }
    public static void main(String[] args) {
        System.out.println(countStepsTo1(11100));
    }
}
