package CodingNinjas.Assignment3;

/**
 * Created by Hp on 6/14/2017.
 */
public class Ques8 {
    public static int sum(int carry, int sum[], int k, int n) {
        if (n > 9) {
            carry = 1;
        } else {
            carry = 0;
        }
        sum[k] = n % 10;
        return carry;
    }

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
        int length, n;
        if (arr1.length > arr2.length) {
            length = arr1.length + 1;
        } else {
            length = arr2.length + 1;
        }
        int sum[] = new int[length];
        int carry = 0;
        for (int i = arr1.length - 1, j = arr2.length - 1, k = length - 1; i >= 0 || j >= 0; i--, j--, k--) {
            if (i == -1) {
                while (j >= 0) {
                    n = arr2[j] % 10 + carry;
                    carry = sum(carry, sum, k, n);
                    k--;
                    j--;
                }
                sum[k] = carry;
                break;
            }
            if (j == -1) {
                while (i >= 0) {
                    n = arr1[i] % 10 + carry;
                    carry = sum(carry, sum, k, n);
                    k--;
                    i--;
                }
                sum[k] = carry;
                break;
            }
            n = (arr1[i] % 10 + arr2[j] % 10 + carry);
            carry = sum(carry, sum, k, n);
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr1[] = {};
        int arr2[]={};
        int sum[] = sumOfTwoArrays(arr1,arr2);
        for (int i : sum){
            System.out.println(i);
        }
    }
}
