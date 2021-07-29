import java.util.*;
public class ConcatenateShortLongShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = scan.nextLine();
		System.out.println("Enter the second string: ");
		String s2 = scan.nextLine();
		int n1 = s1.length();
		int n2 = s2.length();
		StringBuffer a = new StringBuffer();
		if(n1<n2) {
			a.append(s1).append(s2).append(s1);
		}
		else if(n1>n2)
		{
			a.append(s1).append(s2).append(s1);
		}
		System.out.println(a);
	}
}
