package practiceJava;

import java.util.HashMap;

public class Damo {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("Maharashtra", "Mumbai");
		map.put("Sikkim","Gangatok");
		map.put("Gujrat", "Gandhi Nagar");
		
		
		for(String state : map.keySet())
		{
			System.out.println(map.get(state));
			
		}
		 
//		for(String capital : map.keySet())
//		{
//			System.out.println("capital"+" "+capital);
//		}
//		
//		System.out.println(map);
		
	}

}


	