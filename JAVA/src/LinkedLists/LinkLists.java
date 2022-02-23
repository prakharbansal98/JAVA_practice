package LinkedLists;

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

    public void print(String message){
        System.out.print(message);
        print();
    }
    public void print(){
        print(head);
    }
     public void print(Node head){
         Node i = head;
         while (i!=null){
             System.out.print(i.data+"=>");
             i=i.next;
         }
         System.out.println("NULL");
     }

     public void insertAtTail(int data){
         if(head==null){
             head = new Node(data);
         } else {
             Node i;
             for (i = head; i.next != null; i = i.next) ;
             i.next = new Node(data);
         }
     }

     public void insertAtHead(int data){
         Node i = head;
         head = new Node(data);
         head.next = i;
     }

    public Integer removeAtTail(){
        if(head!= null) {
            Node i = head;

            int data;

            if(i.next==null){
                data= head.data;
                head=null;

            } else {

                while (i.next.next != null) {
                    i = i.next;
                }
                data = i.next.data;

                i.next = null;
            }

            System.out.println("removing :" + data);
            return data;

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

    public int length(){
        Node i = head;
        int l=0;
        while (i!=null){
            l++;
            i=i.next;
        }
       // System.out.println("length of linkedlist is:" +l);
        return l;
    }

    public int middleElement(){
   /*     int m= length()/2;

        Node i = head;
        for(int j=0; j<m; j++){
            i=i.next;
        }  */
        Node slow=head, fast=head;
        while (fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow= slow.next;
        }
        System.out.println("middle element is:" + slow.data);
        return slow.data;
    }

    public void insertAtPosition(int data, int position){
        if(position==1){
            insertAtHead(data);
            print();
        }
        else if(position<0){
            System.out.println("Position only be between "+ 1 +" to "+ length());
        }
        else if (position<=length()-1) {
            Node i = head;

            for (int j = 0; j < position - 1; j++) {
                i = i.next;
            }
            Node n = i.next;
            i.next = new Node(data);
            i.next.next = n;
            print();
        }
        else if(position>length()){
            System.out.println("Position only be between "+ 1 +" to "+ length());
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

    public void mergeLinkedList(LinkLists l1, LinkLists l2){
        l1.tail().next= l2.head;
        head=l1.head;
        print();

    }

    public Node tail(){
        Node i=head;
        while(i.next!=null){
            i= i.next;
        }
        return i;
    }

    public void zig_zagLinkedList(LinkLists l1, LinkLists l2){
     //   head =l1.head; // giving l3 it's head, otherwise head will be null
        head = l1.head!=null ? l1.head : l2.head;
        Node i = l1.head; // i= 1, 2, 3, 4, 5
        Node j = l2.head; //j=  6, 7, 8, 9, 10
        Node k = head;       // 1

   /*     i = i.next; // i = 2
        k.next = j; // 1 -> 6
        k= k.next; // k= 6

        j = j.next; // j=7
        k.next =i; // 6 ->2
        k = k.next; // k= 2

        i = i.next; // i = 3
        k.next = j; // 2 -> 7
        k= k.next; // k=7   */

        while(i!=null && j!=null){

            i = i.next;
            k.next = j;
            k= k.next;
            System.out.println(k.data);


            j = j.next;

            if(i!=null) {
                k.next = i;
                k = k.next;
                System.out.println(k.data);
            }
        }

        if(i==null){
            k.next=j;
        }
        if(j==null) {
            k.next = i;
        }
    }




    public static void main(String[] args) {

        LinkLists l1 = new LinkLists();
        LinkLists l2 = new LinkLists();

        l1.head = new Node(1);
   /*     l1.head.next = new Node(2);
        l1.head.next.next = new Node(3);
        l1.head.next.next.next = new Node(4);
        l1.head.next.next.next.next = new Node(5);
        l1.head.next.next.next.next.next = new Node(6);  */
        l1.print("l1: ");

        l2.insertAtTail(6);
     //   l2.print();
        l2.insertAtTail(7);
   //     l2.print();
        l2.insertAtTail(8);
    //    l2.print();
        l2.insertAtTail(9);
   //     l2.print();
        l2.insertAtTail(10);
        l2.insertAtTail(11);
        l2.print("l2: ");


        l2.removeAtTail();
        l2.print();

        l2.length();

        l2.middleElement();
        l2.print();

        l2.insertAtPosition(80, 60);

        l2.removeAtPosition(4);
        l2.print("l2 :");

        LinkLists l3= new LinkLists();
     //  l3.mergeLinkedList(l1,l2);

        l3.zig_zagLinkedList(l1,l2);
        l3.print("l3: ");

    }
}












