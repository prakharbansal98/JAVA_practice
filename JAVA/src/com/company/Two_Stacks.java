package com.company;

import java.util.ArrayList;

public class Two_Stacks {

    int size=10, top1=5,top2=4 ;

    int[] s;
    Two_Stacks(){
        s= new int[size];
    }
    public void push1(int a){
        top1--;
        s[top1]=a;
    }

    public void pop1(){

        if(top1==5) {
            System.out.println("Stack is empty");
        } else {
            top1++;
        }
    }
    public void print1(){
        for(int i=top1; i<=4; i++){
            System.out.print(s[i]+"\t");
        }
    }

    public void push2(int a){
        top2++;
        s[top2]=a;
    }

    public void pop2(){

        if(top2==4) {
            System.out.println("Stack is empty");
        } else {
            top2--;
        }
    }
    public void print2(){
        for(int i=5; i<=top2; i++){
            System.out.print(s[i]+"\t");
        }
    }

    public static void main(String[] args) {

        Two_Stacks twoS = new Two_Stacks();
        twoS.push1(1);
        twoS.push1(2);
        twoS.push1(3);
        twoS.push1(4);
//        twoS.push1(5);

        twoS.print1();

        twoS.push2(1);
        twoS.push2(2);
        twoS.push2(3);
        twoS.push2(4);
//        twoS.push2(5);

        twoS.print2();


    }
}
