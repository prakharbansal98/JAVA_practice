package com.company;

public class Str {

    static void vowelConsonents(String s){
        int flag=0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                flag++;
            }

        }
        System.out.println("there are "+flag+ "num of vowles.");
        System.out.println(s.length()-flag+" are num of consonents.");
    }

    static void replaceAwith$(String s) {
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a') {
                s1=s1+'$';
            } else{
                s1=s1+c;
            }
        }
        System.out.println(s1);
    }

    static void replace1WithLast(String s){
        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);
        System.out.println(last+s.substring(1,s.length()-1)+first);

    }
    static boolean isSubString(String sub, String s){
        int i=s.indexOf(sub.charAt(0));

        while(i>=0)
        for(int j=0;j<sub.length();j++,i++){
            System.out.println(i+","+j);
            if(s.charAt(i)!=sub.charAt(j)){

                return false;
            }
        }
        return true;
    }


        // Non primitive data
        public static void main(String[] args) {
            String s = "prakhar";
            int a = 10;

            System.out.println(s.length());

            System.out.println(s.equals("Sshantanu"));
            System.out.println(s.equalsIgnoreCase("Sshantanu"));

            System.out.println(s.compareTo("prakhar"));

            System.out.println(s.startsWith("ssh"));

            System.out.println(s.indexOf('a'));
            System.out.println(s.lastIndexOf('a'));



            System.out.println(s.substring(5,s.length()));


            System.out.println(s.concat(" agarwal"));

            System.out.println(s);

            String s1 = s.replace('a','b');
            System.out.println(s1);

            System.out.println(s.trim());
            System.out.println(s);

            for(int i = 0; i < s.length(); i++) {
                System.out.println( s.charAt(i) );
            }

            vowelConsonents(s);
            replaceAwith$(s);
            System.out.println(s.replace('a','$'));
            replace1WithLast(s);
            System.out.println(isSubString("khb",s));


        }
    }

