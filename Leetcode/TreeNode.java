package Leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode createTree(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        TreeNode node = new TreeNode(data);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            data = s.nextInt();
            if(data == -1){
                curr.left = null;
            }
            else{
                curr.left = new TreeNode(data);
                queue.add(curr.left);
            }
            data = s.nextInt();
            if(data == -1){
                curr.right = null;
            }
            else{
                curr.right = new TreeNode(data);
                queue.add(curr.right);
            }
        }
        return node;
    }
}
