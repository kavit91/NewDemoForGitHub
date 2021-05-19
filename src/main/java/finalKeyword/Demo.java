package finalKeyword;

public class Demo {
	 
	
	int empid;
	String name;
	static String company="Softecth";
	
	void employee(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}
	

}
