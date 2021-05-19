package interfaceTest;

public class MyClass implements InterfaceSupperClassTwo {   //implements 
	
	public void methodOne()
	{
		System.out.println("Implimenting method one");
	}
	
	public void methodTwo()
	{
		System.out.println("Implementing method two");
	}
	public static void main(String[] args) {
		
		InterfaceSupperClassTwo obj=new MyClass();
		obj.methodOne();
		obj.methodTwo();
		
	}
}
