package CoreJavaBasics;

class Demo
{
	private int a=4;
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a=a;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
	
		Demo d=new Demo();
		System.out.println(d.getA());
		d.setA(22);
		System.out.println(d.getA());
	

	}

}
