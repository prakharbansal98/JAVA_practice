package com.company;

public class Two_Stacks_DynamicSize {

    int size=10, top1=-1,top2=10 ;
    int[] s;

    Two_Stacks_DynamicSize(){
        s= new int[size];
    }
    public void push1(int a){
       if(top1+1==top2) {
           System.out.println("Stack is full");
       } else{
           top1++;
           s[top1] = a;
       }
    }

    public void pop1(){

        if(top1==-1) {
            System.out.println("Stack is empty");
        } else {
            top1--;
        }
    }
    public void print1(){
        System.out.print("s1 :");

        for(int i=0; i<=top1; i++){
            System.out.print(s[i]+"\t");
        }
        System.out.println();

    }

    public void push2(int a){
        if(top1+1==top2) {
            System.out.println("Stack is full");
        } else{
            top2--;
            s[top2] = a;
        }
    }

    public void pop2(){

        if(top2==size) {
            System.out.println("Stack is empty");
        } else {
            top2++;
        }
    }
    public void print2(){
        System.out.print("s2 :");

        for(int i=size-1; i>=top2; i--){
            System.out.print(s[i]+"\t");

        }
        System.out.println();
    }

    public static void main(String[] args) {

        Two_Stacks_DynamicSize twoS = new Two_Stacks_DynamicSize();
       twoS.pop1();

        twoS.push1(1);
        twoS.push1(2);
        twoS.push1(3);
        twoS.push1(4);
        twoS.push1(5);
        twoS.push1(6);
        twoS.push1(7);

        twoS.print1();

        twoS.push2(1);
        twoS.push2(2);
        twoS.push2(3);
        twoS.push2(4);
        twoS.push2(5);


        twoS.print2();

        twoS.pop1();
        twoS.pop2();
        twoS.print1();
        twoS.print2();

        twoS.push2(4);
        twoS.push2(5);
        twoS.print1();
        twoS.print2();



    }
}
