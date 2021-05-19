package listAndSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDublicateCharectre {
	
	public static void main(String[] args) {
		
		String name="Krishna Sakinala";
		char[] chars=name.toLowerCase().toCharArray();
		
		Map<Character,Integer> charMap=new HashMap<>();
		
		for(Character ch:chars)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		Set<Character> keys=charMap.keySet();
		for(Character ch:keys)
		{
			if(charMap.get(ch)>1)
			{
				System.out.println(ch+"    "+charMap.get(ch));
			}
		}
	}

}
