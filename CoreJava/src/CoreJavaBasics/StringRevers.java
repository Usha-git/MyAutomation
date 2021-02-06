package CoreJavaBasics;

public class StringRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="madam";//
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);
		if(s==t)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
