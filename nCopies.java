import java.util.*;
public class nCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		s1 = scan.nextLine();
		int n= s1.length();
		String a = " ";	//To store the substring
		s1=s1.substring(0,2);
		for(int i=0;i<n;i++)
		{
			a=a+s1;
		}
		System.out.println(a.trim());	//A space was being included hence I used the trim method in the String.
	}
	
}
