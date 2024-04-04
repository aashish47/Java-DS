package CodingNinjas.Complexity;
public class Polynomial {
    public static void main(String[] args) {
        int x = 3;
        int sum = 0;
        int pow=1;
        int coffecient []={1,2,3};
        for(int i =coffecient.length-1;i>=0;i--){
            sum += coffecient[i]*pow;
            pow=pow*x;
        }
        System.out.println(sum);
    }
}