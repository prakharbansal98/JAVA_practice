//implement array using 2 queues

package com.company;

public class Two_Queues {
    int size=10, front1=0, front2=9, rear1=-1, rear2=10;
    int[] s;

    Two_Queues(){
        s= new int[size];
    }

    public void enqueue1(int a){
        if(rear1+1==rear2){
            System.out.println("Queue is full");
        } else {
            rear1++;
            s[rear1] = a;
        }
    }

    public void dequeue1(){
        if(rear1==-1){
            System.out.println("Queue is empty");
        } else
        front1++;
    }

    public void print1(){
        for(int i=front1; i<=rear1; i++){
            System.out.print(s[i]+"\t");
        }
    }


    public void enqueue2(int a){
       if(rear2-1==rear1){
           System.out.println("Queue is full");
       } else {
           rear2--;
           s[rear2] = a;
       }
    }

    public void dequeue2(){
        if(rear2==10){
            System.out.println("Queue is empty");
        } else
        front2--;
    }

    public void print2(){
        for(int i=front2; i>=rear2; i--){
            System.out.print(s[i]+"\t");
        }
    }


    public static void main(String[] args) {

        Two_Queues twoQ = new Two_Queues();

        twoQ.enqueue1(1);
        twoQ.enqueue1(2);
       // twoQ.print1();

        twoQ.dequeue1();
        twoQ.print1();

        twoQ.enqueue2(1);
        twoQ.enqueue2(2);
      //  twoQ.print2();

        twoQ.dequeue2();
        twoQ.print2();
    }
}
