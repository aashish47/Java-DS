package Dynamic_Programming;

public class WaysToCoinChange {
    public static int countWaysToMakeChange(int denominations[], int value){

        int tab[][] = new int[denominations.length + 1][value + 1];
        for(int i = 0; i < tab.length; i++){
            tab[i][0] = 1;
        }
        for(int i = 1; i < tab.length; i++){
            for(int j = 1; j < tab[0].length; j++){
                if(j >= denominations[i - 1]){
                    tab[i][j] = tab[i - 1][j] + tab[i][j - denominations[i - 1]];
                }
                else{
                    tab[i][j] = tab[i - 1][j];
                }
            }
        }
        return tab[tab.length - 1][tab[0].length - 1];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        System.out.println(countWaysToMakeChange(coins, 10));
    }
}
