package com.company;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    ArrayList<Integer> q;
    int size;

    Queues(int s){
        size=s;
        q = new ArrayList<>();
    }

    public void print(){
        System.out.println(q);
    }

    public void add(Integer i){
        if(q.size()<size) {
            q.add(i);
            return;
        }
        System.out.println("capacity full");
    }

    public Integer peek(){
        if(q.isEmpty()==false) {
           return q.get(0);
        }
        System.out.println("queue is empty.");
        return null;
    }
    public Boolean contains(Integer i){
        return q.contains(i);
    }

    public Integer poll(){
        if(q.isEmpty()==false) {
            return q.remove(0);
        }
        System.out.println("queue is empty.");
        return null;
    }

    public Integer remove(Integer i){
        if(q.isEmpty()==false) {
            return q.remove(q.indexOf(i));
        }

        return null;
    }

    public Boolean isEmpty(){
      return q.isEmpty();
    }

    public Boolean isFull(){
        return q.size()==size;
    }


    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();

        Queues queue= new  Queues(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.print();

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        queue.print();



    }
}
