package CoreJavaBasics;

public class constructorDemo {
	
	// constructor executes a block of code whenever the object is created
			//will not retirn values
			//name od the constructor should be the class name
	 public constructorDemo()//default constructor
	 {
		 System.out.println("I m in the constructor");
	 }
	 //Parameterized constructor
	 public constructorDemo(int a,int b)
	 {
		 System.out.println("i m in the parameterized  constructor");
		 int c=a+b;
		 System.out.println(c);
	 }
	 
	 public constructorDemo(String str)
	 {
		 System.out.println("i m in the parameterized  constructor");
		 System.out.println(str);
	 }
	 
	 public void getData()
	 {
		 System.out.println("I m the method");
	 }
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if u define any constructor java will not look for any default constructor
		constructorDemo cd=new constructorDemo();//default
		constructorDemo cp=new constructorDemo(4,5);//parameterized
		constructorDemo cs=new constructorDemo("Hello");// String
		// compiler will call default implicit constructor
		// whenever u just create object for the constructor it will be called
		

	}

}
