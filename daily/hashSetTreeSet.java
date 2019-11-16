package baogao3.Test3;

import java.util.HashSet;
import java.util.TreeSet;

public class hashSetTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        int rand = 0;
        for (int i = 0; i < 10; i++) {
            rand = (int)(Math.random()*100);
            hashSet.add(rand);
            treeSet.add(rand);
            System.out.print( rand + " ");
        }
        System.out.println(" ");
        System.out.println(hashSet);
        System.out.println(treeSet);
    }

}
