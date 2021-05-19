package practiceJava;

public class FindGreatestNumber {

	public static void main(String[] args) {
		
//		int[] num= {12,23,34,45,56,78,45,67,43,23,6,84,97,56,45,23};
//		int tem=num[0];
		
		String[] num= {"avc","bcr","gfg","sgd","dfew","hte","erg","ouy"};
		String tem=num[0];
//		String name="Kavit";
//		char[] num=name.toLowerCase().toCharArray();
//		char tem=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i].compareTo(num[j])>0)
				{
					tem=num[i];
					num[i]=num[j];
					num[j]=tem;
				}
			}
		}
		for(String i:num)
			System.out.print(i+" ");
		
	}
}
