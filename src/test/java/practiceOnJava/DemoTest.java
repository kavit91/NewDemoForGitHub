package practiceOnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoTest{
	
	public static void main(String[] args) {
		
		
//		List<String> list=new ArrayList<>();
//		list.add("My");
//		list.add("Name");
//		list.add("Is");
//		list.add("Kavit");
//		System.out.println(list);
//		
//		Collections.sort(list);
//		System.out.println(list);
	
		String name="My name is Kavit";
		System.out.println(name);
		String[] list=name.toLowerCase().split(" ");
		
		List<String> sr=new ArrayList<String>();
		for(int i=0;i<list.length;i++)
		{
			sr.add(list[i]);
		}

		System.out.println(sr);
		Collections.reverse(sr);
		System.out.println(sr);
		
		

//		List<Integer> list=new ArrayList<>();
//		
//		Collections.addAll(list, 10,20,25,90,35,70,15);
//	
//		System.out.println(list);
//		System.out.println(Collections.max(list));
//		System.out.println(Collections.min(list));
//		
//		Collections.sort(list);
//		System.out.println(list);
		
	}
}
