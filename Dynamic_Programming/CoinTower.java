package Dynamic_Programming;

public class CoinTower {
    public  String solve(int n,int x,int y){

        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[x] = 1;
        dp[y] = 1;

        for(int i = 2; i <= n; i++){
            int a = dp[i - 1] ^ 1, b = -1, c = -1;
            if(i - x >= 0){
                b = dp[i - x] ^ 1;
            }
            if(i - y >= 0){
                c = dp[i - y] ^ 1;
            }
            dp[i] = Math.max(Math.max(a, b), c);
        }
        if(dp[n] == 1){
            return "Beerus";
        }
        else{
            return "Whis";
        }
    }
}
