package Dynamic_Programming;

public class StairCase {
    public static long staircase(int n){
        long dp[] = new long[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 3 && (i - j) >= 0; ++j){
                dp[i] += dp[i - j];
            }

        }
        return dp[n];
    }
}
