package encapsulationDemo;

public class Bank {
	
	private int acountNum=123456789;
	private int pinCode=1234;
	private double balance=10000;
	
	public void withDrowAmount(int acNo,int pin,int withdrow)
	{
		if(acountNum==acNo && pinCode==pin)
		{
			if(balance>=withdrow)
			{
				balance=balance-withdrow;
				System.out.println("Amount withdrow is : "+withdrow);
				System.out.println("Balance Left is : "+balance);
			}
			else
			{
				System.out.println("Insuficient amount");
			}
		}
		else
		{
			System.out.println("Invalid Credencial");
		}
	}
	
	public void setNewPin(int acNo,int oldPin,int newPin)
	{
		if(acountNum==acNo && pinCode==oldPin)
		{
			pinCode=newPin;
			System.out.println("Pin change successfully");
		}
		else
		{
			System.out.println("Invalid Cridential");
		}
	}

}
