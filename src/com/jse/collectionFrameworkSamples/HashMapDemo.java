package com.jse.collectionFrameworkSamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo{
@SuppressWarnings({ "unused", "unchecked" })
public static void main(String[] args) {
	
Map hashMap = new HashMap<String,Integer>();

hashMap.put("Vikram", 75);
hashMap.put("Sagar", 80);
hashMap.put("Siva", 90);
System.out.println("The Size of the Map is:\t"+hashMap.size());
System.out.println("Map elements are:\t"+hashMap);

if(hashMap.containsKey("Vikram")) {
	Integer result = (Integer) hashMap.get("Vikram");
	System.out.println("Rant for vikram is:\t"+result);
}
else
{
	System.out.println("Searching Key is not found in the HashMap");
}

// 1.Default HashMap Constructor
Map hashMapDefaultConstructor = new HashMap<String,Integer>(); // initialCapacity 16 and load factor 0.75

//2.Specific intialCapacity HashMap Constructor
Map specificInitialCapacity = new HashMap<String,Integer>(10);// intialCapacity 10 and load factor 0.75

//3.HashMap with both intial Capacity and load factor
Map intialCapcityAndloadfactor = new HashMap<String,Integer>(3,0.5f);

//4.HashMap passing Map as parameter
Map map = new HashMap<String,Integer>(hashMapDefaultConstructor);


	
}
}
