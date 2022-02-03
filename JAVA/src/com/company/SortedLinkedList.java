package com.company;

import java.util.Random;

public class SortedLinkedList extends LinkLists {

    public void sortedLinkedList(int data) {
        Node new_node = new Node(data);


        if (head == null) {
            head = new_node;

        } else if (head.data >= data) {
            Node old = head;
            head = new_node;
            head.next = old;

        } else {
            Node i = head, prev = head;
            while (data > i.data) {
                prev = i;
                if (i.next == null) {
                    i.next = new_node;
                    return;
                }
                i = i.next;
            }
            prev.next = new_node;
            new_node.next = i;
        }
    }

    public void removingDuplicates(){
        Node current = head, prev= head;
        while(current!=null && prev!=null){

            if(prev.data==current.data) {
                prev.next = current.next; // OR we can write--> prev.next= prev.next.next;
                current = prev.next;
            }
            else {
                prev = current;
                current = current.next;
            }
        }
    }

    public void mergeLinkedList(SortedLinkedList l1, SortedLinkedList l2){

        head = new Node(-1);
       // head = (l1.head.data < l2.head.data) ? l1.head : l2.head;
        Node i= l1.head, j=l2.head, k=head;

        while(i!=null && j!= null){
            if(i.data<j.data){
                k.next=i;
                i=i.next;
            }
            else{
                k.next=j;
                j=j.next;
            }
            k= k.next;
        }
        if(i!=null){
            k.next=i;
        }
        if(j!=null){
            k.next=j;
        }
        removeAtHead();
        print();
    }


    private static SortedLinkedList getSortedLinkedList(int size) {
        SortedLinkedList ll = new SortedLinkedList();

        Random rdm = new Random();
        for (int i = 0; i < size; i++) {
            int r = Math.abs(rdm.nextInt() % 20);
            ll.sortedLinkedList(r);
        }

        return ll;
    }

    public static void main(String[] args) {

        SortedLinkedList ll1 = getSortedLinkedList(4);
        ll1.print("ll1: ");

        SortedLinkedList ll2 = getSortedLinkedList(6);
        ll2.print("ll2: ");

     //   SortedLinkedList ll3= new SortedLinkedList();
     //   ll3.mergeLinkedList(ll1,ll2);










    }


}
