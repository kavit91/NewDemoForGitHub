package inheritanceSingleMutiple;

public class C extends B {

	void method2()
	{
		System.out.println("This is method 1 from classC");
	}
	void method2(String name)
	{
		System.out.println("This is parameterized method form classC");
	}
	
	C()
	{
		System.out.println("This is constructor from classC");
	}
	
	C(String name)
	{
		System.out.println("This is parametrized constructor from classC");
	}
}
