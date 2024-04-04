package CodingNinjas.Assignment5;
public class HighestCharacter {
    public static char highestOccuringCharacter(String inputString) {
        int input[]=new int[256];
        for(int i = 0;i<inputString.length();i++){
            input[inputString.charAt(i)]++;
        }
        int max=0;
        int index=0;
        for(int i=0;i<input.length;i++){
            if(input[i]>max){
                max=input[i];
                index=i;

            }
        }
        char n = (char)index;
        return n;
    }
    public static void main(String[] args) {
        char a;
        String inputString="bcd";
        a=highestOccuringCharacter(inputString);
        System.out.println(a);
    }
}
