package threadInJava;

public class MainMehod {
	
	public static void main(String[] args) {
	
		Demo1 obj=new Demo1();
		Thread th=new Thread(obj);
		th.start();
		th.start();
	}

}
