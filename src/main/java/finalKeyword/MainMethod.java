package finalKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test
	{
		void method()
		{
			try {
				int a=10;
				int b=0;
				System.out.println(a/b);
			}
			catch(Exception e)
			{
				System.out.println("This is first exception");
				e.printStackTrace();
			}
		}
		
		void method1()
		{
			System.out.println("This is printed after Arithmatic exception handle");
			int a=10;
			int b=5;
			System.out.println(a/b);
		}
		
		void method2()
		{
			
				try {
					String[] name = new String[4];
					System.out.println(name[5]);
				} catch (Exception e) {
					System.out.println("This is secound exception");
					e.printStackTrace();
				}
		}
		void method3()
		{
			System.out.println("This is printed after Null pointer exceptoin handle");
			int a=10;
			int b=5;
			System.out.println(a*b);
		}
		
		void method4() throws Exception
		{
		
				FileInputStream fis=new FileInputStream("./Files/kavit.tx");
				System.out.println("this is filenot found exceptoin");
			
		}
		
		void method6()
		{
			System.out.println("This is printed after file not found exceptoin handle");
			int a=10;
			int b=5;
			System.out.println(a*b);
		}
		
	}


public class MainMethod {
	
	public static void main(String[] args) {
		
			Test t=new Test();
			t.method();
			t.method1();
			t.method2();
			t.method3();
			try {
				t.method4();
			} catch (Exception e) {
				e.printStackTrace();
			}
			t.method6();
	}
	
	
	
	

}
