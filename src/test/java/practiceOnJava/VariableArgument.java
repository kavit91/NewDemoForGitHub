package practiceOnJava;

public class VariableArgument {

	
	public void addition(int... a)
	{
		int total=0;
		for(int i=0;i<a.length;i++)
		{
//			total=total+a[i];
			System.out.println(a[i]);
		}
		System.out.println(total);
	}
	public static void main(String[] args) {
		
		VariableArgument va=new VariableArgument();
		va.addition(10,23,23,43,54,56,56);
	}
}
