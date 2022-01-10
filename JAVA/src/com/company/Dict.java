package com.company;

import java.util.*;

public class Dict {

    public static void countDays(Map<String,Integer> map){
        int count30=0, count31=0, count28=0, count29=0;

        for(Map.Entry<String, Integer> e: map.entrySet()){
            if(e.getValue()==30){
                count30++;
            }
            else if(e.getValue()==31){
                count31++;
            }
            else if(e.getValue()==28){
                count28++;
            }
            else if(e.getValue()==29){
                count29++;
            }
        }
        Map<Integer,Integer> map1=new HashMap<>();
        map1.put(30,count30);
        map1.put(31,count31);
        map1.put(28,count28);
        map1.put(29,count29);

       // for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(map1);
      //  }
    }

    public static Map<Character,Integer> frequencyMap(String str){
        Map<Character,Integer> map = new TreeMap<>();

        for(int i=0; i<str.length(); i++){
            Character n = str.charAt(i);

            if(n>='A' && n<='Z') {
                n = Character.toLowerCase(n);
            }
            map.put(n,map.getOrDefault(n,0)+1);
           /* if(map.containsKey(n)){
                int v= map.get(n);
                v++;
                map.put(n,v);
            }
            else
                map.put(n,1);*/
        }
        //System.out.println(map);
        return map;

    }
    public static  Map<Character,Integer> concatinateMaps(Map<Character,Integer> map, Map<Character,Integer> map1){
        Map<Character,Integer> cMap = new TreeMap<>();
        cMap=map;
        System.out.println(map +","+ map1);

        for(Map.Entry<Character,Integer> e:map1.entrySet()){
            Character k= e.getKey();
            if(cMap.containsKey(k)){
                int oldValue= cMap.get(k);
                int newValue= e.getValue();

                cMap.put(k, oldValue+newValue);
            } else{
                cMap.put(k, e.getValue());
            }

        }

        return cMap;
    }

    public static Map<String,Integer> wordFrequencyMap(String str) {
        Map<String, Integer> map = new TreeMap<>();
        List<String> words = Arrays.asList(str.split("\\s+")) ;

        System.out.println(words);

        for (String n: words) {
            n = n.replaceAll("[^\\w]", "");
            map.put(n,map.getOrDefault(n,0)+1);
            /*if (map.containsKey(n)) {
                int v = map.get(n);
                v++;
                map.put(n, v);
            } else
                map.put(n, 1);*/
        }
        System.out.println(map);
        return map;
    }

    public static Map<Integer,ArrayList<String>> invertDictionary(Map<String,Integer> map){

        Map<Integer,ArrayList<String>> map1= new HashMap<>();

        for (Map.Entry<String, Integer> e:map.entrySet()){
            int v=e.getValue();
            String k=e.getKey();

            if(map1.containsKey(v)==false) {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(k);
                map1.put(v, arr);
            } else {
                map1.get(v).add(k);
           //     ArrayList<String> arr = map1.get(v); //31 [jan]
             //   arr.add(k); // [jan, mar]
               // map1.put(v, arr);  //31, [jan,mar]
            }
            System.out.println(map1);
        }
        System.out.println(map1);
        return map1;
    }



    public static void main(String[] args) {
        TreeMap<String,Integer> map= new TreeMap<>();
        map.put("Jan",31);
        if(Main.leapYear(2021)==true)
            map.put("Feb",29);
        else
            map.put("Feb",28);
        map.put("Mar",31);
        map.put("Apr",30);
        map.put("May",31);
        map.put("Jun",30);
        map.put("Jul",31);
        map.put("Aug",31);
        map.put("Sep",30);
        map.put("Oct",31);
        map.put("Nov",30);
        map.put("Dec",31);



     /*   System.out.println(map.get("Mar"));
        System.out.println(map.containsKey("mar"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.entrySet());

        for (Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+ " has "+ e.getValue() + " days.");
        }

        countDays(map);


        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Jan",1);
        map1.put("Feb",2);
        Map<String,Integer> map2 = new HashMap<>();
        map2.putAll(map);
        map2.putAll(map1);
        System.out.println(map2);


        System.out.println(map.get("Jun"));


        Map<Character,Integer> map3= frequencyMap("aabcdeabc");
        System.out.println(map3);

        Map<Character,Integer> map4= frequencyMap("PrakharSshantanu");
        System.out.println(map4);

        Map<Character,Integer> map5 = concatinateMaps(map3,map4);
        System.out.println(map5);

        map5.remove('a');
        System.out.println(map5);

        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(1);
        arr2.add(4);
        arr2.add(9);
        arr2.add(16);
        arr2.add(25);

        Map<Integer,Integer> map6 = new LinkedHashMap<>();

        for(int i=0; i<arr1.size();i++){
            map6.put(arr1.get(i),arr2.get(i));
        }
        System.out.println(map6);

        String s="Most of the Indian subcontinent was conquered by the Maurya Empire during the 4th and 3rd centuries BCE. From the 3rd century BCE onwards Prakrit and Pali literature in the north and the Tamil Sangam literature in southern India started to flourish.[6][7] Wootz steel originated in south India in the 3rd century BCE and was exported to foreign countries.[8][9][10] During the Classical period, various parts of India were ruled by numerous dynasties for the next 1,500 years, among which the Gupta Empire stands out. This period, witnessing a Hindu religious and intellectual resurgence, is known as the classical or \"Golden Age of India\". During this period, aspects of Indian civilisation, administration, culture, and religion (Hinduism and Buddhism) spread to much of Asia, while kingdoms in southern India had maritime business links with the Middle East and the Mediterranean. Indian cultural influence spread over many parts of Southeast Asia, which led to the establishment of Indianised kingdoms in Southeast Asia (Greater India).";
        System.out.println(frequencyMap(s));
        s=s.toLowerCase();
        wordFrequencyMap(s);       */


        invertDictionary(map);




    }
}
