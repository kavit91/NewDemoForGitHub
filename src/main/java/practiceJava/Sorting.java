package practiceJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {

		public static void main(String[] args) {
			
			System.out.println("---------List-------------------------");
			
			String[] names=new String [5];
			names[0]="kavit";
			names[1]="kavit";
			names[2]=null;
			names[4]=null;
			names[3]="kavit";
			for(int i=0;i<=4;i++)
			{
				System.out.println(names[i]);
			}
		System.out.println("--------------------------ArrayList------------------------------------------");	
			List<String> name=new ArrayList<String>();
			name.add("Kavit");
			name.add("Saharuk");
			name.add("Kavit");
			name.add("Saharuk");
			name.add("Kavit");
			name.add(null);
			name.add(null);
			name.add(null);
			
			for(String n:name)
				System.out.println(n);
			System.out.println("-----------------------------HashSet()--------------------------------------------");
			
			
			Set<String> uname=new HashSet<>();
			uname.add("Kavit");
			uname.add("Kavit");
			uname.add("Kavit");
			
			uname.add(null);

			uname.add(null);
			uname.add("Sameer");
			uname.add("Ketan");
			uname.add("Sonam");
			uname.add("Vikram");
			for(String un:uname)
				System.out.println(un);
			
System.out.println("----------------------------------HashMap()----------------------------------------");
			
			Map<Integer,String> hm=new HashMap<>();
			hm.put(1, "Sameer");
			hm.put(3, "kapil");
			hm.put(5, null);
			hm.put(9, "kapil");
			hm.put(4, "Kanchan");
			hm.put(4, null);
			hm.put(null, "Kanchan");
			hm.put(null, "Baban");
			hm.put(4, null);
			for(Object i:hm.keySet())
				System.out.println(i+"   "+hm.get(i));
System.out.println("-----------------------------TreeSet--------------------------------------");
			String n="kavit";
			System.out.println(n);
			char[] ch=n.toLowerCase().toCharArray();
			
			TreeSet t=new TreeSet();
			for(int i=0;i<ch.length;i++)
			{
				t.add(ch[i]);
			}
			System.out.println(t);
		}
}
