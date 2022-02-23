package LinkedLists;

public class DoublyLinkList {

             static class Node{
                          Node prev;
                          Node next;
                          int data;

                          Node(int d) {
                              data = d;
                              next = null;
                              prev = null;
                          }
                }
       Node head, tail;

   DoublyLinkList(){
         head =null;
         tail =null;
   }

   public void print(){
       Node i =head;
       System.out.print("Direct print: null<->");
       while(i!=null){
           System.out.print(i.data + "<->");
           i = i.next;
       }
       System.out.println("null");
   }

    public void printReverse(){ // this is not real reverse, it is just printing reverse
        Node i =tail;
        System.out.print("Reverse print: null<->");

        while(i!=null){
            System.out.print(i.data + "<->");
            i = i.prev;
        }
        System.out.println("null");
    }

   public void insertAtTail(int data){

       if(head==null){
           head = tail = new Node(data);
           return;
       }

       tail.next= new Node(data);
       Node oldTail = tail;
       tail = tail.next;
       tail.prev = oldTail;
   }

   public void insertAtHead(int data){
       if(head==null){
           head = tail = new Node(data);
           return;
       }

       head.prev = new Node(data);
       Node oldHead = head;
       head = head.prev;
       head.next = oldHead;


   }

   public void removeAtTail(){
       if(tail==null){
           System.out.println("linked List is empty");
       }
       else if(tail.prev==null){
           head = tail = null;
       } else {

           tail = tail.prev;
           tail.next = null;
       }
   }

    public void removeAtHead(){

       if(head==null){
           System.out.println("linked List is empty");
       }

       else if(head.next==null){
           head = tail = null;
       } else {

           head = head.next;
           head.prev = null;
       }

    }

    public int length(){
            Node i = head;
            int l=0;
            while (i!=null){
                l++;
                i=i.next;
            }
            System.out.println("length of linkedlist is:" +l);
            return l;
    }

    public  int middleElement(){
       Node slow=head, fast=head;
        while (fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow= slow.next;
        }
        System.out.println("middle element is:" + slow.data);
        return slow.data;
    }

    public void insertAtPosition(int data, int position){
       Node i = head;
       int j=0;

       while(j < position-1){
           i = i.next;
           j++;
       }
       Node m;
       m = i.next;
       i.next = new Node(data);
       i.next.prev = i;
       i.next.next = m;
       m.prev = i.next;
   }

    public void removeAtPosition(int position){
       Node i=head;
       int j=0;

       while(j<position-2){
           j++;
           i= i.next;
       }
       i.next = i.next.next;
       i.next.prev= i;
    }

    public void mergeLinkedList(DoublyLinkList l1){
        l1.tail.next= this.head;
        head=l1.head;
        print();

    }

    public static void zig_zagLinkedList(DoublyLinkList l1, DoublyLinkList l2){
        Node i= l1.head;
        Node j= l2.head;
        Node k= i;

       while(i!=null && j!=null){
           i =i.next;  // i=2
           k.next =j;  //k.next->4
           k= k.next;  //k=4

           j= j.next;  //j=5
           k.next= i;  //k.next-> 2
           k= k.next;  //k=2
       }

        i= l2.tail;
        j= l1.tail;
        k= i;

        while(i!=null && j!=null){
            i =i.prev;  // i=2
            k.prev =j;  //k.next->4
            k= k.prev;  //k=4


            j= j.prev;  //j=5
            k.prev= i;  //k.next-> 2
            k= k.prev;  //k=2
        }
        l1.tail= l2.tail;
    }

   public static void main(String[] args) {

       DoublyLinkList dll= new DoublyLinkList();
       dll.head= new Node(1);
       dll.head.next = new Node(2);
       dll.head.next.prev= dll.head;
       dll.head.next.next = new Node(3);
       dll.head.next.next.prev = dll.head.next;
       dll.tail= dll.head.next.next;
       dll.print();

       DoublyLinkList dll1= new DoublyLinkList();
       dll1.insertAtTail(6);
       dll1.print();

       dll1.insertAtHead(4);
        dll1.print();

      // dll.removeAtTail();
      //  dll.print();
    //   dll.removeAtHead();
      // dll.print();

       dll.length();

       dll.middleElement();

       dll1.insertAtPosition(5,1);
       dll.print();
       dll1.print();

    //   dll.removeAtPosition(2);
     //  dll.print();

    //   dll1.mergeLinkedList(dll);

       zig_zagLinkedList(dll,dll1);
       dll.print();

       dll.printReverse();
       dll1.printReverse();






    }
}
