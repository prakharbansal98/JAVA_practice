package com.company;
/*Write a C program to find maximum between two numbers.
Write a C program to find maximum between three numbers.
Write a C program to check whether a number is negative, positive or zero.
Write a C program to check whether a number is divisible by 5 and 11 or not.
Write a C program to check whether a number is even or odd.
Write a C program to check whether a year is leap year or not.
Write a C program to check whether a character is alphabet or not.
Write a C program to input any alphabet and ch*/
public class Main {
 static String odd_even(int num)
 {
     if(num % 2 == 1) {
         System.out.println(num + " is odd");
         return "odd";
     }
     else {
         System.out.println(num + " is even");
         return "even";
     }
 };
 static void max(int a,int b)
 {
     if(a>b)
         System.out.println(a+ " is max");
     else if(a==b)
         System.out.println(a+"&"+b+ " is equal");
     else
         System.out.println(b+ " is max");
 }

    static void min(int a,int b)
    {
        if(a<b)
            System.out.println(a+ " is min");
        else if(a==b)
            System.out.println(a+"&"+b+ " are equal");
        else
            System.out.println(b+ " is min");
    }

    static void pos_neg_zero(int a)
    {
        if(a>0)
            System.out.println(a+ " is +ve");
        else if(a==0)
            System.out.println(a+ " is zero");
        else
            System.out.println(a+ " is -ve");
    }

    static boolean leapYear(int a)
    {
        if(a%4==0) {
            System.out.println(a + " is leap year");
            return true;
        }
        else
            System.out.println("nrml yr");
            return false;
    }

    static void alp_di_spe(char a)
    {
        if(a>='0' && a<='9')
            System.out.println(a+ " is digit");
        else if(a>='a' && a<='z')
            System.out.println(a+ "alphabet");
        else if(a>='A' && a<='Z')
            System.out.println(a+ "alphabet");
        else
            System.out.println(a+ "special char");
    }

    static void month_days(int a, int year) {
     if(a>12 || a<1)
         System.out.println(a+ " is not a valid case");
     else
        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
            System.out.println(a + "has 31 days");
        else if (a == 4 || a == 6 || a == 9 || a == 11)
            System.out.println(a + "has 30 days");
        else {
            if (leapYear(year))
            System.out.println(a + "has 29 days");
            else
            System.out.println(a + "has 28 days");
        }
    }
    static void max3Numbers(int a,int b, int c)
    {
        if(a>b && a>c)
            System.out.println(a+ " is max");
        else if(b>a && b>c)
            System.out.println(b+ " is max");
        else
            System.out.println(c+ " is max");
    }


    public static void main(String[] args) {
        // write your code here

       /* for (int i = 1; i<=12;i++)
        {
            month_days(i, 2021);
        }*/
        //month_days(13,1998);
        max3Numbers(14,15,10);


    }
}

