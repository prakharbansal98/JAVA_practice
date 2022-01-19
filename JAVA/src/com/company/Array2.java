package com.company;

import java.util.*;

    public class Array2 {
        public static void print(ArrayList<Integer> arr) {
            System.out.print("array: ");
            for(Integer  i:arr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        public static int arrsum(ArrayList<Integer> arr){
            int sum=0;
            for(Integer  i:arr){
                sum+=i;
            }
            System.out.println(sum+" = ");
            return  sum;
        }

        public static int  arravg(ArrayList<Integer> arr){
          int i =  arrsum(arr)/arr.size();
            System.out.println("average :"+i);
            return i;
        }

        public static int arrmax(ArrayList<Integer> arr){
            int max= Integer.MIN_VALUE;
            for(Integer i:arr){
                if(i>max)
                    max=i;
            }
            System.out.println("max:" + max);
            return max;
        }

        public static int arrmin(ArrayList<Integer> arr) {
            int min = Integer.MAX_VALUE;
            for (Integer i : arr) {
                if (i < min)
                    min = i;
            }
            System.out.println("min :"+ min);
            return min;
        }

        public static int[] countOddEven(ArrayList<Integer> arr){
            int odd=0;
            int even=0;
            for (Integer i:arr){
                if(i%2==0)
                    even++;
                else
                    odd++;
            }
            System.out.println("even :"+ even);
            System.out.println("odd :"+ odd);

            int[] count={odd,even};
            return count;
        }

        public static void printRev(ArrayList<Integer> arr){
            for(int i=arr.size()-1;i>=0;i--){
                System.out.print(arr.get(i) + "\t");
            }
          System.out.println();

        }

        public static boolean swapping(ArrayList<Integer> arr){
            int last =arr.size()-1;
            System.out.println("swapping :"+ arr.get(0)+"," + arr.get(last));
            int first = arr.get(0);
            arr.set(0,arr.get(last));
            arr.set(last,first);
            print(arr);
            return true;
        }

        public static void swapFullArrayList(ArrayList<Integer> arr){
            int firstIndex=0;
            int lastIndex =arr.size()-1; //5
            while(firstIndex<lastIndex){
                //System.out.println("swapping :"+ arr.get(0)+"," + arr.get(last));
                int first = arr.get(firstIndex); ///i=0, 1
                int last = arr.get(lastIndex);
                arr.set(firstIndex,last);
                arr.set(lastIndex,first);
                lastIndex--;
                firstIndex++;
            }

        }

        public static void dummy(int n){
           n=5;
        }

        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();

            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);


            print(arr);

           // arr.add(3, 99);
            print(arr);

          //  arr.add(5,67);


          //  arr.remove(4);
            print(arr);

          //  System.out.println(arr.indexOf(99));
         //   System.out.println(arr.indexOf(100));

          //  arr.add(100);
            print(arr);

            System.out.println(arr.indexOf(100));

         //   arr.set(4,101);

            print(arr);

            ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();
            print(arr2);

            System.out.println(arr.contains(1));
            System.out.println(arr.contains(10));

            arrsum(arr);
            arravg(arr);
            arrmax(arr);
             arrmin(arr);
           countOddEven(arr);
            //printRev(arr);
          //  swapping(arr);
            print(arr);
            swapFullArrayList(arr);
            print(arr);
            int n=4;
            dummy(n);
            System.out.println(n);

            arr.add(5,7);
            print(arr);
            arr.set(6,6);
            print(arr);

//            CountRepeated(arr);
//            chckSpecificNum(arr,110);
//            comapare(arr, 140);
//            greaterThanAvg(arr);

        }
    }

