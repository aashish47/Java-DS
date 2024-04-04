package DataStructure;
import  java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class BinaryTree {
    public static Scanner s = new Scanner(System.in);

    public static BinaryTreeNode<Integer> prepareBinaryTree() {
        System.out.println("Enter data");
        int data = s.nextInt();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        System.out.println("Enter left child of " + data);
        root.left = prepareBinaryTree();
        System.out.println("Enter right child of " + data);
        root.right = prepareBinaryTree();
        return root;
    }

    public static BinaryTreeNode<Integer> prepareBinaryTreeUsingQueue() {
        System.out.println("Enter data");
        int data = s.nextInt();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> currentNode = queue.remove();
            System.out.println("Enter left data of" + currentNode.data);
            int leftData = s.nextInt();
            if(leftData != -1) {
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftData);
                queue.add(leftNode);
                currentNode.left = leftNode;
            }
            System.out.println("Enter right data of" + currentNode.data);
            int rightData = s.nextInt();
            if(rightData!=-1) {
                BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightData);
                queue.add(rightNode);
                currentNode.right = rightNode;
            }
        }
        return root;
    }

    public static <T> void printBinaryTree(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printBinaryTree(root.left);
        printBinaryTree(root.right);

    }

    public static <T> void printBinaryTreeUsingQueue(BinaryTreeNode<T> root) {
        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            BinaryTreeNode<T> currentNode = queue.remove();
            if (currentNode == null && queue.isEmpty()) {
                return;
            } else if (currentNode == null) {
                System.out.println();
                queue.add(null);
            } else {
                System.out.print(currentNode.data + " ");
                if(currentNode.left!=null){
                queue.add(currentNode.left);
                }
                if(currentNode.right!=null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }
    static int sum =0;
    public static int sum(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        sum = root.data + sum(root.left) +  sum(root.right) ;
        return sum;
    }
    static BinaryTreeNode<Integer> maxNode = new BinaryTreeNode<>(Integer.MIN_VALUE);
    public static BinaryTreeNode<Integer> maxDataNode(BinaryTreeNode<Integer> root){
        if(root ==null){
            return  null;
        }
        if(root.data.compareTo(maxNode.data)>0){
            maxNode = root;
        }
        maxDataNode(root.left);
        maxDataNode(root.right);
        return maxNode;
    }
    static int leafNodesCount = 0;
    public static int noOfLeafNodes(BinaryTreeNode<Integer> root){
        if(root.left==null&&root.right==null){
            leafNodesCount++;
            return leafNodesCount;
        }
        noOfLeafNodes(root.left);
        noOfLeafNodes(root.right);
        return leafNodesCount;
    }
    static int numOfnodesGreaterThanX =0;
    public static int numNodesGreaterX(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return 0;
        }
        numNodesGreaterX(root.left,x);
        numNodesGreaterX(root.right,x);
        if(root.data>x){
            numOfnodesGreaterThanX++;
        }
        return numOfnodesGreaterThanX;

    }
    public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
        if(root == null){
            return false;
        }
        if(root.data.compareTo(x)==0){
            return true;
        }

        boolean ans = isNodePresent(root.left,x);
        if(ans){
            return ans;
        }
        ans = isNodePresent(root.right,x);
        if(ans){
            return ans;
        }
        return ans;
    }
    public static void mirror(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> temp;
        temp = root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
    public static <T> DiameterObject diameterBetter(BinaryTreeNode<T> root) {
        if (root == null) {
            return new DiameterObject(0, 0);
        }
        DiameterObject leftDiameter = diameterBetter(root.left);
        DiameterObject rightDiameter = diameterBetter(root.right);
        int x = leftDiameter.height + rightDiameter.height + 1;

        int currentDiameter = Math.max(
                Math.max(leftDiameter.diameter, rightDiameter.diameter), x);
        int currentHeight = Math.max(leftDiameter.height, rightDiameter.height) + 1;
        DiameterObject ans = new DiameterObject(currentDiameter, currentHeight);
        return ans;
    }
//    <T> int diameter(BinaryTreeNode<T> root) {
//        if (root == null) {
//            return 0;
//        }
//        int leftDiameter = diameter(root.left);
//        int rightDiameter = diameter(root.right);
//        int x = height(root.left) + height(root.right) + 1;
//
//        return Math.max(Math.max(leftDiameter, rightDiameter), x);
//    }

    public static <T>int heightOfBinaryTree(BinaryTreeNode<T> root){
        if(root == null){
            return 0;
        }
        int height = Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right)) + 1;
        return height;
    }
    public static boolean checkBalanced(BinaryTreeNode<Integer> root){

        if(root ==null){
            return true;
        }
        if(Math.abs((heightOfBinaryTree(root.left) - heightOfBinaryTree(root.right)))<=1 && checkBalanced(root.left) && checkBalanced(root.right) ){
            return true;
        }
        return false;
    }
    public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        ArrayList<Node<BinaryTreeNode<Integer>>> list = new ArrayList<>();
        Node<BinaryTreeNode<Integer>> head,temp=null ;
        int flag = 0;    //First element of linkedList
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> currentNode = queue.remove();
            if (currentNode == null && queue.isEmpty()) {
                return list;
            } else if (currentNode == null) {
                queue.add(null);
                flag = 0;
            } else {
                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null) {
                    queue.add(currentNode.right);
                }
                Node<BinaryTreeNode<Integer>> newNode = new Node<>(currentNode);
                if(flag ==0){
                    flag = 1;
                    head = newNode;
                    temp=head;
                    list.add(head);
                }
                else{
                    temp.next = newNode;
                    temp = newNode;
                }
            }
        }
        return list;
    }
    public static void printNode(Node<BinaryTreeNode<Integer>> head ){
        if(head ==null){
            System.out.println();
            return;
        }
        System.out.print(head.data.data + " ");
        printNode(head.next);
    }
    public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
        if(root ==null){
            return null;
        }
        if(root.left == null && root.right==null){
            root=null;
        }
        if(root!=null) {
            root.left = removeAllLeaves(root.left);
            root.right = removeAllLeaves(root.right);
        }
        return root;
    }
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        if(root ==null){
            return;
        }
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data + " ");
        }
        if(root.left!=null && root.right==null){
            System.out.print(root.left.data + " ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }

    static int preIndex =0;
    public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in){
        return constructTreeUsingPreIno(pre,in,0,pre.length-1);
    }
    public static  BinaryTreeNode<Integer> constructTreeUsingPreIno(int[] pre, int[] in,
                                                     int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }
        int data = pre[preIndex++];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        if(startIndex==endIndex){
            return root;
        }

        int index = search(data, in,startIndex,endIndex);
        root.left = constructTreeUsingPreIno(pre, in, startIndex, index - 1);
        root.right = constructTreeUsingPreIno(pre, in, index + 1, endIndex);
        return root;
    }

    public static int search(int data,int[]in,int starIndex ,int endIndex){
        for(int i = starIndex;i<=endIndex;i++){
            if(in[i]==data){
                return i;
            }
        }
        return -1;
    }
    public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post, int[] in){
        Index postIndex = new Index();
        postIndex.index=post.length-1;
        return constructTreeUsingPostIno(post,in,0,post.length-1,postIndex);
    }
    public static  BinaryTreeNode<Integer> constructTreeUsingPostIno(int[] post, int[] in,
                                                                    int startIndex, int endIndex,Index postIndex) {
        if (startIndex > endIndex) {
            return null;
        }
        int data = post[postIndex.index];
        postIndex.index--;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        if(startIndex==endIndex){
            return root;
        }
        int index = search(data, in,startIndex,endIndex);

        root.right = constructTreeUsingPostIno(post, in, index + 1, endIndex,postIndex);
        root.left = constructTreeUsingPostIno(post, in, startIndex, index - 1,postIndex);

        return root;
    }
    public static void printZigZag(BinaryTreeNode<Integer> root) {
        ArrayList list = LLForEachLevel(root);
        for (int i = 0; i < list.size(); i++) {
            if ((i + 1) % 2 == 0) {
                printNode(DataStructure.LinkedList.reverseList((Node) (list.get(i))));
            } else {
                printNode((Node) (list.get(i)));
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = prepareBinaryTreeUsingQueue();
//        printBinaryTreeUsingQueue(root);
//        mirror(root);
        //printBinaryTreeUsingQueue(root);
        //System.out.println(noOfLeafNodes(root));
        //System.out.println(diameterBetter(root).diameter);
//        System.out.println(heightOfBinaryTree(root));
//        System.out.println(checkBalanced(root));
//        ;
//        for(Node<BinaryTreeNode<Integer>> node : LLForEachLevel(root)){
//            printNode(node);
//        }
//        printNodesWithoutSibling(root);
//        int[]pre = {1, 2, 3 ,4 ,15, 5, 6, 7, 8, 10, 9, 12};
//        int[]in={4, 8, 2, 5, 1, 6, 3, 7};
//        int[]post={8, 4, 5, 2, 6, 7, 3, 1};
//        printBinaryTreeUsingQueue(getTreeFromPostorderAndInorder(post,in));
        printZigZag(root);

    }
}

class Index{
    int index;
}
