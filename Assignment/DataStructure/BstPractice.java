package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BstPractice {
    static Scanner s = new Scanner(System.in);

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr) {
        return createBst(arr, 0, arr.length - 1);
    }

    public static BinaryTreeNode<Integer> createBst(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = createBst(arr, start, mid - 1);
        root.right = createBst(arr, mid + 1, end);
        return root;
    }

    static ArrayList<BinaryTreeNode<Integer>> list = new ArrayList<>();

    public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root) {
        linkedListNodes(root);
        LinkedListNode<Integer> head = null, temp = null;
        for (BinaryTreeNode<Integer> node : list) {
            LinkedListNode<Integer> linkedListNode = new LinkedListNode<>(node.data);
            if (head == null) {
                head = linkedListNode;
                temp = head;
            } else {
                temp.next = linkedListNode;
                temp = temp.next;
            }
        }
        return head;
    }

    public static void linkedListNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        linkedListNodes(root.left);
        list.add(root);
        linkedListNodes(root.right);
    }

    static ArrayList<Integer> listRange = new ArrayList<>();

    public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root, int k1, int k2) {
        listOfNode(root, k1, k2);
        for (Integer node : listRange) {
            System.out.println(node);
        }
    }

    public static void listOfNode(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null) {
            return;
        }

        listOfNode(root.left, k1, k2);
        if (root.data.compareTo(k1) >= 0 && root.data.compareTo(k2) <= 0) {
            listRange.add(root.data);
        }
        listOfNode(root.right, k1, k2);
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        return isBSTBottomUpBetter(root).isBST;
    }

    public static isBSTObject isBSTBottomUpBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new isBSTObject();
        }

        isBSTObject ans = new isBSTObject();
        isBSTObject leftAns = isBSTBottomUpBetter(root.left);
        if (!leftAns.isBST) {
            ans.isBST = false;
            return ans;
        }
        isBSTObject rightAns = isBSTBottomUpBetter(root.right);

        if (!rightAns.isBST) {
            ans.isBST = false;
            return ans;
        }

        if (!(root.data > leftAns.max) || !(root.data < rightAns.min)) {
            ans.isBST = false;
            return ans;
        }
        ans.min = Math.min(root.data, leftAns.min);
        ans.max = Math.max(root.data, rightAns.max);
        return ans;

    }

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(root.data);
        node.left = root.left;
        root.left = node;
        insertDuplicateNode(node.left);
        insertDuplicateNode(root.right);
    }

    public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
        BinaryTreeNode<Integer> startRoot = root;
        nodeSum(root, sum, startRoot);
    }

    public static void nodeSum(BinaryTreeNode<Integer> root, int sum, BinaryTreeNode<Integer> startRoot) {
        if (root == null) {
            return;
        }
        if (root.data != -1) {
            int pairSum = sum - root.data;
            if (isPresentInBinaryTree(pairSum, startRoot)) {
                if (pairSum + root.data == sum) {
                    System.out.println(Math.min(pairSum, root.data) + " " + Math.max(pairSum, root.data));
                    root.data = -1;
                }
            }
        }
        nodeSum(root.left, sum, startRoot);
        nodeSum(root.right, sum, startRoot);

    }

    public static boolean isPresentInBinaryTree(int pairSum, BinaryTreeNode<Integer> startRoot) {
        if (startRoot == null) {
            return false;
        }
        if (startRoot.data.compareTo(pairSum) == 0) {
            startRoot.data = -1;
            return true;
        }
        boolean smallAns = isPresentInBinaryTree(pairSum, startRoot.left);
        if (smallAns) {
            return true;
        }
        boolean smallAns1 = isPresentInBinaryTree(pairSum, startRoot.right);
        if (smallAns1) {
            return true;
        }
        return false;
    }

    public static void printBst(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printBst(root.left);
        printBst(root.right);
    }

    //    public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b) {
