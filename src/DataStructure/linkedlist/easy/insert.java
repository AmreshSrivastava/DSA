package DataStructure.linkedlist.easy;

class insert {

    Node head;

    class Node{
        String data;
        Node next;
        //constructor
        Node(String data){      
            this.data = data;
            this.next = null;
        }
    }

                                           
    //add - first                       
    public void addFirst(String data){     //1 ---->   2 --> 3 --> 4 -->null      ---- O(1) 
        Node N = new Node(data);           // N- new node
        //check if there is node
         if(head == null){
            head = N;
            return;
         }
         //if there is node available
         N.next = head;
         head = N;
    }


    //add - last     ---- O(n)
    public void addLast(String data){        // 1 --> 2 --> 3 --> null (head)  --> 4 --> null   ---- O(n)
        Node N = new Node(data);
        // check if there is node
        if (head == null) {
            head = N;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){       //traverse until not found null
           currNode = currNode.next;
        }
        currNode.next = N;
    }


    //print
    public void print(){
        
        // check if there is node
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) { // traverse until not found null
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    // delete - first
    public void deleteFirst(){     //(head) 1 ----> (make head)2 --> 3 --> 4 -->null
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }


    //delete - last
    public void deleteLast(){      //1 --> 2 --> 3 (make null)--> 4 -->null 
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){         //a --> null
            head = null;
            return;
        }                 
        // (0, make sl)1 --> (make sl,make l)2 --> (make l, make sl)3 --> (make l, null)4 -->null        
        Node SL = head;      //secondlast
        Node LN = head.next;     //last node
        while(LN.next != null){
           LN = LN.next;
           SL = SL.next;
        }
       SL.next = null;
    }


    public static void main(String[]args){
          insert list = new insert();
          list.addFirst("a");        // -->  a --> null -->

          list.addFirst("is");         //is --> a --> null
          list.print();

          list.addLast("list");       // is --> a  --> list --> null
          list.print();

          list.addFirst("this");      // this --> is --> a --> list --> null
          list.print();

          list.deleteFirst();              // is --> a --> list --> null
          list.print();

          list.deleteLast();               // is --> a --> null
          list.print();
    }
}