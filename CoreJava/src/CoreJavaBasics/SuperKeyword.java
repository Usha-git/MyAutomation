package CoreJavaBasics;
class Kitkat
{
	
void camera()
{
	System.out.println("Back Camera");
}
}
class Lolipop extends Kitkat
{
	

void camera()
{
	System.out.println("Frontcamera and Backcamera");
	super.camera();
}
}
public class SuperKeyword {
	

	public static void main(String[] args) {
		
		Lolipop l1=new Lolipop();
		l1.camera();
		// TODO Auto-generated method stub

	}

}
