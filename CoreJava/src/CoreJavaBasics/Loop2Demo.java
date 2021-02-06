package CoreJavaBasics;

public class Loop2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<5	;i++)//outer for loop...this block will execute 4 times 4*4 we will execute 16 times
			
		{
			//System.out.println("Outer Loop Started");
			for(int j=1;j<=i;j++)//inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
			

	}

}
