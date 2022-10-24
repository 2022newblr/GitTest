import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String s="tarun";
		String rev="";
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s=s1.nextLine();
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
      System.out.println(rev);
	}

}
