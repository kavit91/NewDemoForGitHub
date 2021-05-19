package practiceJava;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
	
public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Mumbai");
		map.put(4,"Gangatok");
		map.put(3, "Gandhi Nagar");
		map.put(31, "Radha Nagar");
		map.put(12, "Goom Nagar");
		map.put(52, "Samta Nagar");
		
		
		
		for(int state : map.keySet())
		{
			System.out.println(state+"   "+map.get(state));
			
		}
		System.out.println("After sorting");
		TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (map); 
		for(int state : tm.keySet())
		{
			System.out.println(state+"   "+tm.get(state));
			
		}
		
 	}

}
