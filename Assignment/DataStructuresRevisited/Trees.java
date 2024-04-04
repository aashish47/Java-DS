//package DataStructuresRevisited;
//
//import sun.reflect.generics.tree.Tree;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Trees {
//    static Scanner s = new Scanner(System.in);
//
//    TreeNode createBinaryTree(){
//        System.out.println("Enter Data : ");
//        int data = s.nextInt();
//        if(data == -1){
//            return null;
//        }
//        TreeNode newNode = new TreeNode(data);
//        newNode.left = createBinaryTree();
//        newNode.right = createBinaryTree();
//        return newNode;
//    }
//
//    void printBinaryTree(TreeNode node){
//        if(node == null){
//            return;
//        }
//        printBinaryTree(node.left);
//        System.out.println(node.data);
//        printBinaryTree(node.right);
//    }
//
//
//    TreeNode createBinaryQueue(){
//        int data = s.nextInt();
//        if(data == -1){
//            return null;
//        }
//        TreeNode root = new TreeNode(data);
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            TreeNode currentNode = queue.poll();
//            System.out.println("Enter Left data :");
//            data = s.nextInt();
//            if(data != -1){
//                TreeNode leftNode = new TreeNode(data);
//                queue.add(leftNode);
//                currentNode.left = leftNode;
//            }
//            System.out.println("Enter right data :");
//            data = s.nextInt();
//            if(data != -1){
//                TreeNode rightNode = new TreeNode(data);
//                queue.add(rightNode);
//                currentNode.right = rightNode;
//            }
//        }
//        return root;
//
//    }
//    void printBinaryUsingQueue(TreeNode root){
//        if(root == null){
//            System.out.println();
//            return;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        queue.add(null);
//        while(!queue.isEmpty()){
//            TreeNode currentNode = queue.poll();
//            if(currentNode == null && queue.isEmpty()){
//                return;
//            }
//            else if(currentNode == null){
//                System.out.println();
//                queue.add(null);
//            }
//            else {
//                System.out.print(currentNode.data + " ");
//                if(currentNode.left != null){
//                    queue.add(currentNode.left);
//                }
//                if(currentNode.right != null){
//                    queue.add(currentNode.right);
//                }
//            }
//        }
//        return;
//
//    }
//
//    GenericTree createGenericTree(){
//        int data;
////        System.out.println("Enter data");
//        data = s.nextInt();
//        GenericTree root = new GenericTree(data);
//        int children;
////        System.out.println("Enter number of children");
//        children = s.nextInt();
//        for(int i = 0; i<children; i++){
////            System.out.println("Enter child data :");
//            root.children.add(createGenericTree());
//        }
//        return root;
//    }
//
//    GenericTree createGenericTreeUsingQueue(){
////        System.out.println("Enter data :");
//        int data = s.nextInt();
//        int children;
//        GenericTree root = new GenericTree(data);
//        Queue<GenericTree> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            GenericTree currentNode = queue.poll();
////            System.out.println("Enter number of children :");
//            children = s.nextInt();
//            for (int i = 0; i < children; i++){
////                System.out.println("Enter children" + (i + 1));
//                data = s.nextInt();
//                if(data != -1) {
//                    GenericTree child = new GenericTree(data);
//                    currentNode.children.add(child);
//                    queue.add(child);
//                }
//            }
//        }
//        return  root;
//    }
//
//
//    int countLeafNodes(GenericTree root){
//        if(root == null){
//            return 0;
//        }
//        if(root.children.size() == 0){
//            return 1;
//        }
//
//        int count = 0;
//
//
//        for(GenericTree child : root.children ){
//                count += countLeafNodes(child);
//        }
//        return count;
//    }
//
//    int nodesGreaterThanX(GenericTree root,int x){
//        if(root == null){
//            return 0;
//        }
//        if(root.children.size() == 0) {
//            if (root.data > x) {
//                return 1;
//            }
//            else {
//                return 0;
//            }
//        }
//        int count = 0;
//        if(root.data > x){
//            count++;
//        }
//        for(GenericTree child : root.children){
//            count += nodesGreaterThanX(child,x);
//        }
//        return count;
//    }
//    void printGenericTree(GenericTree root){
//        if(root == null){
//            return;
//        }
//        System.out.println(root.data);
//        for(GenericTree child : root.children ){
//            System.out.println(child.data);
//        }
//        return;
//    }
//    void printGenericTreeUsingQueue(GenericTree root){
//        if(root == null){
//            return;
//        }
//        Queue<GenericTree> queue = new LinkedList<>();
//        queue.add(root);
//        queue.add(null);
//        while (!queue.isEmpty()){
//            GenericTree currentNode = queue.poll();
//            if(currentNode == null && queue.isEmpty()){
//                return;
//            }
//            else if(currentNode == null){
//                System.out.println();
//                queue.add(null);
//            }
//            else {
//                System.out.print(currentNode.data + " ");
//                for (GenericTree child : currentNode.children){
//                    queue.add(child);
//                }
//            }
//        }
//        return;
//    }
//    void printNodesAtK(GenericTree root,int k){
//        if(root == null){
//            return;
//        }
//        if(k == 0){
//            System.out.println(root.data);
//            return;
//        }
//        for (GenericTree child : root.children){
//            printNodesAtK(child,k-1);
//        }
//        return;
//    }
//    GenericTree maxNode(GenericTree root){
//        if(root == null){
//            return null;
//        }
//        GenericTree maxNode = root;
//        for (GenericTree child : root.children){
//            GenericTree temp = maxNode(child);
//            if(temp.data > maxNode.data){
//                maxNode = temp;
//            }
//        }
//        return maxNode;
//    }
//    int sum(GenericTree root){
//        if(root == null){
//            return  0;
//        }
//        int sum = root.data;
//        for (GenericTree child : root.children){
//            sum += sum(child);
//        }
//        return sum;
//    }
//    int countNodes(GenericTree root){
//        if(root ==null){
//            return 0;
//        }
//        int count = 1;
//        for (GenericTree child : root.children){
//            count += countNodes(child);
//        }
//        return count;
//    }
//    int maxSum(GenericTree root,int x){
//        if(root == null){
//            return -1;
//        }
//        int maxNode,maxSum;
//
//        int currentSum = root.data;
//        for(GenericTree child : root.children){
//            currentSum += child.data;
//        }
////        if(currentSum > maxSum){
//            maxSum = currentSum;
////            maxNode = root;
////        }
////        return maxNode;
//
////    }
//    public static void main(String[] args) {
//        Trees o = new Trees();
////        System.out.println("Enter root data");
//////        TreeNode tree = o.createBinaryQueue();
//////        o.printBinaryUsingQueue(tree);
//        GenericTree genericTree = o.createGenericTreeUsingQueue();
////        o.printGenericTreeUsingQueue(genericTree);
//        System.out.println(o.countNodes(genericTree));
//    }
//}
//
//class TreeNode{
//    int data;
//    TreeNode left;
//    TreeNode right;
//    public TreeNode(int data){
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//class GenericTree{
//    int data;
//    ArrayList<GenericTree> children;
//    GenericTree(int data){
//        this.data = data;
//        children = new ArrayList<>();
//    }
//}