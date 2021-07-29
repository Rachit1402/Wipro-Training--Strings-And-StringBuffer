import java.util.*;
public class FirstHalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scan.nextLine();
		String a=" ";
		int n=s1.length();
		if(n%2 != 0)
		{
			System.out.println("null");
		}
		else {
			a=s1.substring(0,n/2);
			System.out.println(a);
		}
	}
}
