package listAndSet;

import java.util.HashMap;
import java.util.Iterator;

public class ListAndSetTest {

	public static void main(String[] args) {
		
//		List<String> list=new ArrayList<String>();
//		list.add("Kavit");
//		list.add("Wankhede");
//		list.add("Abc");
//		list.add("Kavit");
//		list.add(null);
//		list.add(null);
//		
//		System.out.println(list);
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
//		Set<String> set=new HashSet<String>();
//		set.add("Kavit");
//		set.add("wankhede");
//		set.add("Kavit");
//		set.add("wankhede");
//		set.add("Kavit");
//		set.add(null);
//		set.add(null);
//		
//		System.out.println(set);
		
//		String[] name=new String[5];
//		name[0]="Kavit";
//		name[1]="Wankhede";
//		name[2]="Sanjay";
//		name[3]="Wankhede";
//		name[4]="Sameer";
		
//		for(int i=0;i<name.length;i++)
//		{
//			System.out.println(name[i]);
//		}
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Kavit Wankhede");
		hm.put(2, "Sameer Deshmukh");
		hm.put(3, "Kavit Wankhede");

	//		System.out.println(hm);
//		System.out.println(hm.get(2));
		
		for(int i=1;i<=hm.size();i++)
		{
			System.out.println(hm.get(i));			
		}

		
		
		
	}
	
}
