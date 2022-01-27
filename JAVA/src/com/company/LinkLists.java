package com.company;

class Node{

    int data;
    Node next;

    Node(int d){
        data= d;
        next= null;
    }

}


public class LinkLists {

     Node head=null;

     public void print(){
         Node i = head;
         while (i!=null){
             System.out.print(i.data+"=>");
             i=i.next;
         }
         System.out.println("NULL");
     }

     public void insertAtTail(int a){
         if(head==null){
             head = new Node(a);
         } else {
             Node i;
             for (i = head; i.next != null; i = i.next) ;
             i.next = new Node(a);
         }
     }

     public void insertAtHead(int a){
         Node i = head;
         head = new Node(a);
         head.next = i;
     }

    public Integer removeAtTail(){
        if(head!= null) {
            Node i = head;

            int a;

            if(i.next==null){
                a= head.data;
                head=null;

            } else {

                while (i.next.next != null) {
                    i = i.next;
                }
                a = i.next.data;

                i.next = null;
            }

            System.out.println("removing :" + a);
            return a;

        }

        System.out.println("Linklist is empty.");
        return -1;


    }

    public Integer removeAtHead(){
      if(head!= null) {
          int a =head.data;
          head = head.next;

          return a;
      }

      System.out.println("Linklist is empty.");
      return -1;

    }


    public static void main(String[] args) {

        LinkLists l = new LinkLists();
        l.insertAtTail(-1);
        l.insertAtHead(-2);
        l.print();

  /*      l.head= new Node(1);
        l.head.next= new Node(2);
        l.head.next.next= new Node(3);
        l.head.next.next.next= new Node(4);
        l.head.next.next.next.next= new Node(5);
        l.print();  */

        l.insertAtTail(6);
        l.print();

        l.insertAtHead(0);
        l.print();

        l.removeAtTail();
        l.print();

        l.removeAtTail();
        l.print();
        l.removeAtTail();
        l.print();
        l.removeAtTail();
        l.print();
        l.removeAtTail();
        l.print();

    }
}
