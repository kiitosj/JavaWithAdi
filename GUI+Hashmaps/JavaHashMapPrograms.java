package com.company;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class JavaHashMapPrograms {

    public static void main(String[] args)
    {
        //Creating HashMap with default initial capacity and load factor

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //Inserting key-value pairs to map using put() method

        map.put("ONE", 11);
        map.put("TWO", 22);

        map.put("THREE", 33);

        map.put("FOUR", 44);

        map.put("FIVE", 55);

        //Printing key-value pairs

        Set<Entry<String, Integer>> entrySet = map.entrySet();

        for (Entry<String, Integer> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("-------------------------");

        //Creating another HashMap

        HashMap<String, Integer> anotherMap = new HashMap<String, Integer>();

        //Inserting key-value pairs to anotherMap using put() method

        anotherMap.put("SIX", 66);

        anotherMap.put("SEVEN", 77);

        //Inserting key-value pairs of map to anotherMap using putAll() method

        anotherMap.putAll(map);

        //Printing key-value pairs of anotherMap

        entrySet = anotherMap.entrySet();

        for (Entry<String, Integer> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