//        int ans1  = searchInBSt(root,a);
//        int ans2 = searchInBSt(root,b);
//        if(ans1!=-1&&ans2!=-1){
//            return lcaBst(root,a,b);
//        }
//        else if(ans1!=-1){
//            return ans1;
//        }
//        else {
//            return ans2;
//        }
//    }
//    public static int lcaBst(BinaryTreeNode<Integer> root,int a ,int b){
//    if (root == null) {
//            return -1;
//        }
//        if (root.data.compareTo(a)>0&&root.data.compareTo(b)<0){
//            return root.data;
//        }
//        int ans = lcaInBST(root.left,a,b);
//        if(ans != -1){
//            return ans;
//        }
//        ans  = lcaInBST(root.right,a,b);
//        if(ans != -1){
//            return ans;
//        }
//        return -1;
//    }
    public static int searchInBSt(BinaryTreeNode<Integer> root,int a){
        if(root == null){
            return -1;
        }
        if(root.data.compareTo(a)==0){
            return root.data;
        }
        if(root.data.compareTo(a)>0) {
            int ans = searchInBSt(root.left, a);
            if(ans!=-1){
                return ans;
            }
        }
        if(root.data.compareTo(a)<0){
            int ans = searchInBSt(root.right,a);
            if(ans!= -1){
                return ans;
            }
        }
        return -1;
    }
    public static int lcaBinaryTree(BinaryTreeNode<Integer> root, int a, int b) {
        if(root == null){
            return -1;
        }
        int ans1 =searchInBSt(root.left,a);
        int ans2 = searchInBSt(root.right,b);
        if(ans1!=-1&&ans2!=-1){
            return root.data;
        }
        else if(root.data.compareTo(a)==0||root.data.compareTo(b)==0){
            return root.data;
        }
        else {
            ans1 = searchInBSt(root.left, b);
            ans2 = searchInBSt(root.right, a);
            if (ans1 != -1 && ans2 != -1) {
                return root.data;
            }
            else if(root.data.compareTo(a)==0||root.data.compareTo(b)==0){
                return root.data;
            }
            else {
                int ans = lcaBinaryTree(root.left,a,b);
                if(ans!=-1){
                    return ans;
                }
                ans = lcaBinaryTree(root.right,a,b);
                if(ans!=-1){
                    return ans;
                }
            }
        }
        return -1;
    }
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        nodesAtKDistance(root,node,k);
    }
    public static int nodesAtKDistance(BinaryTreeNode<Integer> root ,int node,int k){
        if(root == null){
            return -1;
        }
        if(root.data.compareTo(node)==0){
            printNodesAtDistanceKDownward(root,k);
            return 0;
        }
        int dl = nodesAtKDistance(root.left,node,k);
        if(dl!=-1){
            if(dl + 1 == k){
                System.out.println(root.data);
            }
            else{
                printNodesAtDistanceKDownward(root.right,k-dl-2);
            }
            return dl +1;
        }

        int dr = nodesAtKDistance(root.right,node,k);
        if(dr!=-1){
            if(dr + 1 == k){
                System.out.println(root.data);
            }
            else{
                printNodesAtDistanceKDownward(root.left,k-dr-2);
            }
            return dr +1;
        }
        return -1;
    }
    public static void printNodesAtDistanceKDownward(BinaryTreeNode<Integer> root,int k){
        if(k<0||root ==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
        }

        printNodesAtDistanceKDownward(root.left,k-1);
        printNodesAtDistanceKDownward(root.right,k-1);
    }
    static ArrayList<Integer> listInteger = new ArrayList<>();
    static int leftSum = 0,rightSum =0;
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        for(Integer list : listOfBinaryTree(root)){
            rightSum += list;
        }
        replaceNodes(root);
    }
    public static void replaceNodes(BinaryTreeNode<Integer> root){
        if(root ==null){
            return;
        }
        replaceNodes(root.left);
        int cuurentLeftSum = leftSum;
        leftSum += root.data;
        root.data = rightSum - cuurentLeftSum;
        replaceNodes(root.right);
    }
    public static ArrayList<Integer> listOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return listInteger;
        }
        listOfBinaryTree(root.left);
        listInteger.add(root.data);
        listOfBinaryTree(root.right);
        return listInteger;
    }
    static int sum =0;
    static Stack<Integer> stack = new Stack<>();
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
       if(root == null){
           return;
       }
       sum += root.data;
       stack.push(root.data);
       if(root.left==null&&root.right==null&&sum==k){
           printStack(stack);
       }
       rootToLeafPathsSumToK(root.left,k);
       rootToLeafPathsSumToK(root.right,k);
       sum -=root.data;
       stack.pop();
    }
    public static void printStack(Stack<Integer> stack){
        Stack<Integer> stackReverse = new Stack<>();
        while(!stack.isEmpty()){
        stackReverse.push(stack.pop());
        }
        while(!stackReverse.isEmpty()){
            System.out.print(stackReverse.peek() + " ");
            stack.push(stackReverse.pop());
        }
        System.out.println();
    }
    static int maxHeight = Integer.MIN_VALUE;
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        if(root == null){
            return -1;
        }
        if(isBSTBottomUpBetter(root).isBST){
            int currentHeight = BinaryTree.heightOfBinaryTree(root);
            if(currentHeight>maxHeight){
                maxHeight = currentHeight;
            }
        }
        largestBSTSubtree(root.left);
        largestBSTSubtree(root.right);
        return maxHeight;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTree.prepareBinaryTreeUsingQueue();
//        int arr[] = {1,2,3,4,5,6,7};
//        printBst(SortedArrayToBST(arr));
        //LinkedList.printList(BSTToSortedLL(root));
        //printNodeFromK1ToK2(root,4,10);
        //System.out.println(isBST(root));
//        insertDuplicateNode(root);
//        printBst(root);
        //nodesSumToS(root,12);
//        System.out.println(lcaBinaryTree(root,2,10));
//        replaceWithLargerNodesSum(root);
//        BinaryTree.printBinaryTreeUsingQueue(root);
        //rootToLeafPathsSumToK(root,13);
        System.out.println(largestBSTSubtree(root));
    }
}

class isBSTObject {
    boolean isBST;
    int max;
    int min;

    isBSTObject() {
        this.isBST = true;
        this.min = Integer.MAX_VALUE;
        this.max = Integer.MIN_VALUE;
    }
}
