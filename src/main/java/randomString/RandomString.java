package randomString;

import java.util.Random;

public class RandomString {
	
	public static void main(String[] args) {
		
		
//		Random ran=new Random();
//		String data="";
//		int length=5;
//		for(int i=0;i<length;i++)
//		{
//			data=data+(char)(ran.nextInt(26)+97);
//		}
//		System.out.println(data);
//		
//		int num=0;
//		for(int i=0;i<2;i++)
//		{
//			num=num+(int)(ran.nextInt(15));
//		}
//		System.out.println(num);
//		
//		System.out.println(data+num+"@gmail.com");
		
		
		String name="    Kavit Wankhede    ";
		System.out.println("Length of String is : "+name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.substring(0,10).trim());
		System.out.println(name.contains("Kavit"));
		System.out.println(name.contains("Kavita"));
		System.out.println(name.replace("Kavit", "Kaviraj"));
		System.out.println(name.equals("Equal to method"+"Kavit"));
		System.out.println(name.equalsIgnoreCase("Kavit wankhede"));
		System.out.println(name.equalsIgnoreCase("    kavit wankhede    "));
		System.out.println(name.concat("Sanjay Bhimrao"));
		System.out.println(name.charAt(10));
		
	}

}
