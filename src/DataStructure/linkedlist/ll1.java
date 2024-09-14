package DataStructure.linkedlist;

import java.util.LinkedList;

public class ll1 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");

        for(int i=l.size(); i<=0; i--){
         System.out.println(l.get(i));  
        }
        System.out.println();
    }
}
