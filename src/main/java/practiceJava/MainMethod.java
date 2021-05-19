package practiceJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMethod {
	
	public static void main(String[] args) {
		
		String name="krishna sakinala";
		char[] ch=name.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(Character chr:ch)
		{
			if(map.containsKey(chr))
			{
				map.put(chr, map.get(chr)+1);
			}
			else
			{
				map.put(chr, 1);
			}	
		}
		
		Set<Character> keys=map.keySet();
		{
			for(Character k:keys)
			{
				if(map.get(k)>1)
				{
					System.out.println(k+"    "+map.get(k));
				}
			}
		}
		
	}

}
