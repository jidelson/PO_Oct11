package com.revature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Launcher {

	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<Integer, String>();
		
		names.put(1, "Joe");
		names.put(2, "Kenny");
		names.put(3, "Jeffrey");
		names.put(4, "Miriam");
		names.put(5, "Snowy");
		
		for(Map.Entry<Integer, String> n: names.entrySet()) {
			System.out.println(n.getKey() + ") " + n.getValue());
		}
		
		
		Map<Integer, String> cities = new HashMap<Integer, String>();
		
		cities.put(01, "San Francisco");
		cities.put(02, "Oakland");
		cities.put(03, "Nashville");
		cities.put(04, "Memphis");
		cities.put(05, "Los Angeles");
		
		Iterator<Entry<Integer, String>> itr = cities.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> newMap = (Map.Entry<Integer, String>) 
					itr.next();
			System.out.println(newMap.getKey() + ") " + newMap.getValue());
		}
		
		

	}

}
