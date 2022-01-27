package com.company;

public class Queue_Using_LinkList {

    LinkLists ll = new LinkLists();

    public void enqueue(Integer i){
        ll.insertAtTail(i);
    }

    public Integer dequeue(){
     return ll.removeAtHead();
    }

    public void print(){
        ll.print();
    }

    public static void main(String[] args) {

        Queue_Using_LinkList qul= new Queue_Using_LinkList();
        qul.enqueue(1);
        qul.enqueue(2);
        qul.enqueue(3);
        qul.enqueue(4);
        qul.enqueue(5);

        qul.print();

       for(int i=0; i<6; i++) {
           qul.dequeue();
           qul.print();
       }
    }
}
