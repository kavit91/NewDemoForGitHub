package inheritance;

import java.util.Random;

public class MainMethod {
	
	public static void main(String[] args) {
		
//		ClassA a=new ClassA();
//		a.addition("kavit","wankhede","sanjayrao","rahanar","sindhi","meghe","wardha ");
//		
//		int num1=ClassA.a=19;
//		System.out.println(num1);
//		int num2=ClassA.a=20;
//		System.out.println(num2);
		
		
//		
		int ranNum=0;
		
		for(int i=0;i<2;i++)
		{
			double d=Math.random()*9;
			ranNum=ranNum*10+(int)d;
			
		}
//		System.out.println(ranNum);
	
		Random r=new Random();
		int num=0;
		for(int i=0;i<2;i++)
		{
			num=num+r.nextInt(11);
		}
		String data="";
		for(int i=0;i<5;i++)
		{
			data=data+(char)(r.nextInt(26)+97);
		}
		System.out.println(data+"@"+num+"gmail.com");
	
		
		
		
		
	}

}
