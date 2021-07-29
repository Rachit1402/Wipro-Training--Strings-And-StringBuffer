import java.util.*;
public class StringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = scan.nextLine();
		System.out.println("Enter the second string: ");
		String s2 = scan.nextLine();
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		StringBuffer sb = new StringBuffer(s1);
		
		if(s1.charAt(s1.length()-1) == s2.charAt(0))
		{
			sb.append(s2.substring(1,s2.length()));
		}
		else {
			sb.append(" "+ s2);
		}
		System.out.println(sb);
	}

}
