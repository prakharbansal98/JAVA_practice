package com.company;

import java.util.Random;

public class SortedLinkedList extends LinkLists{

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

    public static void main(String[] args) {

        SortedLinkedList ll = new SortedLinkedList();

        Random rdm = new Random();
        for (int i = 0; i < 10; i++) {
            int r = Math.abs(rdm.nextInt() % 10);
            ll.sortedLinkedList(r);
        }
        ll.print();
    }
}
