//implement stack using queues

package com.company;

public class Stack_Using_Queues {

    Queues queue1 = new Queues(5);

    public void push(Integer i){
        queue1.enqueue(i);
    }

    public Integer pop(){ //whileloop, is empty

        Queues queue2= new Queues(5);
        int n= queue1.num;
       for(int i=0;i<n-1;i++){
          queue2.enqueue(queue1.dequeue());
       }
        Integer a= queue1.dequeue();
       queue1= queue2;
       return a;
    }



    public static void main(String[] args) {

        Stack_Using_Queues queue= new  Stack_Using_Queues();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());


    }
}
