//package Recursion;
//public class SubsetArrayPrint {
//    public static void printSubsets(int input[]) {
//        char integerString[] = new char[input.length];
//        for(int i =0;i<input.length;i++){
//            integerString[i] = (char)(input[i] + '0');
//        }
//        char resultTillNow[]=new char[1];
//        resultTillNow[0] = ' ';
//       subset(integerString,resultTillNow,0);
//    }
//    public static void subset(char input[],char []resultTillNow,int index) {
//        if(index==input.length){
//            if(resultTillNow.length>1) {
//                for (int i = 1; i < resultTillNow.length; i++) {
//                    System.out.print((resultTillNow[i] - '0') + " ");
//                }
//                System.out.print("\n");
//            }
//            return;
//        }
//        subset(input,resultTillNow,index+1);
//        char[]arr=new char[resultTillNow.length+1];
//        for(int i=0;i<resultTillNow.length;i++){
//            arr[i]=resultTillNow[i];
//        }
//        arr[resultTillNow.length]=input[index];
//        subset(input,arr ,index+1);
//
//    }
//
//    public static void main(String[] args) {
//        int input[]={11};
//        printSubsets(input);
//    }
//}
package Recursion;
public class SubsetArrayPrint {
    public static void printSubsets(int input[]) {
        int resultTillNow[]=new int[1];
        resultTillNow[0] = -1;
        subset(input,resultTillNow,0);
    }
    public static void subset(int input[],int []resultTillNow,int index) {
        if(index==input.length){
            if(resultTillNow.length>1) {
                for (int i = 1; i < resultTillNow.length; i++) {
                    System.out.print(resultTillNow[i] + " ");
                }
                System.out.print("\n");
            }
            return;
        }
        subset(input,resultTillNow,index+1);
        int[]arr=new int[resultTillNow.length+1];
        for(int i=0;i<resultTillNow.length;i++){
            arr[i]=resultTillNow[i];
        }
        arr[resultTillNow.length]=input[index];
        subset(input,arr ,index+1);

    }

    public static void main(String[] args) {
        int input[]={1,2,3};
        printSubsets(input);
    }
}
