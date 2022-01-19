package com.company;

public class Array1 {

    static void print(int a){
        System.out.println(a);

    }

    static void print(double a){
        System.out.println(a);

    }
    static void checkinput(int a)
    {
        if (a>=1 && a<=100)
            System.out.println("ok");
        else
            System.out.println("Out of range");
    }
     static void print(int[] arr){
        for(int i=0; i<arr.length; i++) {
            print(arr[i]);
        }
    }

    static void arrsum(int[] arr){
        int sum=0;
        int prod=1;
        double avg=0;
        for(int i=0; i<arr.length; i++) {
           sum= arr[i]+sum ;
           prod= arr[i] *prod;

        }
        print(sum);
        print(prod);
        print((double)sum/arr.length);
    }

    static void arrmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i])
            max= arr[i];
        }
        print(max);
    }
    static void arrmin(int[] arr){
        int min= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(min>arr[i])
                min= arr[i];
        }
        print(min);
    }

    static void countOddEven(int[] arr){
        int flagodd=0;
        int flageven=0;
        for(int i=0; i<arr.length; i++) {
            String value =Main.odd_even(arr[i]);
            if(value=="odd")
                flagodd++;
            else
                flageven++;
        }
        print(flagodd);
        print(flageven);

    }

    static void printRev(int[] arr){
        for(int i=arr.length-1; i>=0; i--) {
            print(arr[i]);
        }

    }

    static void swapping(int[] arr){
        int c=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=c;

        print(arr);
    }

    static void CountRepeated(int[] arr){
        int flag=1;
        int var=0;
        for(int i=0; i<arr.length; i++) {
            int n=arr[i];

            for(int j=i+1;j<arr.length; j++){
                int m=arr[j];
                if(n==m) {
                    flag++;
                    var=n;
                }
            }
            if(flag>1)
                break;
        }
        if(flag>1)
        System.out.println(var+" is repeated " +flag+ " times.");
        else
            System.out.println("no repeated elements");
    }

    static void chckSpecificNum(int[] arr, int n){
        boolean flag=false;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == n) {
                flag=true;
                System.out.println(n + " num found");
            }
        }
            if(flag==false)
                System.out.println(n+" num not found");

    }

    static void comapare(int[] arr, double n){
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>n)
                count++;
        }
        System.out.println("there are " +count+ " num greater than " +n+"." );
    }
    static double avg(int[] arr) {
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        avg=sum/arr.length;
        return avg;
    }
    static void greaterThanAvg(int[] arr){
        comapare(arr,  avg(arr));
    }

    public static void main(String[] args) {
      /*  Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        checkinput(a);
*/

        int[] arr={13,110,16,14,17};

        int[] arr2=arr;
        //arr2=arr;
       /* print(arr2);
        arrsum(arr2);
        arrmax(arr);
        arrmin(arr);
        countOddEven(arr);
        printRev(arr);
        swapping(arr);*/
       // CountRepeated(arr);
        //chckSpecificNum(arr,110);
      //  comapare(arr, 140);
        greaterThanAvg(arr);





    }
}
