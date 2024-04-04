package Dynamic_Programming;

public class CoinsNeeded {
    public static int coinsNeeded(int n, int[] coins, int amount){
        int[] dp = new int[amount + 1];

        for(int i = 0; i < dp.length; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < n && coins[j] <= i; j++){
                dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int coins[] = {1,2,5,10};
        System.out.println(coinsNeeded(4, coins, 39));
    }
}
