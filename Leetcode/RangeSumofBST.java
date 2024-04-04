//        Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
//
//        The binary search tree is guaranteed to have unique values.
//
//
//
//        Example 1:
//
//        Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
//        Output: 32
//        Example 2:
//
//        Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
//        Output: 23
//
//
//        Note:
//
//        The number of nodes in the tree is at most 10000.
//        The final answer is guaranteed to be less than 2^31.
package Leetcode;

public class RangeSumofBST {
    public static int helper(TreeNode root, int L, int R, int sum) {
        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return helper(root.right, L, R, sum);
        } else if (root.val > R) {
            return helper(root.left, L, R, sum);
        } else {
            int leftsum = helper(root.left, L, R, sum);
            int rightsum = helper(root.right, L, R, sum);
            sum = leftsum + rightsum + root.val;
        }
        return sum;
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        return helper(root, L, R, 0);
    }

    public static void main(String[] args) {
        TreeNode tree = TreeNode.createTree();
        System.out.println(rangeSumBST(tree, 7, 15));
    }
}
