package encapsulationDemo;

public class Atm {
	
	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		b.setNewPin(123456789, 1234, 4321);
		b.withDrowAmount(123456789, 4321, 5000);
		
		
		
	}
	

}
