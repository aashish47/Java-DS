package DataStructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTreePractice {
    public  static Scanner s = new Scanner(System.in);
    public static GenericTreeNode<Integer>prepareGenericTree(){ //not generic
        int data = s.nextInt();      //this is the reason not being generic
        GenericTreeNode<Integer> root = new GenericTreeNode<>(data);
        int noOfChildren = s.nextInt();
        for(int i=0;i<noOfChildren;i++){
            root.children.add(prepareGenericTree());
        }
        return root;
    }
    public static GenericTreeNode<Integer> prepareGenericTreeUsingQueue(){
        System.out.println("Enter data");
        int data = s.nextInt();
        GenericTreeNode<Integer> root = new GenericTreeNode<>(data);
        Queue<GenericTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            GenericTreeNode<Integer> currentNode = queue.remove();
            //System.out.println("Enter no of children");
            int noOfChildren = s.nextInt();
            for(int i = 0;i<noOfChildren;i++){
                //System.out.println("Enter Child data");
                int childrenData = s.nextInt();
                GenericTreeNode<Integer> child = new GenericTreeNode<>(childrenData);
                queue.add(child);
                currentNode.children.add(child);
            }
        }
        return root;
    }
    public static <T>void printGenericTree(GenericTreeNode<T> root){
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++){
            printGenericTree(root.children.get(i));
        }
    }
    public static <T> void printGeneictreeUsingQueue(GenericTreeNode<T> root){
        Queue<GenericTreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            GenericTreeNode<T> currentNode = queue.remove();
            if(currentNode==null && queue.isEmpty()){
                return;
            }
            else if(currentNode==null){
                System.out.println();
                queue.add(null);
            }
            else {
                System.out.print(currentNode.data + " ");
                for (GenericTreeNode<T> child : currentNode.children) {
                    queue.add(child);
                }

            }
        }
    }
    public static <T>int countNodes(GenericTreeNode<T> root){
//        int count =1;
//        for(GenericTreeNode<T> child : root.children){
//            count = count + countNodes(child);
//        }
//        return count;
        int count = 0;
        Queue<GenericTreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            GenericTreeNode<T> currentNode = queue.remove();
            count++;
            for (int i = 0; i < currentNode.children.size();i++) {
                queue.add(currentNode.children.get(i));
            }
        }
        return count;
    }
    public static int sumOfNodes(GenericTreeNode<Integer> root){
//        int sum = root.data;
//        for(GenericTreeNode<Integer> child : root.children){
//             sum = sum + sumOfNodes(child);
//        }
//        return  sum;
        int sum = 0;
        Queue<GenericTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            GenericTreeNode<Integer> currentNode = queue.remove();
            sum = sum + currentNode.data;
            for (int i = 0; i < currentNode.children.size();i++) {
                queue.add(currentNode.children.get(i));
            }
        }
        return sum;

    }
    public static int largestNode(GenericTreeNode<Integer> root){
        int largest = root.data;
        for(GenericTreeNode<Integer> child : root.children){
            largest = largest>largestNode(child)?largest:largestNode(child);
        }
        return  largest;
    }
    public static int noOfNodesGreaterThanX(GenericTreeNode<Integer> root, int x){
        int noOfNodesGreaterThanX = 0;
        for(GenericTreeNode<Integer> child : root.children){
            noOfNodesGreaterThanX = root.data>x?noOfNodesGreaterThanX(child,x)+1:noOfNodesGreaterThanX(child,x);
        }
        return  noOfNodesGreaterThanX;
    }
    public static int heightOfTree(GenericTreeNode<Integer> root){
        int height = 0;
        for(GenericTreeNode<Integer> child : root.children){
            int childHeight =  heightOfTree(root);
        }
        return  height;
    }
    static GenericTreeNode<Integer> max = new GenericTreeNode<>(Integer.MIN_VALUE);
    static int maxSum = Integer.MIN_VALUE;
    public static GenericTreeNode<Integer> maxSumNode(GenericTreeNode<Integer> root){
        // Write your code here
        int sum = root.data;
        for(GenericTreeNode<Integer> child : root.children){
            sum+=child.data;
        }
        if(sum>maxSum){
            max = root;
            maxSum=sum;
        }
        for(GenericTreeNode<Integer> child : root.children){
            maxSumNode(child);
        }
        return max;
    }
    public static boolean checkIdentical(GenericTreeNode<Integer> root1, GenericTreeNode<Integer> root2){

        // Write your code here
        if(root1.data.compareTo(root2.data)!=0){
            return false;
        }
        for(int i = 0,j=0;i<root1.children.size()&&j<root2.children.size();i++,j++){
            if(!checkIdentical(root1.children.get(i),root2.children.get(j))){
                return false;
            }
        }
        return true;
    }
    static GenericTreeNode<Integer> justGreater = new GenericTreeNode<>(Integer.MAX_VALUE);
    public static GenericTreeNode<Integer> findNextLargerNode(GenericTreeNode<Integer> root, int n){

        if(root.data.compareTo(n)>0&&root.data.compareTo(justGreater.data)<0){
            justGreater = root;
        }
        for(GenericTreeNode<Integer> child : root.children){
            findNextLargerNode(child,n);
        }
        return justGreater;
    }
    static GenericTreeNode<Integer> largest = new GenericTreeNode<>(Integer.MIN_VALUE);
    static GenericTreeNode<Integer> secondLargest = new GenericTreeNode<>(Integer.MIN_VALUE);
    public static GenericTreeNode<Integer> findSecondLargest(GenericTreeNode<Integer> root){

        if(root.data.compareTo(largest.data)>0){
            secondLargest = largest;
            largest = root;
        }

        for(GenericTreeNode<Integer> child:root.children){
            findSecondLargest(child);
        }
        return secondLargest;
    }

    public static void replaceWithDepthValue(GenericTreeNode<Integer> root){
        Queue<GenericTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int level = 0;
        while(!queue.isEmpty()) {
            GenericTreeNode<Integer> currentNode = queue.remove();
            if (currentNode == null&& queue.isEmpty()) {
                return;
            }
            else if(currentNode ==null){
                level++;
                queue.add(null);
            } else {
                currentNode.data = level;

                for (GenericTreeNode<Integer> child : currentNode.children) {
                    queue.add(child);
                }
            }
        }
    }
    public static void main(String[] args) {
        //GenericTreeNode<Integer> root = prepareGenericTree();
        //printGenericTree(root);
        //System.out.println(countNodes(root));
        //System.out.println(largestNode(root));
        //System.out.println(noOfNodesGreaterThanX(root,5));
        //System.out.println(heightOfTree(root));
        GenericTreeNode<Integer> root1 = prepareGenericTreeUsingQueue();
        //printGenericTree(root);
        //GenericTreeNode<Integer> root2 = prepareGenericTreeUsingQueue();
        //printGeneictreeUsingQueue(root1);
        replaceWithDepthValue(root1);
        printGeneictreeUsingQueue(root1);
        //System.out.println(sumOfNodes(root));
    }
}
