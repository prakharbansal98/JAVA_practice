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
             System.out.print(i.data+"-->");
             i=i.next;
         }
         System.out.println("NULL");
     }

     public void insertAtTail(int a){
         Node i;
         for(i=head; i.next!=null; i=i.next);
         i.next= new Node(a);
     }

     public void insertAtHead(int a){
         Node i = head;
         head = new Node(a);
         head.next = i;
     }

    public void removeAtTail(){
        Node i;

          for (i = head; i.next.next != null; i = i.next) ;
          i.next = null;


    }

    public void removeAtHead(){
      if(head!= null) {
          head = head.next;
      }else {
          System.out.println("Linklist is empty.");
      }
    }


    public static void main(String[] args) {

        LinkLists l = new LinkLists();

        l.insertAtHead(1);

        l.head= new Node(1);
        l.head.next= new Node(2);
        l.head.next.next= new Node(3);
        l.head.next.next.next= new Node(4);
        l.head.next.next.next.next= new Node(5);
        l.print();

        l.insertAtTail(6);
        l.print();

        l.insertAtHead(0);
        l.print();

        l.removeAtTail();
        l.print();

        l.removeAtHead();
        l.removeAtHead();
        l.removeAtHead();
        l.removeAtHead();
        l.removeAtHead();
        l.removeAtHead();
        l.removeAtHead();
        l.print();
    }
}
