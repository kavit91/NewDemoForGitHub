package covarient;

public class RBI {
	
	public RBI getObject()
	{
		RBI obj=new RBI();
		return obj;
	}
	
	public Integer getNum()
	{
		return 10;
	}
	
	public static void add()
	{
		System.out.println("add -- RBI");
	}
	
	public static void main(int num)
	{
		System.out.println("main form RBI");
	}

}
