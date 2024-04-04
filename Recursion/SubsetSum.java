package Recursion;

/**
 * Created by Hp on 7/1/2017.
 */
public class SubsetSum {
    public static int[][] subsetsSumK(int input[], int k) {
        int subsets[][]=sets(input, 0);
        int tempOutput[][] = new int[subsets.length-1][];
        int sum=0,z=0,j=0;
        for (int i=1;i<subsets.length;i++){
            sum=0;
            for(j=0;j<subsets[i].length-1;j++){
                sum+=subsets[i][j];
            }
            if(sum==k){
                    tempOutput[z]=new int[subsets[i].length-1];
                    for(int w=0;w<tempOutput[z].length;w++){
                        tempOutput[z][w]=subsets[i][w];
                    }
                    z++;
            }
        }
        int output[][] = new int[z][];
        for(int i=0;i<output.length;i++){
            output[i] = new int[tempOutput[i].length];
            for ( j =0;j<output[i].length;j++){
                output[i][j] = tempOutput[i][j];
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
        int input[]={2,3,1,4,2};
        int output[][]=subsetsSumK(input,5);
        for (int i=0;i<output.length;i++){
            for(int j=0;j<output[i].length;j++){
                System.out.print(output[i][j]);
            }
            System.out.print("\n");
        }
    }
}
