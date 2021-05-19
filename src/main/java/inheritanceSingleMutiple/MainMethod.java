package inheritanceSingleMutiple;

public class MainMethod {
	
	public static void main(String[] args) {
		System.out.println("---------------Creating object of A Class-------------------------");	
		A a=new A();
		a.method();
		a.method("Kavit");
		System.out.println("-----------------Creating object of B Class---------------");	
		B b=new B();
		b.method1();
		b.method1("Kavit");
		System.out.println("--------------Creating object of C Class-------------------");
		C c=new C();
		c.method2();
		c.method2("K");
		System.out.println("---------------Creating Single Level inheritance  Class B extends A  -----------------------");
		B sl=new B("kavit");
		sl.method();
		sl.method("kav");
		sl.method1();
		sl.method1("kavit");
		System.out.println("---------------Creating multi Level inheritance  Class C extends B  -----------------------");
		C ml=new C("A");
		ml.method();
		ml.method("kavit");
		ml.method1();
		ml.method1("A");
		ml.method2();
		ml.method2("K");

	}

}
