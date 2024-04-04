package Arrays;

import java.util.Stack;

public class MaxSprod {
    public long[] firstGreater(int[] A, boolean prev){
        long[] X = new long[A.length];
        Stack<Integer> stack = new Stack<>();

        if(prev){
            for(int i = 0; i < A.length; i++){
                while(!stack.isEmpty() && A[stack.peek()] <= A[i]){
                    stack.pop();
                }
                X[i] = stack.isEmpty() ? 0 : stack.peek();
                stack.push(i);
            }
        }
        else{
            for(int i = A.length - 1; i >= 0; i--){
                while(!stack.isEmpty() && A[stack.peek()] <= A[i]){
                    stack.pop();
                }
                X[i] = stack.isEmpty() ? 0 : stack.peek();
                stack.push(i);
            }
        }

        return X;
    }

    public int maxSpecialProduct(int[] A) {
        long[] left = firstGreater(A, true);
        long[] right = firstGreater(A, false);
        long c = 1000000007;
        long max = -1;

        for(int i = 0; i < A.length; i++){
            max = Math.max(max, (1L * left[i] * right[i]));
        }
        return (int)(max % c);
    }
}
