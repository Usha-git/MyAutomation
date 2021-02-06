package CoreJavaBasics;

public class ChildDemo extends parentDemo {
	
	public ChildDemo()
	{
		super();
		System.out.println("I m child class constructor");
	}
	
	String name="naik";
	
	public void getStringName()
	{
		
		System.out.println(name);// return local variable i.e child object
		System.out.println(super.name);// get from parent class
		//to differentiate between parent and child variable and method we can use super keyword
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd=new ChildDemo();
		cd.getStringName();
				

	}

}
