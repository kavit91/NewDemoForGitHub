package stringMethod;

public class StringMethod {

	public static void main(String[] args) {
		
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
