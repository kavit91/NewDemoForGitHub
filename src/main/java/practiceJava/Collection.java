package practiceJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Collection {
	
	public static void main(String[] args) {
		
			List<String> list=Arrays.asList("Kavit","Ram","Sham","Ganesh","Baban","Ankush","Chetan","Zoravar","Pradeep","Kavit");
			System.out.println(list);
			
			Map<Integer,String> hm=new HashMap<>();
			for(int i=0;i<list.size();i++)
			{
				hm.put(i+1, list.get(i));
			}
			
			System.out.println(hm);
			
			TreeSet ts=new TreeSet();
			for(int i=0;i<list.size();i++)
			{
//				ts.add(list.get(i));
				
			}
			System.out.println(ts);
	}

}
