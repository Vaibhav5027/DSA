package com.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DeclarationAndMethods {

	public static void main(String[] args) {
		//declaration
		HashMap<String,Object> map=new HashMap<String, Object>();
		//for adding element
		 map.put("akshay", 20);
		 map.put("sam", 30);
		
		//it will return the value
		 map.get("key");
		 
		 //it will gives value if present or return null
//		 remove the element from the map
		 map.remove("key");
		 
//		 it will check value is present or not
		 map.containsKey("key");
		 
//		 it will add element if and only if there no object available with the same keys
		 map.putIfAbsent("key", "value");
		 
//		 it will return the set of keys
		 Set<String> keySet = map.keySet();
//		 return only values
		 Collection<Object> values = map.values();
		 
//		 return all the values
		 Set<Entry<String, Object>> entrySet = map.entrySet();
	}

}
