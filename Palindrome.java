import java.util.*;
public class Palindrome {
	public static String isPalindrome(String str)
	{
		StringBuffer scan = new StringBuffer(str);
		scan.reverse();
		String rev = scan.toString();
		if(str.equals(rev)) {
			return (str+" is a Palindrome string");
		}
		else {
			return (str+" is not a Palindrome string");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scan.nextLine();
		System.out.println(isPalindrome(str));
	}

}
