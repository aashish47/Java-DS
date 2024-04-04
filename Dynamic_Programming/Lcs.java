package Dynamic_Programming;

public class Lcs {
    public static int lcs(String s1, String s2){

        int tab[][] = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 1; i < tab.length; i++){
            for(int j = 1; j < tab[i].length; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    tab[i][j] = tab[i - 1][j - 1] + 1;
                }
                else{
                    tab[i][j] = Math.max(tab[i - 1][j], tab[i][j - 1]);
                }
            }
        }
        return tab[tab.length - 1][tab[0].length - 1];

    }
}
