package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoTest {
	
//	public static List<Object> convertArrayToList(Object[] num)
//	{
//		List<Object> list=new ArrayList<Object>();
//		for(Object t:num)
//		{
//			list.add(t);
//		}
//		return list;
//	}
//	
	public static void main(String[] args) {
		
//		Integer[] num= {10,23,45,6,75};
//		List<Object> list=Arrays.stream(num).collect(Collectors.toList());
//		System.out.println(list);
//		
//		List<Integer> l1=Lists.newArrayList(num);
//		System.out.println(l1);
//		
//		List<Integer> l2=Arrays.asList(num);
//		System.out.println(l2);
		
//		String[] name= {"Kavit","Sanjay","Wankhede","Kavit"};
		
//		List<String> s1=Arrays.asList(name);
//		System.out.println(s1);
//		
//		ArrayList<String> s2=(ArrayList<String>) Lists.newArrayList(name);
//		System.out.println(s2);
//		
//		LinkedList<String> s3=(LinkedList<String>)Arrays.asList(name);
				
//		String[] name= {"Kavit","Sanjay","Wankhede","Kavit"};
		
//		ArrayList<String> lst=(ArrayList<String>)Lists.newArrayList(name);
//		System.out.println(lst);
//		Set<String> hs=new HashSet<>(lst);
//		System.out.println(hs);

//		Set<String> set=new HashSet<String>(Arrays.asList(name));
//		System.out.println(set);		
//		List<String> lst=new ArrayList<String>(set);
//		System.out.println(lst);
		
//		List<String> lst=new ArrayList<String>(Arrays.asList(name));
//		Arrays.sort(name);
//		System.out.println(Arrays.toString(name));
//		System.out.println(lst);
//		
//		Set<String> set=new HashSet<String>(lst);
//		System.out.println(set);
		
		String[] string= {"Dog","Elephant","Apple","Ball","Cat","Cat","Dog"};
//		System.out.println(Arrays.toString(string));
		
//		Arrays.sort(string);
//		System.out.println(Arrays.toString(string));
		
		List<String> list=new ArrayList<String>(Arrays.asList(string));
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
		
//		Set<String> set=new HashSet<String>(Arrays.asList(string));
		Map<String,Integer> hm=new HashMap<>();
		
		for(String sr:list)
		{
			if(hm.containsKey(sr))
				hm.put(sr, hm.get(sr)+1);
			else
				hm.put(sr, 1);
		}
		
		for(String sr:hm.keySet())
			System.out.println(sr+"---"+hm.get(sr));
		
		
		
		
	
		
	}

	
}

