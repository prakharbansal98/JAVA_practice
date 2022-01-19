package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Stacks {

    int size, top;
    ArrayList<Character> s;
    Stacks(){
        size=4;
        top=-1;
        s= new ArrayList<>(size);
    }
    public void push(Character a){
        s.add(a);
        System.out.println(s);
        top++;
    }

    public Character pop(){

        if(top==-1) {
            System.out.println("Stack is empty");
            return null;
        }

        else {
            Character a = s.get(top);
            s.remove(top);
            top--;

            return a;
        }
    }


    public Character peek(){
        return s.get(top);
    }

    public Boolean validParathesis(String str){

        Stack<Character> s = new Stack<>();

        for(Character c:str.toCharArray()){
            if(c=='('){
                s.push(c);
            } else {
                if(s.isEmpty()==true){
                    return false;
                }
                s.pop();
            }

        }
        if(s.isEmpty()){
            return true;
        }
        return false;

    }

    public Boolean isPalindrome(String str){

        Stack<Character> s = new Stack<>();

        for(Character c:str.toCharArray()) {
            s.push(c);
        }

        String str1="";

        while (s.isEmpty()==false){
            str1 += String.valueOf(s.pop());
        }
        System.out.println(str1);

        return str==str1;

    }

    public static void main(String[] args) {

        Stacks stk = new Stacks();
        stk.push('a');
        stk.push('b');
        stk.push('c');
        stk.push('d');
        stk.push('e');
        stk.push('f');


         stk.pop();
        System.out.println(stk.s);
        stk.pop();
        System.out.println(stk.s);
        stk.pop();
        System.out.println(stk.s);
        stk.pop();
        System.out.println(stk.s);
        stk.pop();
        System.out.println(stk.s);

        System.out.println(stk.validParathesis("((()))"));
        System.out.println(stk.validParathesis("((())"));
        System.out.println(stk.validParathesis("((())))"));

        stk.isPalindrome("maam");
        System.out.println(stk.isPalindrome("naman"));
    }
}
