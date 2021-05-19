package randomString;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String name="My name is Kavit";
		System.out.println(name);
		String[] words=name.split(" ");
		
//		StringBuffer sb=new StringBuffer(name);
		String revString="";
		
//		System.out.println(sb.reverse());
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
			StringBuffer sb=new StringBuffer(words[i]);
			revString=revString+sb.reverse()+" ";	
		}
		System.out.print("\n"+revString);
		
		
	}
}
