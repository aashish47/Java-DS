package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        if(disks==0){
            return;
        }
        if(disks==1){
            System.out.println(source + " " + destination);
            return;
        }
        else {
            towerOfHanoi(disks - 1, source, destination, auxiliary);
            System.out.println(source + " " + destination);
            towerOfHanoi(disks - 1, auxiliary, source, destination);
            return;
        }

    }
    public static void main(String[] args) {
        towerOfHanoi(3,'a','b','c');
    }
}
