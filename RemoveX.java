import java.util.*;
public class RemoveX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scan.nextLine();
		String a=" ";
		if(s1.charAt(0) == 'x' || s1.charAt(s1.length()-1) == 'x')
		{
			a=s1.substring(1,s1.length()-1);
		}
		else {
			a=s1;
		}
		System.out.println(a);
	}
}