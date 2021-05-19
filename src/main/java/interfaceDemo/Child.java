package interfaceDemo;

public class Child implements InterfaceA,InterfaceB {

	@Override
	public void show() {
		System.out.println("this is show method form child class");
		
	}
	
	public static void main(String[] args) {
		
		InterfaceB obj=new Child();
		obj.show();
	}

}
