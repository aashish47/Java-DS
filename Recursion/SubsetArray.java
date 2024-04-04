//package Recursion;
//public class SubsetArray {
//    public static int[][] subsets(int input[]) {
//        char integerString[] = new char[input.length];
//        for(int i =0;i<input.length;i++){
//            integerString[i] = (char)(input[i] + '0');
//        }
//        char charAns[][]=sets(integerString, 0);
//        int output[][] = new int[charAns.length-1][];
//        for (int i=1,k=0;i<charAns.length;i++,k++){
//            output[k]=new int[charAns[i].length-1];
//            for(int j=0;j<charAns[i].length-1;j++){
//                output[k][j]=charAns[i][j]-'0';
//            }
//        }
//        return output;
//    }
//    public static char[][] sets(char input[],int index) {
//        if (index == input.length) {
//            char ans[][] = new char[1][1];
//            ans[0][0]=' ';
//            return ans;
//        }
//        char smallAns[][] = sets(input, index + 1);
//        char ans[][] = new char[smallAns.length*2][];
//        for (int i = 0; i < smallAns.length;i++){
//            ans[i]= new char[smallAns[i].length];
//            for (int j = 0; j < smallAns[i].length; j++) {
//                ans[i][j] = smallAns[i][j];
//            }
//        }
//        for (int i = 0; i < smallAns.length;i++){
//            ans[smallAns.length + i] = new char[smallAns[i].length + 1];
//            for (int j = 0; j <= smallAns[i].length; j++) {
//                if (j==0) {
//                    ans[i + smallAns.length][j] = input[index];
//                }
//                else{
//                    ans[i + smallAns.length][j] = smallAns[i][j-1];
//                }
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int input[] = {11};
//        int ans[][]=subsets(input);
//        for(int i=0;i<ans.length;i++){
//            for(int j=0;j<ans[i].length;j++){
//                System.out.print(ans[i][j]);
//            }
//            System.out.print("\n");
//        }
//    }
//}
package Recursion;
public class SubsetArray {
    public static int[][] subsets(int input[]) {
        int ans[][]=sets(input, 0);
//        for(int i=0;i<ans.length;i++){
//            for (int j=0;j<ans[i].length;j++){
//                System.out.print(ans[i][j]);
//            }
//            System.out.print("\n");
//        }
        int output[][] = new int[ans.length-1][];
        for (int i=1,k=0;i<ans.length;i++,k++){
            output[k]=new int[ans[i].length-1];
            for(int j=0;j<ans[i].length-1;j++){
                output[k][j]=ans[i][j];
            }
        }
        return output;
    }
    public static int[][] sets(int input[],int index) {
        if (index == input.length) {
            int ans[][] = new int[1][1];
            ans[0][0]=-1;
            return ans;
        }
        int smallAns[][] = sets(input, index + 1);
        int ans[][] = new int[smallAns.length*2][];
        for (int i = 0; i < smallAns.length;i++){
            ans[i]= new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++) {
                ans[i][j] = smallAns[i][j];
            }
        }
        for (int i = 0; i < smallAns.length;i++){
            ans[smallAns.length + i] = new int[smallAns[i].length + 1];
            for (int j = 0; j <= smallAns[i].length; j++) {
                if (j==0) {
                    ans[i + smallAns.length][j] = input[index];
                }
                else{
                    ans[i + smallAns.length][j] = smallAns[i][j-1];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int input[] = {1,2,3};
        int ans[][]=subsets(input);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.print("\n");
        }
    }
}
