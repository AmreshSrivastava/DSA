package DataStructure.hash.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class h1 {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        //create
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //print
        System.out.println(set);  //it return unique value

        //size
        System.out.println(set.size());  //3 - 1 not stored - duplicate value

        //remove
        System.out.println(set.remove(1));  //return true - if value is available and then remove it.

        //contains - search
        System.out.println(set.contains(1));   //false 

        //iterate - next - iterate to the next, hasNext- true/false - check and iterate until next value become null.
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());  //  2 3
        }

    }
}
