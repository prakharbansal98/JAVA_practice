package com.company;

public class CircularLinkLists extends LinkLists {

     Node head=null;

    public void print(String message){
        System.out.print(message);
        print();
    }
    public void print(){
        print(head);
    }
     public void print(Node head){

        Node i = head;
        if(i==null){
            System.out.println("LinkedList is empty.");
            return;
        }
        do{
            System.out.print(i.data+"=>");
            i=i.next;
        } while (i!= head);
         System.out.println("HEAD" );
     }

     public void insertAtTail(int data){
         if(head==null){
             head = new Node(data);
             head.next= head;
         } else {
             Node i=head;
             while(i.next!=head) {
                i=i.next;
             }
             i.next = new Node(data);
             i= i.next;
             i.next = head;

         }
     }

     public void insertAtHead(int data){
         Node i = head;
         Node t = tail();
         head = new Node(data);
         head.next = i;
         t.next=head;
     }

    public Integer removeAtTail(){
        if(head!= null) { //non empty linked list
            Node i = head;

            int data;

            if(i.next==head){ // if link list has 1 element, whenever 1 element is left special case is made for it
                data= head.data;
                head=null;

            } else {

                while (i.next.next != head) {
                    i = i.next;
                }
                data = i.next.data;

                i.next = head;
            }

            System.out.println("removing :" + data);
            return data;

        }

        System.out.println("Linklist is empty.");
        return -1;


    }

    public Integer removeAtHead(){
      if(head!= null) {

          if(head.next== head){     // if link list has 1 element, whenever 1 element is left special case is made for it
              head =null;
          } else {
              Node t = tail();
              head = head.next;
              t.next = head;
          }
      }
      else {
          System.out.println("Linklist is empty.");
      }
      return -1;

    }

    public int length(){
        Node i = head;
        int l=0;
        while (i.next!=head){
            l++;
            i=i.next;
        }
        l++;
        System.out.println("length of linkedlist is:" +l);
        return l;
    }

    public int middleElement(){
        int m= length()/2;

        Node i = head;
        for(int j=0; j<m; j++){
            i=i.next;
        }
        System.out.println("middle element is:" + i.data);
        return i.data;
    }

    public void insertAtPosition(int data, int position){
        if(position==1){
            insertAtHead(data);
            print();
        }
        else if(position<0){
            System.out.println("Position only be between "+ 1 +" to "+ length());
        }
        else {
            Node i = head;

            for (int j = 0; j < position - 1; j++) {
                i = i.next;
            }
            Node n = i.next;
            i.next = new Node(data);
            i.next.next = n;
            print();
        }
    }

    public void removeAtPosition(int position){
         if(position==1){
             removeAtHead();
             print();
         }
         else if(position==length()){
             removeAtTail();
             print();
         }
         else if(position<=0){
             System.out.println("Elements can only be removed from " + 1 + " to " + length() );
         }
         else if(position>length()){
             System.out.println("Elements can only be removed from " + 1 + " to " + length() );
         }
         else if(position<length()){
             Node i =head;

             for (int j = 0; j < position - 2; j++) {
                 i = i.next;
             }
             i.next = i.next.next;

             print();
         }
    }

    public void mergeLinkedList(CircularLinkLists l1, CircularLinkLists l2){
        l1.tail().next= l2.head;
        head=l1.head;
        print();

    }

    public Node tail(){
        Node i=head;
        while(i.next!=head) {
            i=i.next;
        }
        return i;
    }

    private static void operationsOfLinkList(LinkLists l2) {
        l2.insertAtTail(6);
        l2.print();
        l2.insertAtTail(7);
        l2.print();
        l2.insertAtTail(8);
        l2.print();
        l2.insertAtTail(9);
        l2.print();
        l2.insertAtTail(10);
        l2.print();


        l2.insertAtHead(5);
        l2.print();


        System.out.println(l2.tail().data);


        //  l2.removeAtTail();
        //  l2.print();

        l2.length();

        l2.middleElement();

        l2.insertAtHead(4);
        l2.print();
        l2.middleElement();

        l2.insertAtPosition(80, 60);

        l2.removeAtPosition(5);

        //  for(int i=0; i< 7; i++) {
        l2.removeAtHead();
        l2.print("l2 :");
        //  }


        l2.removeAtTail();
        l2.print();


        //   CircularLinkLists l3= new CircularLinkLists();
        //    l3.mergeLinkedList(l1,l2);
    }




    public static void main(String[] args) {

        CircularLinkLists l1 = new CircularLinkLists();


        l1.head = new Node(1);
        l1.head.next = new Node(2);
        l1.head.next.next = new Node(3);
        l1.head.next.next.next = new Node(4);
        l1.head.next.next.next.next = new Node(5);
        l1.head.next.next.next.next.next = l1.head;
        l1.print();

        System.out.println("---Circular Linked List---");

        CircularLinkLists l2 = new CircularLinkLists();
        operationsOfLinkList(l2);

        System.out.println("---Linear Linked List---");

        LinkLists l3 = new LinkLists();
        operationsOfLinkList(l3);
    }
}












