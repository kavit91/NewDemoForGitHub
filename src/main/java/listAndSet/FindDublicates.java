package listAndSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDublicates {
	
	public static void main(String[] args) {
		
//		int[] num= {12,43,45,23,56,23,67,234,7,44};
		
//		int tem=num[0];
		String[] num= {"Basdf","Csdf","Tsdf","Ksdfsd","Asdf"};
		String tem;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i;j<num.length;j++)
			{
				if(num[i].compareTo(num[j])>0)
				{
					tem=num[i];
					num[i]=num[j];
					num[j]=tem;
				}
			}
		}
		
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
