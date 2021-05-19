package inheritanceSingleMutiple;

public class B extends A{
	
	void method1()
	{
		System.out.println("This is method 1 from classB");
	}
	void method1(String name)
	{
		System.out.println("This is parameterized method form classB");
	}
	
	B()
	{
		System.out.println("This is constructor from classB");
	}
	
	B(String name)
	{
		System.out.println("This is parametrized constructor from classB");
	}

}
